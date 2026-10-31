package p;

import com.spotify.core.http.HeaderSanitizer;
import com.spotify.core.http.HttpConnection;
import com.spotify.core.http.HttpConnectionDelegate;
import com.spotify.core.http.HttpOptions;
import com.spotify.core.http.HttpRequest;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.jvm.jni.NativeHelpers;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v7o implements HttpConnectionDelegate {
    public static final Set t = dm61.z0(new Integer[]{3, 5, 7, 8, 10});
    public static final Set u = dm61.z0(new String[]{Request.GET, "HEAD", "OPTIONS", "TRACE"});
    public final CronetEngine a;
    public final h8o b;
    public final yqg c;
    public final String d;
    public final xoe1 e;
    public final AtomicReference f;
    public final AtomicReference g;
    public volatile ScheduledFuture h;
    public final AtomicBoolean i;
    public volatile long j;
    public volatile voe1 k;
    public volatile jfv l;
    public volatile int m;
    public volatile String n;
    public HttpConnection o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HttpRequest f123p;
    public HttpOptions q;
    public String r;
    public final wqj0 s;

    public v7o(CronetEngine cronetEngine, h8o h8oVar, yqg yqgVar, String str) {
        o9x0 o9x0Var = o9x0.R0;
        this.a = cronetEngine;
        this.b = h8oVar;
        this.c = yqgVar;
        this.d = str;
        this.e = o9x0Var;
        this.f = new AtomicReference(t7o.a);
        this.g = new AtomicReference(null);
        this.i = new AtomicBoolean(false);
        this.s = new wqj0(new fnn(this, (byte) 14));
    }

    public final UrlRequest a(String str, HttpRequest httpRequest, HttpConnection httpConnection, HttpOptions httpOptions) {
        r7o r7oVar = new r7o(this, httpConnection, httpOptions);
        ScheduledExecutorService scheduledExecutorService = this.b.b;
        UrlRequest.Builder priority = this.a.newUrlRequestBuilder(str, r7oVar, scheduledExecutorService).setHttpMethod(httpRequest.getMethod()).setPriority(tto1.j(httpOptions.getPriority()));
        priority.setRequestFinishedListener(new s7o(this, this.s.a()));
        Map mapByteArrayToMap = NativeHelpers.Companion.byteArrayToMap(httpRequest.getHeaders());
        boolean z = httpOptions.getCachePolicy() != 0;
        for (Map.Entry entry : mapByteArrayToMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2.length() > 0 && (!z || !str2.equalsIgnoreCase("Cache-Control"))) {
                priority.addHeader(str2, HeaderSanitizer.INSTANCE.sanitizeValue(str3));
            }
        }
        priority.getClass();
        ArrayList arrayList = new ArrayList();
        int cachePolicy = httpOptions.getCachePolicy();
        if (cachePolicy == 1 || cachePolicy == 2) {
            arrayList.add("no-cache");
        } else if (cachePolicy == 3) {
            arrayList.add("max-stale=2147483647");
        } else if (cachePolicy == 4) {
            arrayList.addAll(p7h.M(new String[]{"only-if-cached", "max-stale=2147483647"}));
        }
        if (httpOptions.getSkipCacheStorage()) {
            arrayList.add("no-store");
        }
        if (!arrayList.isEmpty()) {
            priority.addHeader("Cache-Control", o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62));
        }
        if (tto1.q(httpRequest.getMethod())) {
            priority.setUploadDataProvider(new p7o(httpRequest.getBody()), scheduledExecutorService);
            Set setKeySet = mapByteArrayToMap.keySet();
            if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
                priority.addHeader("Content-Type", HttpConnection.kDefaultContentType);
            } else {
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    if (nhc1.S((String) it.next(), "Content-Type", true)) {
                    }
                }
                priority.addHeader("Content-Type", HttpConnection.kDefaultContentType);
            }
        }
        return priority.build();
    }

    @Override // com.spotify.core.http.HttpConnectionDelegate
    public final void abort() {
        if (pzm.p(this.f) || pzm.q(this.f)) {
            ScheduledFuture scheduledFuture = this.h;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            UrlRequest urlRequest = (UrlRequest) this.g.get();
            if (urlRequest != null) {
                urlRequest.cancel();
            }
        }
    }

    public final void b() {
        HttpConnection httpConnection = this.o;
        if (httpConnection == null) {
            u890.C("savedHttpConnection");
            throw null;
        }
        httpConnection.onComplete(true);
        voe1 voe1Var = this.k;
        this.l = voe1Var != null ? new jfv(voe1.a(voe1Var.a)) : null;
        this.s.b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    public final void c(t7o t7oVar, CronetException cronetException) {
        int i;
        HttpConnection httpConnection = this.o;
        if (httpConnection == null) {
            u890.C("savedHttpConnection");
            throw null;
        }
        if (t7oVar == t7o.d) {
            i = HttpConnection.kErrorHttpAborted;
        } else if (t7oVar == t7o.e) {
            i = HttpConnection.kErrorHttpTimeout;
        } else if (cronetException instanceof NetworkException) {
            NetworkException networkException = (NetworkException) cronetException;
            if (networkException.getErrorCode() == 4 || networkException.getErrorCode() == 6) {
                i = HttpConnection.kErrorHttpTimeout;
            } else {
                i = HttpConnection.kErrorHttpFail;
            }
        } else {
            i = HttpConnection.kErrorHttpFail;
        }
        httpConnection.onError(i);
        voe1 voe1Var = this.k;
        this.l = voe1Var != null ? new jfv(voe1.a(voe1Var.a)) : null;
        this.s.b();
    }

    public final void d(long j) {
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (j <= 0) {
            return;
        }
        this.h = this.b.b.schedule((Runnable) new u7o(this, (byte) 1), j, TimeUnit.MILLISECONDS);
    }

    public final boolean e() {
        t7o t7oVar = t7o.b;
        UrlRequest urlRequest = (UrlRequest) this.g.get();
        try {
            String str = this.r;
            if (str == null) {
                u890.C("savedUrl");
                throw null;
            }
            HttpRequest httpRequest = this.f123p;
            if (httpRequest == null) {
                u890.C("savedHttpRequest");
                throw null;
            }
            HttpConnection httpConnection = this.o;
            if (httpConnection == null) {
                u890.C("savedHttpConnection");
                throw null;
            }
            HttpOptions httpOptions = this.q;
            if (httpOptions == null) {
                u890.C("savedHttpOptions");
                throw null;
            }
            UrlRequest urlRequestA = a(str, httpRequest, httpConnection, httpOptions);
            if (this.f.get() != t7oVar) {
                urlRequestA.cancel();
                t7o t7oVarF = f();
                if (t7oVarF != null) {
                    c(t7oVarF, null);
                    return false;
                }
                return false;
            }
            urlRequestA.start();
            if (!pzm.m(this.g, urlRequest, urlRequestA)) {
                urlRequestA.cancel();
                return false;
            }
            if (this.f.get() == t7oVar) {
                return true;
            }
            urlRequestA.cancel();
            return false;
        } catch (IllegalArgumentException unused) {
            if (pzm.r(this.f)) {
                ScheduledFuture scheduledFuture = this.h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                HttpConnection httpConnection2 = this.o;
                if (httpConnection2 == null) {
                    u890.C("savedHttpConnection");
                    throw null;
                }
                httpConnection2.onError(HttpConnection.kErrorHttpInvalidUrl);
                this.s.b();
            }
        }
    }

    public final t7o f() {
        for (t7o t7oVar : p7h.M(new t7o[]{t7o.b, t7o.c, t7o.d, t7o.e})) {
            if (pzm.n(this.f, t7oVar)) {
                ScheduledFuture scheduledFuture = this.h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                return t7oVar;
            }
        }
        return null;
    }

    @Override // com.spotify.core.http.HttpConnectionDelegate
    public final boolean isRequestStarted() {
        return this.f.get() != t7o.a;
    }

    @Override // com.spotify.core.http.HttpConnectionDelegate
    public final void send(HttpConnection httpConnection, HttpRequest httpRequest, HttpOptions httpOptions) {
        String m231Var;
        try {
            URI uri = new URI(httpRequest.getUrl());
            if (!uri.isAbsolute()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m231Var = uri.toString();
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            String str = m231Var;
            AtomicReference atomicReference = this.f;
            if (str == null) {
                if (pzm.l(atomicReference)) {
                    httpConnection.onError(HttpConnection.kErrorHttpInvalidUrl);
                    return;
                }
                return;
            }
            if (pzm.o(atomicReference)) {
                this.o = httpConnection;
                this.f123p = httpRequest;
                this.q = httpOptions;
                this.r = str;
                this.j = this.c.b();
                this.k = this.e.b();
                if (e()) {
                    long timeout = httpOptions.getTimeout() + httpOptions.getConnectTimeout();
                    if (timeout <= 0) {
                        return;
                    }
                    this.h = this.b.b.schedule((Runnable) new u7o(this, (byte) 0), timeout, TimeUnit.MILLISECONDS);
                }
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
    }
}

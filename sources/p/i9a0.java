package p;

import android.net.TrafficStats;
import android.os.Trace;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.ThreadStatsUid;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i9a0 extends ExperimentalUrlRequest {
    public static final /* synthetic */ int z = 0;
    public final f9a0 a;
    public final h9a0 b;
    public final String c;
    public final TreeMap d;
    public final ArrayList e;
    public final AtomicInteger f;
    public final AtomicBoolean g;
    public final boolean h;
    public final String i;
    public final axh1 j;
    public final Executor k;
    public volatile int l;
    public String m;
    public ReadableByteChannel n;
    public v3i1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f22p;
    public HttpURLConnection q;
    public g9a0 r;
    public final t7a0 s;
    public final int t;
    public final xto1 u;
    public final long v;
    public int w;
    public int x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r6v11, types: [p.c9a0] */
    public i9a0(t7a0 t7a0Var, UrlRequest.Callback callback, final ThreadPoolExecutor threadPoolExecutor, Executor executor, String str, String str2, boolean z2, boolean z3, int i, final boolean z4, final int i2, long j, String str3, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor2) {
        axh1 axh1Var;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        this.d = treeMap;
        this.e = new ArrayList();
        this.f = new AtomicInteger(0);
        this.g = new AtomicBoolean(false);
        this.l = -1;
        eo41.a("Cronet JavaUrlRequest#JavaUrlRequest");
        try {
            Objects.requireNonNull(str, "URL is required");
            Objects.requireNonNull(callback, "Listener is required");
            Objects.requireNonNull(threadPoolExecutor, "Executor is required");
            Objects.requireNonNull(executor, "userExecutor is required");
            this.h = z2;
            this.a = new f9a0(this, callback, executor);
            final int threadStatsTag = z3 ? i : TrafficStats.getThreadStatsTag();
            this.b = new h9a0((c9a0) new Executor() { // from class: p.c9a0
                @Override // java.util.concurrent.Executor
                public final void execute(final Runnable runnable) {
                    final int i3 = threadStatsTag;
                    final boolean z5 = z4;
                    final int i4 = i2;
                    threadPoolExecutor.execute(new Runnable() { // from class: p.y8a0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Runnable runnable2 = runnable;
                            int threadStatsTag2 = TrafficStats.getThreadStatsTag();
                            TrafficStats.setThreadStatsTag(i3);
                            boolean z6 = z5;
                            if (z6) {
                                ThreadStatsUid.set(i4);
                            }
                            try {
                                runnable2.run();
                            } finally {
                                if (z6) {
                                    ThreadStatsUid.clear();
                                }
                                TrafficStats.setThreadStatsTag(threadStatsTag2);
                            }
                        }
                    });
                }
            });
            this.s = t7a0Var;
            this.t = t7a0Var.c;
            this.u = t7a0Var.d;
            this.m = str;
            this.c = str2;
            this.v = j;
            a(str3);
            this.i = str3;
            e(arrayList);
            if (uploadDataProvider == null) {
                axh1Var = null;
            } else {
                if (!treeMap.containsKey("Content-Type")) {
                    throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                }
                axh1Var = new axh1(uploadDataProvider, (byte) 1);
            }
            this.j = axh1Var;
            this.k = (executor2 == null || z2) ? executor2 : new g960(executor2, (byte) 3);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static void a(String str) {
        Objects.requireNonNull(str, "Method is required.");
        if ("OPTIONS".equalsIgnoreCase(str) || "GET".equalsIgnoreCase(str) || "HEAD".equalsIgnoreCase(str) || "POST".equalsIgnoreCase(str) || "PUT".equalsIgnoreCase(str) || "DELETE".equalsIgnoreCase(str) || "TRACE".equalsIgnoreCase(str) || "PATCH".equalsIgnoreCase(str)) {
            return;
        }
        hhg1.n("Invalid http method ".concat(str));
    }

    public final void b(CronetException cronetException) {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f;
            i = atomicInteger.get();
            if (i == 0) {
                eg.m("Can't enter error state before start");
                return;
            } else if (i == 6 || i == 7 || i == 8) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, 6));
        c(new b9a0(this, (byte) 2), "fireDisconnect");
        d();
        v3i1 v3i1Var = this.o;
        f9a0 f9a0Var = this.a;
        Executor executor = f9a0Var.c;
        i9a0 i9a0Var = f9a0Var.d;
        i9a0Var.c(new b9a0(i9a0Var, (byte) 0), "closeResponseChannel");
        c45 c45Var = new c45(f9a0Var, v3i1Var, cronetException, (byte) 24);
        try {
            f9a0Var.c(c45Var, "onFailed");
        } catch (InlineExecutionProhibitedException unused) {
            if (executor != null) {
                eo41.a("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor onFailed");
                try {
                    executor.execute(new gv40(c45Var, (byte) 6));
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    public final void c(Runnable runnable, String str) {
        eo41.a("Cronet JavaUrlRequest#executeOnExecutor ".concat(str));
        try {
            this.b.execute(new d9a0(str, runnable, (byte) 0));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.f.getAndSet(8);
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            c(new b9a0(this, (byte) 2), "fireDisconnect");
            d();
            final v3i1 v3i1Var = this.o;
            final f9a0 f9a0Var = this.a;
            i9a0 i9a0Var = f9a0Var.d;
            final byte b = 0;
            i9a0Var.c(new b9a0(i9a0Var, (byte) 0), "closeResponseChannel");
            f9a0Var.c(new Runnable() { // from class: p.e9a0
                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    UrlResponseInfo urlResponseInfo = v3i1Var;
                    f9a0 f9a0Var2 = f9a0Var;
                    switch (b2) {
                        case 0:
                            i9a0 i9a0Var2 = f9a0Var2.d;
                            try {
                                f9a0Var2.a.onCanceled(i9a0Var2, urlResponseInfo);
                            } catch (Exception unused) {
                                i9a0Var2.y = true;
                            }
                            f9a0Var2.d();
                            i9a0Var2.s.e.decrementAndGet();
                            break;
                        default:
                            i9a0 i9a0Var3 = f9a0Var2.d;
                            try {
                                f9a0Var2.a.onSucceeded(i9a0Var3, urlResponseInfo);
                            } catch (Exception unused2) {
                                i9a0Var3.y = true;
                            }
                            f9a0Var2.d();
                            i9a0Var3.s.e.decrementAndGet();
                            break;
                    }
                }
            }, "onCanceled");
        }
    }

    public final void d() {
        axh1 axh1Var = this.j;
        if (axh1Var == null || !this.g.compareAndSet(false, true)) {
            return;
        }
        try {
            this.k.execute(new z8a0(this, new bf70(axh1Var, (byte) 4), (byte) 0));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public final void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ',' && cCharAt != '/' && cCharAt != '{' && cCharAt != '}') {
                    switch (cCharAt) {
                        case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                        case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                        case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                            break;
                        default:
                            switch (cCharAt) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                            break;
                                        default:
                                            if (!Character.isISOControl(cCharAt) && !Character.isWhitespace(cCharAt)) {
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    while (i < str.length()) {
                        char cCharAt2 = str.charAt(i);
                        if (cCharAt2 == ',') {
                        }
                    }
                }
                hhg1.n(l1d.m("Invalid header with headername: ", (String) entry.getKey()));
                return;
            }
            if (((String) entry.getValue()).contains("\r\n")) {
                hhg1.n(l1d.m("Invalid header with headername: ", (String) entry.getKey()));
                return;
            }
            this.d.put((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void f(int i, int i2, Runnable runnable) {
        AtomicInteger atomicInteger = this.f;
        if (!atomicInteger.compareAndSet(i, i2)) {
            int i3 = atomicInteger.get();
            if (i3 == 8 || i3 == 6) {
                return;
            }
            eg.m(gvg.h("Invalid state transition - expected ", w361.s(i), " but was ", w361.s(i3)));
            return;
        }
        eo41.a("Cronet JavaUrlRequest#transitionStates " + w361.s(i) + " -> " + w361.s(i2));
        try {
            runnable.run();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        f(3, 1, new an90(this, (byte) 1));
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.f.get();
        int i2 = this.l;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                eg.m(f4i1.c(i, "Switch is exhaustive: "));
                return;
        }
        f9a0 f9a0Var = this.a;
        b4j1 b4j1Var = new b4j1(statusListener);
        f9a0Var.getClass();
        f9a0Var.c(new xu7(b4j1Var, i2, (byte) 6), "sendStatus");
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.f.get();
        return i == 7 || i == 6 || i == 8;
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            hhg1.n("byteBuffer must be a direct ByteBuffer.");
        } else if (byteBuffer.hasRemaining()) {
            f(4, 5, new ag20(this, new x8a0(this, byteBuffer, (byte) 0), (byte) 11));
        } else {
            hhg1.n("ByteBuffer is already full.");
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        this.s.e.incrementAndGet();
        f(0, 1, new b9a0(this, (byte) 3));
    }
}

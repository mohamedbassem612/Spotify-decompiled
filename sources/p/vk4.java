package p;

import android.net.Network;
import android.net.http.HttpEngine;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vk4 extends l7o {
    public static boolean c;
    public static boolean d;
    public final HttpEngine a;
    public final Map b = Collections.synchronizedMap(new HashMap());

    public vk4(HttpEngine httpEngine) {
        this.a = httpEngine;
    }

    @Override // p.l7o
    public final ExperimentalUrlRequest a(String str, UrlRequest.Callback callback, Executor executor, int i, ArrayList arrayList, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, RequestFinishedInfo.Listener listener, long j, String str2, ArrayList arrayList2, UploadDataProvider uploadDataProvider, Executor executor2) {
        l65 l65Var = new l65(callback);
        android.net.http.UrlRequest.Builder builderNewUrlRequestBuilder = this.a.newUrlRequestBuilder(str, executor, l65Var);
        builderNewUrlRequestBuilder.setPriority(i);
        if (z) {
            builderNewUrlRequestBuilder.setCacheDisabled(z);
        }
        if (z2) {
            builderNewUrlRequestBuilder.setDirectExecutorAllowed(z2);
        }
        if (z3) {
            builderNewUrlRequestBuilder.setTrafficStatsTag(i2);
        }
        if (z4) {
            builderNewUrlRequestBuilder.setTrafficStatsTag(i3);
        }
        builderNewUrlRequestBuilder.bindToNetwork(j == -1 ? null : Network.fromNetworkHandle(j));
        builderNewUrlRequestBuilder.setHttpMethod(str2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builderNewUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (uploadDataProvider != null) {
            builderNewUrlRequestBuilder.setUploadDataProvider(new c65(uploadDataProvider), executor2);
        }
        n65 n65Var = new n65(builderNewUrlRequestBuilder.build(), this, str, arrayList, listener);
        l65Var.b = n65Var;
        return n65Var;
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.b.put(listener, new z3j1(listener));
    }

    public final ExperimentalBidirectionalStream b(String str, BidirectionalStream.Callback callback, Executor executor, String str2, ArrayList arrayList, int i, boolean z, ArrayList arrayList2, boolean z2, int i2, boolean z3, int i3) {
        r74 r74Var = new r74(callback);
        android.net.http.BidirectionalStream.Builder builderNewBidirectionalStreamBuilder = this.a.newBidirectionalStreamBuilder(str, executor, r74Var);
        builderNewBidirectionalStreamBuilder.setHttpMethod(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builderNewBidirectionalStreamBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        builderNewBidirectionalStreamBuilder.setPriority(i);
        builderNewBidirectionalStreamBuilder.setDelayRequestHeadersUntilFirstFlushEnabled(z);
        if (z2) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsTag(i2);
        }
        if (z3) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsUid(i3);
        }
        s74 s74Var = new s74(builderNewBidirectionalStreamBuilder.build(), this, str, arrayList2);
        r74Var.b = s74Var;
        return s74Var;
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.a.bindToNetwork(j == -1 ? null : Network.fromNetworkHandle(j));
    }

    public final /* synthetic */ URLConnection c(URL url) {
        return this.a.openConnection(url);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return this.a.createUrlStreamHandlerFactory();
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        if (!d) {
            d = true;
        }
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return HttpEngine.getVersionString();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new kra(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new t3i1(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            k220.c();
            return null;
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return openConnection(url);
        }
        hhg1.h(l1d.m("Unexpected protocol:", protocol));
        return null;
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.b.remove(listener);
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
        if (c) {
            return;
        }
        c = true;
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new kra(str, callback, executor, this);
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return (URLConnection) sf.h(new uk4(this, url, (byte) 0), IOException.class);
    }
}

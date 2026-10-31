package p;

import com.spotify.core.http.HeaderSanitizer;
import com.spotify.core.http.HttpConnection;
import com.spotify.core.http.HttpConnectionDelegate;
import com.spotify.core.http.HttpOptions;
import com.spotify.core.http.HttpRequest;
import com.spotify.jvm.jni.NativeHelpers;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o270 implements HttpConnectionDelegate {
    public final azp0 a;
    public final v4g1 b;
    public jf01 c;
    public ln21 d;
    public boolean e;

    public o270(azp0 azp0Var, v4g1 v4g1Var) {
        this.a = azp0Var;
        this.b = v4g1Var;
    }

    @Override // com.spotify.core.http.HttpConnectionDelegate
    public final void abort() {
        jf01 jf01Var = this.c;
        if (jf01Var != null) {
            jf01Var.cancel();
        }
        this.e = true;
    }

    @Override // com.spotify.core.http.HttpConnectionDelegate
    public final boolean isRequestStarted() {
        return this.d != null;
    }

    @Override // com.spotify.core.http.HttpConnectionDelegate
    public final void send(HttpConnection httpConnection, HttpRequest httpRequest, HttpOptions httpOptions) {
        l370 l370VarB;
        tpc tpcVar;
        ne neVar = new ne((byte) 9);
        String url = httpRequest.getUrl();
        sn21 sn21VarD = null;
        try {
            k370 k370Var = new k370();
            k370Var.f((l370) null, url);
            l370VarB = k370Var.b();
        } catch (IllegalArgumentException unused) {
            l370VarB = null;
        }
        if (l370VarB == null) {
            httpConnection.onError(HttpConnection.kErrorHttpInvalidUrl);
            return;
        }
        neVar.a = l370VarB;
        Map mapByteArrayToMap = NativeHelpers.Companion.byteArrayToMap(httpRequest.getHeaders());
        for (Map.Entry entry : mapByteArrayToMap.entrySet()) {
            if (((CharSequence) entry.getKey()).length() != 0) {
                neVar.G((String) entry.getKey(), HeaderSanitizer.INSTANCE.sanitizeValue((String) entry.getValue()));
            }
        }
        String method = httpRequest.getMethod();
        byte[] body = httpRequest.getBody();
        if (eqr0.J(method)) {
            String strH = kuo1.h(mapByteArrayToMap);
            se11 se11Var = r8i0.e;
            sn21VarD = zov0.d(6, bmq0.w(strH), body);
        }
        neVar.L(method, sn21VarD);
        neVar.c0(een.class, een.b);
        if (httpOptions.getCachePolicy() != 0) {
            int cachePolicy = httpOptions.getCachePolicy();
            if (cachePolicy == 1) {
                tpcVar = new tpc();
                nyn1.V(tpcVar);
            } else if (cachePolicy == 2) {
                tpcVar = new tpc();
                nyn1.V(tpcVar);
            } else if (cachePolicy == 3) {
                tpcVar = new tpc();
                tpcVar.a();
            } else if (cachePolicy != 4) {
                tpcVar = new tpc();
            } else {
                tpcVar = new tpc();
                nyn1.X(tpcVar);
                tpcVar.a();
            }
            if (httpOptions.getSkipCacheStorage()) {
                nyn1.W(tpcVar);
            }
            neVar.k(nyn1.R(tpcVar));
        } else if (httpOptions.getSkipCacheStorage()) {
            neVar.d("Cache-Control", "no-store");
        }
        ln21 ln21Var = new ln21(neVar);
        this.d = ln21Var;
        azp0 azp0Var = this.a;
        long j = azp0Var.y;
        long timeout = httpOptions.getTimeout();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j != timeout && azp0Var.z != httpOptions.getTimeout()) {
            zyp0 zyp0VarB = azp0Var.b();
            zyp0VarB.z = z4n1.b("timeout", httpOptions.getTimeout(), timeUnit);
            zyp0VarB.A = z4n1.b("timeout", httpOptions.getTimeout(), timeUnit);
            azp0Var = new azp0(zyp0VarB);
        }
        if (azp0Var.x != httpOptions.getConnectTimeout()) {
            zyp0 zyp0VarB2 = azp0Var.b();
            zyp0VarB2.y = z4n1.b("timeout", httpOptions.getConnectTimeout(), timeUnit);
            azp0Var = new azp0(zyp0VarB2);
        }
        if (azp0Var.h != httpOptions.getIsFollowRedirects()) {
            zyp0 zyp0VarB3 = azp0Var.b();
            zyp0VarB3.i = httpOptions.getIsFollowRedirects();
            azp0Var = new azp0(zyp0VarB3);
        }
        jf01 jf01VarA = azp0Var.a(ln21Var);
        this.b.e.put(new i4g1(jf01VarA), new zi50(httpConnection, (byte) 20));
        jf01VarA.d(new yfu(httpConnection, this, (byte) 18));
        this.c = jf01VarA;
    }
}

package p;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.util.CloseGuard;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l34 extends nct0 implements ebm {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT >= 29;
    }

    public l34() {
        List listI0 = f46.i0(new b6a1[]{Build.VERSION.SDK_INT >= 29 ? new m34() : null, new u3t(v15.e), new u3t(ufl.a), new u3t(p0c.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI0) {
            if (((b6a1) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // p.ebm
    public final Context a() {
        return this.c;
    }

    @Override // p.ebm
    public final void b(Context context) {
        this.c = context;
    }

    @Override // p.nct0
    public final anm1 c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        a94 a94Var = x509TrustManagerExtensions != null ? new a94(x509TrustManager, x509TrustManagerExtensions) : null;
        if (a94Var != null) {
            return a94Var;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new tda(new qfa((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // p.nct0
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((b6a1) next).b(sSLSocket));
        b6a1 b6a1Var = (b6a1) next;
        if (b6a1Var != null) {
            b6a1Var.d(sSLSocket, str, list);
        }
    }

    @Override // p.nct0
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((b6a1) next).b(sSLSocket));
        b6a1 b6a1Var = (b6a1) next;
        if (b6a1Var != null) {
            return b6a1Var.c(sSLSocket);
        }
        return null;
    }

    @Override // p.nct0
    public final Object g() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.g();
        }
        CloseGuard closeGuardC = k34.c();
        closeGuardC.open("response.body().close()");
        return closeGuardC;
    }

    @Override // p.nct0
    public final void j(Object obj, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            c9r.e(obj).warnIfOpen();
        } else {
            super.j(obj, str);
        }
    }
}

package p;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gx4 extends nct0 implements ebm {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT < 29;
    }

    public gx4() {
        cbb1 cbb1Var;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            cbb1Var = new cbb1(cls);
        } catch (Exception e2) {
            CopyOnWriteArraySet copyOnWriteArraySet = xq4.a;
            xq4.a(5, azp0.class.getName(), "unable to load android socket classes", e2);
            cbb1Var = null;
        }
        List listI0 = f46.i0(new b6a1[]{cbb1Var, new u3t(v15.e), new u3t(ufl.a), new u3t(p0c.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI0) {
            if (((b6a1) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    public final Context a() {
        return this.c;
    }

    public final void b(Context context) {
        this.c = context;
    }

    public final anm1 c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        dwg1 qfaVar;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        a94 a94Var = x509TrustManagerExtensions != null ? new a94(x509TrustManager, x509TrustManagerExtensions) : null;
        if (a94Var != null) {
            return a94Var;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            qfaVar = new fx4(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            qfaVar = new qfa((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new tda(qfaVar);
    }

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

    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

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

    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public final SSLContext k() {
        StrictMode.noteSlowCall("newSSLContext");
        return SSLContext.getInstance("TLS");
    }

    public final void i(int i) {
    }
}

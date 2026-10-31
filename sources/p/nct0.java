package p;

import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class nct0 {
    public static volatile nct0 a;
    public static final Logger b;

    static {
        try {
            for (Map.Entry entry : xq4.b.entrySet()) {
                xq4.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        l34 l34Var = l34.e ? new l34() : null;
        if (l34Var == null) {
            boolean z = gx4.e;
            l34Var = fj30.t();
        }
        if (l34Var == null) {
            bhn0.r(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was ");
        } else {
            a = l34Var;
            b = Logger.getLogger(azp0.class.getName());
        }
    }

    public abstract anm1 c(X509TrustManager x509TrustManager);

    public abstract void d(SSLSocket sSLSocket, String str, List list);

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public abstract String f(SSLSocket sSLSocket);

    public Object g() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public void i(int i) {
        if (i == 5) {
            boolean z = gx4.e;
            fj30.A();
        } else {
            boolean z2 = gx4.e;
            fj30.A();
        }
    }

    public void j(Object obj, String str) {
        if (obj == null) {
            str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5);
    }

    public SSLContext k() {
        StrictMode.noteSlowCall("newSSLContext");
        return SSLContext.getInstance("TLS");
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}

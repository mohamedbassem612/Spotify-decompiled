package p;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p0c implements b6a1 {
    public static final n0c a = new n0c();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, o0c.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        b = z;
    }

    @Override // p.b6a1
    public final boolean a() {
        return b;
    }

    @Override // p.b6a1
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p.b6a1
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p.b6a1
    public final void d(SSLSocket sSLSocket, String str, List list) {
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            nct0 nct0Var = nct0.a;
            parameters.setApplicationProtocols((String[]) rtw0.v(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}

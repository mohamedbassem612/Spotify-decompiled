package p;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ufl implements b6a1 {
    public static final sfl a = new sfl();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, tfl.class.getClassLoader());
            if (Conscrypt.isAvailable() && tfl.a()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        b = z;
    }

    @Override // p.b6a1
    public final boolean a() {
        return b;
    }

    @Override // p.b6a1
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p.b6a1
    public final String c(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p.b6a1
    public final void d(SSLSocket sSLSocket, String str, List list) {
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            nct0 nct0Var = nct0.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) rtw0.v(list).toArray(new String[0]));
        }
    }
}

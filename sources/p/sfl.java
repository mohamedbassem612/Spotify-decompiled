package p;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sfl implements t3t {
    @Override // p.t3t
    public final boolean b(SSLSocket sSLSocket) {
        return ufl.b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p.t3t
    public final b6a1 r(SSLSocket sSLSocket) {
        return new ufl();
    }
}

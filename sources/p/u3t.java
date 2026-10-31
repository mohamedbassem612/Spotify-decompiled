package p;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u3t implements b6a1 {
    public final t3t a;
    public b6a1 b;

    public u3t(t3t t3tVar) {
        this.a = t3tVar;
    }

    @Override // p.b6a1
    public final boolean a() {
        return true;
    }

    @Override // p.b6a1
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.b(sSLSocket);
    }

    @Override // p.b6a1
    public final String c(SSLSocket sSLSocket) {
        b6a1 b6a1VarE = e(sSLSocket);
        if (b6a1VarE != null) {
            return b6a1VarE.c(sSLSocket);
        }
        return null;
    }

    @Override // p.b6a1
    public final void d(SSLSocket sSLSocket, String str, List list) {
        b6a1 b6a1VarE = e(sSLSocket);
        if (b6a1VarE != null) {
            b6a1VarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized b6a1 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.b(sSLSocket)) {
                this.b = this.a.r(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}

package p;

import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f270 extends fj7 {
    public final /* synthetic */ g270 n;

    public f270(g270 g270Var) {
        this.n = g270Var;
    }

    @Override // p.fj7
    public final void k() {
        this.n.e(9);
        z170 z170Var = this.n.b;
        synchronized (z170Var) {
            long j = z170Var.O0;
            long j2 = z170Var.N0;
            if (j < j2) {
                return;
            }
            z170Var.N0 = j2 + 1;
            z170Var.P0 = System.nanoTime() + 1000000000;
            hsd1.c(z170Var.h, l1d.n(z170Var.c, " ping", new StringBuilder()), 0L, new g030(z170Var, (byte) 5), 6);
        }
    }

    public final void l() {
        if (j()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}

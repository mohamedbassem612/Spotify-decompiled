package p;

import androidx.media3.datasource.HttpDataSource;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e2b1 implements d9e0 {
    public final /* synthetic */ f2b1 a;

    public e2b1(f2b1 f2b1Var) {
        this.a = f2b1Var;
    }

    public final void j(f9e0 f9e0Var, long j, long j2) {
        vzr0 vzr0Var = (vzr0) f9e0Var;
        f2b1 f2b1Var = this.a;
        d5b1 d5b1Var = (d5b1) vzr0Var.f;
        if (d5b1Var != null) {
            f2b1Var.a1 = d5b1Var;
            f2b1Var.A();
            long j3 = vzr0Var.a;
            n3r n3rVar = vzr0Var.b;
            rsb1 rsb1Var = vzr0Var.d;
            d2e0 d2e0Var = new d2e0(j3, n3rVar, rsb1Var.c, rsb1Var.d, j, j2, rsb1Var.b);
            qpt0 qpt0Var = f2b1Var.Z.z1;
            Set<rpt0> set = d5b1Var.f;
            if (qpt0Var != qpt0.c && qpt0Var != qpt0.d) {
                set = null;
            }
            if (set != null) {
                for (rpt0 rpt0Var : set) {
                    String strC = f2b1Var.i.c();
                    o5n o5nVar = f2b1Var.P0;
                    if (o5nVar != null) {
                        o5nVar.a(rpt0Var, strC, false, f2b1Var.t);
                    }
                }
            }
            f2b1Var.R0.I(d2e0Var, vzr0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    public final void n(f9e0 f9e0Var, long j, long j2, boolean z) {
        vzr0 vzr0Var = (vzr0) f9e0Var;
        long j3 = vzr0Var.a;
        n3r n3rVar = vzr0Var.b;
        rsb1 rsb1Var = vzr0Var.d;
        this.a.R0.H(new d2e0(j3, n3rVar, rsb1Var.c, rsb1Var.d, j, j2, rsb1Var.b), vzr0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    public final o4t o(f9e0 f9e0Var, long j, long j2, IOException iOException, int i) {
        boolean z;
        vzr0 vzr0Var = (vzr0) f9e0Var;
        long j3 = vzr0Var.a;
        n3r n3rVar = vzr0Var.b;
        rsb1 rsb1Var = vzr0Var.d;
        d2e0 d2e0Var = new d2e0(j3, n3rVar, rsb1Var.c, rsb1Var.d, j, j2, rsb1Var.b);
        f2b1 f2b1Var = this.a;
        if (f2b1Var.Q0) {
            z = false;
        } else {
            if (iOException instanceof HttpDataSource.InvalidResponseCodeException) {
                int i2 = ((HttpDataSource.InvalidResponseCodeException) iOException).d;
                if ((500 <= i2 && i2 < 600) || i2 == 408 || i2 == 429) {
                    if (i < 3) {
                        z = true;
                    }
                }
            } else if (iOException instanceof HttpDataSource.HttpDataSourceException) {
                Throwable cause = iOException.getCause();
                if ((cause instanceof SocketTimeoutException) || (cause instanceof UnknownHostException) || (cause instanceof SocketException)) {
                    if (i < 3) {
                        z = true;
                    }
                }
            }
            z = false;
        }
        f2b1Var.R0.K(d2e0Var, vzr0Var.c, iOException, !z);
        return z ? new o4t(0, 1000L) : eyh0.Z;
    }
}

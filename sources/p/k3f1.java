package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k3f1 {
    public u3e1 a;
    public int b = 1;

    public final void a() {
        xab1 xab1Var;
        u3e1 u3e1Var = this.a;
        if (u3e1Var == null || (xab1Var = u3e1Var.U0) == null) {
            return;
        }
        xab1Var.d((CancellationException) null);
        u3e1Var.U0 = null;
    }

    public final void b() {
        o3e1 o3e1Var;
        if (this.b == 1) {
            tf80.c("ToolbarRequester is not initialized.");
        }
        u3e1 u3e1Var = this.a;
        if (u3e1Var == null || !((pim0) u3e1Var).N0) {
            return;
        }
        xab1 xab1Var = u3e1Var.U0;
        if ((xab1Var == null || !xab1Var.isActive()) && (o3e1Var = (o3e1) lcc.z(u3e1Var, p3e1.b)) != null) {
            u3e1Var.U0 = fn31.T(u3e1Var.v1(), null, 4, new q721(u3e1Var, o3e1Var, (lnm) null, (byte) 17), 1);
        }
    }
}

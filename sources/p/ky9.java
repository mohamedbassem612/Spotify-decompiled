package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ky9 extends pim0 implements m7v, sjp0, t161 {
    public long O0;
    public Brush P0;
    public float Q0;
    public hw61 R0;
    public long S0;
    public flb0 T0;
    public z1a1 U0;
    public hw61 V0;
    public z1a1 W0;

    @Override // p.sjp0
    public final void f0() {
        this.S0 = 9205357640488583168L;
        this.T0 = null;
        this.U0 = null;
        this.V0 = null;
        ha71.x(this);
    }

    @Override // p.t161
    public final void g(e261 e261Var) {
        b261.z(e261Var, this.R0);
    }

    @Override // p.t161
    public final boolean k() {
        return false;
    }

    @Override // p.m7v
    public final void t0(lsl lslVar) {
        lsl lslVar2;
        z1a1 z1a1Var;
        if (this.R0 == d4o1.a) {
            long j = this.O0;
            int i = u7h.l;
            if (!z4h1.b(j, nfb.p())) {
                DrawScope.d0(lslVar, this.O0, 0L, 0L, 0.0f, null, null, 126);
            }
            Brush brush = this.P0;
            if (brush != null) {
                DrawScope.S0(lslVar, brush, 0L, 0L, this.Q0, null, null, 0, 118);
            }
        } else {
            if (Size.c(lslVar.j(), this.S0) && lslVar.getLayoutDirection() == this.T0 && u890.j(this.V0, this.R0)) {
                z1a1Var = this.U0;
                z1a1Var.getClass();
                lslVar2 = lslVar;
            } else {
                lslVar2 = lslVar;
                p9p1.z(this, new og(this, lslVar2, (byte) 7));
                z1a1Var = this.W0;
                this.W0 = null;
            }
            z1a1 z1a1Var2 = z1a1Var;
            this.U0 = z1a1Var2;
            this.S0 = lslVar2.j();
            this.T0 = lslVar2.getLayoutDirection();
            this.V0 = this.R0;
            z1a1Var2.getClass();
            long j2 = this.O0;
            int i2 = u7h.l;
            if (!z4h1.b(j2, nfb.p())) {
                vpb1.w(lslVar2, z1a1Var2, this.O0, (phc1) null, 60);
            }
            Brush brush2 = this.P0;
            if (brush2 != null) {
                vpb1.u(lslVar, z1a1Var2, brush2, this.Q0, 0, 56);
            }
        }
        lslVar.s1();
    }
}

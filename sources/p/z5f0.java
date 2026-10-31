package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class z5f0 extends x5f0 implements afh0 {
    public final ndo0 U0;
    public LinkedHashMap W0;
    public hfh0 Y0;
    public final sdn0 Z0;
    public long V0 = 0;
    public final a6f0 X0 = new a6f0(this);

    public z5f0(ndo0 ndo0Var) {
        this.U0 = ndo0Var;
        sdn0 sdn0Var = kfp0.a;
        this.Z0 = new sdn0();
    }

    public final hfh0 A0() {
        hfh0 hfh0Var = this.Y0;
        if (hfh0Var != null) {
            return hfh0Var;
        }
        throw l1d.w("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    public final x5f0 D0() {
        ndo0 ndo0Var = this.U0.Y0;
        if (ndo0Var != null) {
            return ndo0Var.c1();
        }
        return null;
    }

    public final long E0() {
        return this.V0;
    }

    public final void K0() {
        e0(this.V0, 0.0f, null);
    }

    public final int O0(ul3 ul3Var) {
        sdn0 sdn0Var = this.Z0;
        int iD = sdn0Var.d(ul3Var);
        return iD >= 0 ? sdn0Var.c[iD] : os00.INVALID_ID;
    }

    public final long P0() {
        return ((q5t0) this).d;
    }

    public final ndo0 Q0() {
        return this.U0;
    }

    public final a6f0 T0() {
        return this.X0;
    }

    public final float U0() {
        return this.U0.U0();
    }

    public final long V0() {
        return (((long) ((q5t0) this).a) << 32) | (((long) ((q5t0) this).b) & 4294967295L);
    }

    public final boolean W() {
        return true;
    }

    public void W0() {
        A0().a();
    }

    public final void Y0(long j) {
        if (!qr80.b(this.V0, j)) {
            this.V0 = j;
            ndo0 ndo0Var = this.U0;
            c6f0 c6f0Var = ndo0Var.U0.f1.q;
            if (c6f0Var != null) {
                c6f0Var.s0();
            }
            x5f0.I0(ndo0Var);
        }
        if (((x5f0) this).O0) {
            return;
        }
        s0(A0());
    }

    public final void Z0(long j) {
        Y0(qr80.d(j, ((q5t0) this).e));
    }

    public final long b1(z5f0 z5f0Var, boolean z) {
        long jD = 0;
        while (!this.equals(z5f0Var)) {
            if (!((x5f0) this).Y || !z) {
                jD = qr80.d(jD, this.V0);
            }
            ndo0 ndo0Var = this.U0.Y0;
            ndo0Var.getClass();
            this = ndo0Var.c1();
            this.getClass();
        }
        return jD;
    }

    public final void c1(hfh0 hfh0Var) {
        LinkedHashMap linkedHashMap;
        if (hfh0Var != null) {
            h0((((long) hfh0Var.getHeight()) & 4294967295L) | (((long) hfh0Var.getWidth()) << 32));
        } else {
            h0(0L);
        }
        if (!u890.j(this.Y0, hfh0Var) && hfh0Var != null && ((((linkedHashMap = this.W0) != null && !linkedHashMap.isEmpty()) || !hfh0Var.c().isEmpty()) && !u890.j(hfh0Var.c(), this.W0))) {
            c6f0 c6f0Var = this.U0.U0.f1.q;
            c6f0Var.getClass();
            c6f0Var.S0.j();
            LinkedHashMap linkedHashMap2 = this.W0;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.W0 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(hfh0Var.c());
        }
        this.Y0 = hfh0Var;
    }

    public final void e0(long j, float f, iu30 iu30Var) {
        Y0(j);
        if (((x5f0) this).N0) {
            return;
        }
        W0();
    }

    public final Object g() {
        return this.U0.g();
    }

    public final flb0 getLayoutDirection() {
        return this.U0.U0.a1;
    }

    public final float h() {
        return this.U0.h();
    }

    public final x5f0 t0() {
        ndo0 ndo0Var = this.U0.X0;
        if (ndo0Var != null) {
            return ndo0Var.c1();
        }
        return null;
    }

    public final elb0 x0() {
        return this.X0;
    }

    public final boolean y0() {
        return this.Y0 != null;
    }

    public final hmb0 z0() {
        return this.U0.U0;
    }
}

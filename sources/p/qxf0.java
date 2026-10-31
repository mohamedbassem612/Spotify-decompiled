package p;

import android.view.View;
import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qxf0 extends pim0 implements mv40, m7v, t161, sjp0 {
    public iu30 O0;
    public iu30 P0;
    public wct0 W0;
    public View X0;
    public wat Y0;
    public vct0 Z0;
    public mdt b1;
    public yr80 d1;
    public bbc e1;
    public float Q0 = Float.NaN;
    public boolean R0 = true;
    public long S0 = 9205357640488583168L;
    public float T0 = Float.NaN;
    public float U0 = Float.NaN;
    public boolean V0 = true;
    public final hrr0 a1 = new hrr0((Object) null, f331.X0);
    public long c1 = 9205357640488583168L;

    public qxf0(iu30 iu30Var, iu30 iu30Var2, wct0 wct0Var) {
        this.O0 = iu30Var;
        this.P0 = iu30Var2;
        this.W0 = wct0Var;
    }

    public final void A1() {
        vct0 vct0Var = this.Z0;
        if (vct0Var != null) {
            ((xct0) vct0Var).b();
        }
        this.Z0 = null;
    }

    public final void E(elb0 elb0Var) {
        this.a1.setValue(elb0Var);
    }

    public final long H1() {
        mdt mdtVarA = this.b1;
        if (mdtVarA == null) {
            mdtVarA = yv91.a(new pxf0(this, (byte) 2));
            this.b1 = mdtVarA;
        }
        return ((Offset) mdtVarA.getValue()).a;
    }

    public final void I1() {
        vct0 vct0Var = this.Z0;
        if (vct0Var != null) {
            ((xct0) vct0Var).b();
        }
        View viewE = this.X0;
        if (viewE == null) {
            viewE = pap1.E(this);
        }
        View view = viewE;
        this.X0 = view;
        wat watVar = this.Y0;
        if (watVar == null) {
            watVar = oap1.B(this).Z0;
        }
        wat watVar2 = watVar;
        this.Y0 = watVar2;
        this.Z0 = this.W0.g(view, this.R0, this.S0, this.T0, this.U0, this.V0, watVar2, this.Q0);
        K1();
    }

    public final void J1() {
        wat watVar = this.Y0;
        if (watVar == null) {
            watVar = oap1.B(this).Z0;
            this.Y0 = watVar;
        }
        long j = ((Offset) this.O0.invoke(watVar)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & H1()) == 9205357640488583168L) {
            this.c1 = 9205357640488583168L;
            vct0 vct0Var = this.Z0;
            if (vct0Var != null) {
                ((xct0) vct0Var).b();
                return;
            }
            return;
        }
        this.c1 = Offset.g(H1(), j);
        if (this.Z0 == null) {
            I1();
        }
        vct0 vct0Var2 = this.Z0;
        if (vct0Var2 != null) {
            vct0Var2.a(this.Q0, this.c1, 9205357640488583168L);
        }
        K1();
    }

    public final void K1() {
        wat watVar;
        vct0 vct0Var = this.Z0;
        if (vct0Var == null || (watVar = this.Y0) == null) {
            return;
        }
        xct0 xct0Var = (xct0) vct0Var;
        if (yr80.a(xct0Var.c(), this.d1)) {
            return;
        }
        iu30 iu30Var = this.P0;
        if (iu30Var != null) {
            iu30Var.invoke(new s3v(watVar.t(o0c.R(xct0Var.c()))));
        }
        this.d1 = new yr80(xct0Var.c());
    }

    public final void f0() {
        p9p1.z(this, new pxf0(this, (byte) 0));
    }

    public final void g(e261 e261Var) {
        e261Var.b(rxf0.a, new pxf0(this, (byte) 1));
    }

    public final void t0(lsl lslVar) {
        lslVar.s1();
        bbc bbcVar = this.e1;
        if (bbcVar != null) {
            bbcVar.l(rih1.a);
        }
    }

    public final void z1() {
        f0();
        this.e1 = mno1.a(0, 0, 7);
        fn31.T(v1(), null, 4, new bu(this, (lnm) null, (byte) 24), 1);
    }
}

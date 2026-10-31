package p;

import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j6e1 extends g6e1 implements j4k {
    public ggg1 Q0;
    public r7e1 R0;
    public aae1 S0;
    public boolean T0;
    public final hrr0 U0;
    public final o95 V0;
    public final qxf0 W0;
    public xab1 X0;

    public j6e1(ggg1 ggg1Var, r7e1 r7e1Var, aae1 aae1Var, boolean z) {
        this.Q0 = ggg1Var;
        this.R0 = r7e1Var;
        this.S0 = aae1Var;
        this.T0 = z;
        hrr0 hrr0VarQ = v8r.q(new yr80(0L));
        this.U0 = hrr0VarQ;
        this.V0 = new o95(new Offset(w3p1.e(this.Q0, this.R0, this.S0, ((yr80) hrr0VarQ.getValue()).a)), vy51.b, new Offset(vy51.c), 8);
        final byte b = 0;
        iu30 iu30Var = new iu30(this) { // from class: p.h6e1
            public final /* synthetic */ j6e1 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                j6e1 j6e1Var = this.b;
                switch (b2) {
                    case 0:
                        return (Offset) j6e1Var.V0.e();
                    default:
                        s3v s3vVar = (s3v) obj;
                        wat watVar = (wat) lcc.z(j6e1Var, t4k.h);
                        j6e1Var.U0.setValue(new yr80((((long) watVar.i0(s3v.b(s3vVar.a))) << 32) | (((long) watVar.i0(s3v.a(s3vVar.a))) & 4294967295L)));
                        return rih1.a;
                }
            }
        };
        final byte b2 = 1;
        iu30 iu30Var2 = new iu30(this) { // from class: p.h6e1
            public final /* synthetic */ j6e1 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b2;
                j6e1 j6e1Var = this.b;
                switch (b3) {
                    case 0:
                        return (Offset) j6e1Var.V0.e();
                    default:
                        s3v s3vVar = (s3v) obj;
                        wat watVar = (wat) lcc.z(j6e1Var, t4k.h);
                        j6e1Var.U0.setValue(new yr80((((long) watVar.i0(s3v.b(s3vVar.a))) << 32) | (((long) watVar.i0(s3v.a(s3vVar.a))) & 4294967295L)));
                        return rih1.a;
                }
            }
        };
        if (!rxf0.a()) {
            hhg1.h("Magnifier is only supported on API level 28 and higher.");
            throw null;
        }
        qxf0 qxf0Var = new qxf0(iu30Var, iu30Var2, Build.VERSION.SDK_INT == 28 ? ykb0.b : zct0.b);
        H1(qxf0Var);
        this.W0 = qxf0Var;
    }

    public final void E(elb0 elb0Var) {
        this.W0.E(elb0Var);
    }

    public final void K1(ggg1 ggg1Var, r7e1 r7e1Var, aae1 aae1Var, boolean z) {
        ggg1 ggg1Var2 = this.Q0;
        r7e1 r7e1Var2 = this.R0;
        aae1 aae1Var2 = this.S0;
        boolean z2 = this.T0;
        this.Q0 = ggg1Var;
        this.R0 = r7e1Var;
        this.S0 = aae1Var;
        this.T0 = z;
        if (u890.j(ggg1Var, ggg1Var2) && r7e1Var == r7e1Var2 && u890.j(aae1Var, aae1Var2) && z == z2) {
            return;
        }
        L1();
    }

    public final void L1() {
        xab1 xab1Var = this.X0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.X0 = null;
        if (rxf0.a()) {
            if (!this.T0 && (((Offset) this.V0.e()).a & 9223372034707292159L) != 9205357640488583168L) {
                fn31.T(v1(), null, 4, new xba1(this, (lnm) null, (byte) 25), 1);
            }
            this.X0 = fn31.T(v1(), null, 0, new pec1(this, (lnm) null, (byte) 14), 3);
        }
    }

    public final void g(e261 e261Var) {
        this.W0.g(e261Var);
    }

    public final void t0(lsl lslVar) {
        lslVar.s1();
        this.W0.t0(lslVar);
    }

    public final void z1() {
        L1();
    }
}

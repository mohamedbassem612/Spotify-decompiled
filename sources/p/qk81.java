package p;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qk81 extends auj implements lir0 {
    public final jf11 Y1;
    public zxo Z1;
    public ulc a2;
    public mir0 b2;
    public b2r0 c2;

    public qk81(jf11 jf11Var) {
        this.Y1 = jf11Var;
    }

    public final void D0() {
        ((zf30) this).h1 = true;
        dismiss();
    }

    public final mir0 c() {
        mir0 mir0Var = this.b2;
        if (mir0Var != null) {
            return mir0Var;
        }
        u890.C("pageObservable");
        throw null;
    }

    public final void k1(t4n t4nVar) {
        t4nVar.g().L(3);
        t4nVar.g().E = true;
    }

    public final void n1(xtj xtjVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1280621956);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            op80 jp80Var = new jp80(view);
            b2r0 b2r0Var = this.c2;
            if (b2r0Var == null) {
                u890.C("pageBoundUbiLogger");
                throw null;
            }
            if (b2r0Var == null) {
                u890.C("pageBoundUbiLogger");
                throw null;
            }
            op80 eq80Var = new eq80(new e3h1(b2r0Var, (n7h1) null, b2r0Var));
            op80 wchVar = q6x.b;
            if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
                jp80Var = wchVar;
            } else if (jp80Var.equals(wchVar)) {
                jp80Var = eq80Var;
            } else if (!eq80Var.equals(wchVar)) {
                wchVar = new wch(jp80Var, eq80Var);
                jp80Var = wchVar;
            }
            xhk1.c(view, jp80Var);
            qsw.c(new obk1(view), apo.r(1462795971, new pk81(this, (byte) 1), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q081(this, xtjVar, i, (byte) 8);
        }
    }

    public final void v0(Context context) {
        this.Y1.f(this);
        super/*p.t2u*/.v0(context);
    }
}

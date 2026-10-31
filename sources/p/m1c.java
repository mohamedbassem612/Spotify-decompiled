package p;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m1c {
    public final pv71 a;
    public final mhg1 b;
    public final Function0 c;
    public final hrr0 d;
    public n511 i;
    public n511 j;
    public final hrr0 e = v8r.q(qgo1.a);
    public ni20 f = n1c.a;
    public final l1c g = new l1c(this, (byte) 1);
    public final hrr0 h = v8r.q((Object) null);
    public final l1c k = new l1c(this, (byte) 0);

    public m1c(pv71 pv71Var, mhg1 mhg1Var, zgg1 zgg1Var, Function0 function0) {
        this.a = pv71Var;
        this.b = mhg1Var;
        this.c = function0;
        this.d = v8r.q(zgg1Var);
    }

    public final void a(n511 n511Var, n511 n511Var2, wq71 wq71Var, n511 n511Var3, ne5 ne5Var) {
        n8b1 n8b1VarL0;
        if (this.a.c()) {
            this.i = n511Var;
            this.j = n511Var2;
            hrr0 hrr0Var = this.h;
            if (((tob1) hrr0Var.getValue()) == null) {
                if (wq71Var == null) {
                    wq71Var = (wq71) this.e.getValue();
                }
                switch (wq71Var.a) {
                    case 0:
                        n8b1VarL0 = irn1.l0(0.0f, 0.0f, ckk1.a, 3);
                        break;
                    default:
                        n8b1VarL0 = sv71.a;
                        break;
                }
                this.f = n8b1VarL0;
            }
            hrr0Var.setValue(((zgg1) this.d.getValue()).a(this.g, n511Var3, ne5Var, this.k));
        }
    }

    public final boolean b() {
        return ((Boolean) this.b.d.getValue()).booleanValue();
    }

    public final n511 c() {
        tob1 tob1Var;
        n511 n511Var;
        if (!this.a.c() || (tob1Var = (tob1) this.h.getValue()) == null || (n511Var = (n511) tob1Var.getValue()) == null) {
            return null;
        }
        long j = ((Offset) this.c.invoke()).a;
        return !Offset.c(j, 0L) ? n511Var.n(j) : n511Var;
    }

    public final boolean d() {
        mhg1 mhg1Var = this.b;
        while (true) {
            mhg1 mhg1Var2 = mhg1Var.b;
            if (mhg1Var2 == null) {
                return !u890.j(mhg1Var.a.P0(), mhg1Var.d.getValue());
            }
            mhg1Var = mhg1Var2;
        }
    }
}

package p;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w8w extends auj {
    public final thn Y1;
    public gw70 Z1;
    public h85 a2;
    public Function0 b2 = xzu.T0;

    public w8w(thn thnVar) {
        this.Y1 = thnVar;
    }

    public final void D0() {
        ((zf30) this).h1 = true;
        dismiss();
    }

    public final void k1(t4n t4nVar) {
        t4nVar.g().L(3);
    }

    public final void n1(xtj xtjVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1902560224);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            kiv kivVar = oi7.a;
            gw70 gw70Var = this.Z1;
            if (gw70Var == null) {
                u890.C("imageLoader");
                throw null;
            }
            mod.b(kivVar.a(gw70Var), apo.r(-654874848, new utt(this, (byte) 27), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o1t(this, xtjVar, i, (byte) 25);
        }
    }

    public final void v0(Context context) {
        this.Y1.f(this);
        super/*p.t2u*/.v0(context);
    }
}

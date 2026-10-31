package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class evw extends zf30 implements z0d1, lir0 {
    public final thn F1;
    public kg0 G1;
    public bvw H1;
    public mir0 I1;
    public Map J1;
    public final bck1 K1;

    public evw(thn thnVar) {
        this.F1 = thnVar;
        cvw cvwVar = new cvw(this, (byte) 2);
        znb0 znb0VarS = dm5.S(3, new x5u(new x5u(this, (byte) 1), (byte) 2));
        this.K1 = ebp1.j(this, rc11.a.b(wvw.class), new g22(znb0VarS, (byte) 6), new g22(znb0VarS, (byte) 7), cvwVar);
    }

    public final void I0(View view, Bundle bundle) {
        if (bundle == null) {
            ((wvw) this.K1.getValue()).X();
        }
        N0().J().a(n0(), new ydb(this, (byte) 7));
    }

    @Override // p.lir0
    public final mir0 c() {
        mir0 mir0Var = this.I1;
        if (mir0Var != null) {
            return mir0Var;
        }
        u890.C("pageObservable");
        throw null;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return bmq0.n(this, apo.j(-1548209382, new dvw(this, (byte) 2), true));
    }
}

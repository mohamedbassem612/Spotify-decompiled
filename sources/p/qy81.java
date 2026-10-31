package p;

import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qy81 extends z511 {
    public qtw d;
    public Object e;

    @Override // p.z511
    public final int e() {
        return this.d != null ? 1 : 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.z511
    public final void n(int i, w611 w611Var) throws NoWhenBranchMatchedException {
        py81 py81Var = (py81) w611Var;
        Object obj = this.e;
        if (obj == null) {
            return;
        }
        dtw dtwVarE = py81Var.E();
        tka0 tka0Var = dtw.C;
        dtwVarE.k(obj, goa0.a, null);
    }

    @Override // p.z511
    public final w611 p(int i, ViewGroup viewGroup) {
        qtw qtwVar = this.d;
        if (qtwVar != null) {
            tka0 tka0Var = dtw.C;
            return new py81(mhc.d(viewGroup.getContext(), viewGroup, qtwVar, null, 24));
        }
        eg.m("viewElement must be set before creating ViewHolder");
        return null;
    }
}

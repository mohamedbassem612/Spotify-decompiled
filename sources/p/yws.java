package p;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yws extends j0g1 {
    public boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public boolean N;
    public final boolean O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseBooleanArray R;

    public yws(zws zwsVar) {
        d(zwsVar);
        this.J = zwsVar.w0;
        this.K = zwsVar.x0;
        this.L = zwsVar.y0;
        this.M = zwsVar.z0;
        this.N = zwsVar.A0;
        this.O = zwsVar.B0;
        this.P = zwsVar.C0;
        SparseArray sparseArray = zwsVar.D0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.Q = sparseArray2;
        this.R = zwsVar.E0.clone();
    }

    @Override // p.j0g1
    public final void a(h0g1 h0g1Var) {
        this.H.put(h0g1Var.a, h0g1Var);
    }

    @Override // p.j0g1
    public final k0g1 b() {
        return new zws(this);
    }

    @Override // p.j0g1
    public final j0g1 c() {
        super.c();
        return this;
    }

    @Override // p.j0g1
    public final j0g1 f(h0g1 h0g1Var) {
        super.f(h0g1Var);
        return this;
    }

    @Override // p.j0g1
    public final j0g1 g(String[] strArr) {
        super.g(strArr);
        return this;
    }

    @Override // p.j0g1
    public final j0g1 h(String[] strArr) {
        super.h(strArr);
        return this;
    }

    public final void j(Set set) {
        this.I.clear();
        this.I.addAll(set);
    }

    public final void k(String str) {
        if (str == null) {
            g(new String[0]);
        } else {
            g(new String[]{str});
        }
    }

    public final void l(String str) {
        h(new String[]{str});
    }

    public final void m() {
        super.i(5, true);
    }

    public yws() {
        this.Q = new SparseArray();
        this.R = new SparseBooleanArray();
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
    }
}

package p;

import android.os.Parcelable;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v6s implements hac0, iac0 {
    public final Parcelable a;
    public final gj5 b;
    public final hzm0 c;
    public final Set d;
    public final List e;
    public boolean f;
    public final lxg g = nxg.a();
    public final tac0 h;
    public final pj00 i;
    public final lte0 t;

    public v6s(Parcelable parcelable, gj5 gj5Var, hzm0 hzm0Var, Set set, Set set2, List list) {
        this.a = parcelable;
        this.b = gj5Var;
        this.c = hzm0Var;
        this.d = set2;
        this.e = list;
        tac0 tac0Var = new tac0(this, true);
        this.h = tac0Var;
        u6s u6sVar = parcelable instanceof u6s ? (u6s) parcelable : null;
        if (u6sVar != null) {
            this.f = u6sVar.a;
        }
        lte0 lte0Var = new lte0(set);
        this.t = lte0Var;
        tac0Var.a(lte0Var);
        pj00 pj00Var = new pj00(tac0Var, (byte) 2);
        this.i = pj00Var;
        ((f0i) gj5Var).a.a(pj00Var);
    }

    public final x8c0 getLifecycle() {
        return this.h;
    }
}

package p;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mg81 {
    public final gw70 a;
    public final dg30 b;
    public final ph81 c;
    public final uzl0 d;
    public final kly0 e;
    public final List f;

    public mg81(gw70 gw70Var, dg30 dg30Var, ph81 ph81Var, uzl0 uzl0Var, thq thqVar, List list) {
        this.a = gw70Var;
        this.b = dg30Var;
        this.c = ph81Var;
        this.d = uzl0Var;
        this.e = thqVar;
        this.f = list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, java.lang.Object, p.lg81] */
    public final lg81 a(fh81 fh81Var) {
        ?? lg81Var = new lg81(this, this.b, fh81Var);
        lg81Var.setId(2131430974);
        lg81Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        op80 op80VarK = j6p1.k(new h3h1(new d781(this, (byte) 10)), new jp80(new fe81((Object) lg81Var, (byte) 1)));
        ph81 ph81Var = this.c;
        xhk1.c((View) lg81Var, j6p1.k(j6p1.k(op80VarK, new eq80(new e3h1(ph81Var.a(), ph81Var.a(), ph81Var.a()))), new g6r0(q601.b(fh81Var.t1))));
        return lg81Var;
    }
}

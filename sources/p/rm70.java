package p;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rm70 extends emc0 {
    public final st60 e;

    public rm70() {
        gid gidVar = new gid(sm70.d);
        if (h0p1.l()) {
            gidVar.j(new vi7((byte) 3));
        }
        super(gidVar.a());
        this.e = new st60(new ft30(this), new nd70(this, (byte) 2));
    }

    @Override // p.z511
    public final int g(int i) {
        return this.e.v(i);
    }

    @Override // p.z511
    public final void n(int i, w611 w611Var) {
        this.e.z((tm70) w611Var, i);
    }

    @Override // p.z511
    public final void o(w611 w611Var, int i, List list) {
        this.e.A((tm70) w611Var, i, o7h.s0(list));
    }

    @Override // p.z511
    public final w611 p(int i, ViewGroup viewGroup) {
        return this.e.B(i, viewGroup);
    }
}

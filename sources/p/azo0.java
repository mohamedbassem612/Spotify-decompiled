package p;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class azo0 extends w511 {
    public final Resources d;
    public final l0x0 e;
    public List f = z6x.a;
    public int g = 2;
    public tro0 h;

    public azo0(Resources resources, l0x0 l0x0Var) {
        this.d = resources;
        this.e = l0x0Var;
    }

    public final int e() {
        return this.f.size();
    }

    public final void n(int i, w611 w611Var) {
        c2p0 c2p0Var = (c2p0) w611Var;
        m2g1 m2g1Var = (m2g1) this.f.get(i);
        View view = ((w611) c2p0Var).a;
        view.setAlpha(1.0f);
        c2p0Var.V0 = this.g;
        c2p0Var.J(m2g1Var);
        view.setOnClickListener(new hid0(this, (byte) 10));
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        l0x0 l0x0Var = this.e;
        return new c2p0(viewGroup, new imx0((cbv) l0x0Var.b, (i8h1) l0x0Var.c, (h0p0) l0x0Var.d));
    }
}

package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oq4 implements pdy0 {
    public final boolean a;
    public final int b;
    public final luk c;
    public final idd1 d = new idd1(new lp4(this, (byte) 27));

    public oq4(int i, luk lukVar, boolean z) {
        this.a = z;
        this.b = i;
        this.c = lukVar;
    }

    public final boolean a() {
        oq4 oq4Var = (oq4) this.d.getValue();
        return oq4Var != null ? oq4Var.a() : this.a;
    }

    public final int b() {
        oq4 oq4Var = (oq4) this.d.getValue();
        return oq4Var != null ? oq4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("use_show_condition_for_sections", "android-list-ux-platform-itemlistcomposerimpl", a()), new fpb("view_port_size", "android-list-ux-platform-itemlistcomposerimpl", b(), 50, 1000)});
    }
}

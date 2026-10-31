package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pl4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final luk f;
    public final idd1 g;

    public pl4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = lukVar;
        this.g = new idd1(new gk4(this, (byte) 11));
    }

    public final boolean a() {
        pl4 pl4Var = (pl4) this.g.getValue();
        return pl4Var != null ? pl4Var.a() : this.a;
    }

    public final boolean b() {
        pl4 pl4Var = (pl4) this.g.getValue();
        return pl4Var != null ? pl4Var.b() : this.b;
    }

    public final boolean c() {
        pl4 pl4Var = (pl4) this.g.getValue();
        return pl4Var != null ? pl4Var.c() : this.c;
    }

    public final boolean d() {
        pl4 pl4Var = (pl4) this.g.getValue();
        return pl4Var != null ? pl4Var.d() : this.d;
    }

    public final boolean e() {
        pl4 pl4Var = (pl4) this.g.getValue();
        return pl4Var != null ? pl4Var.e() : this.e;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("episode_preview_enabled", "android-lib-assisted-curation", a()), new fpb("episode_search_preview_enabled", "android-lib-assisted-curation", b()), new fpb("preview_enabled", "android-lib-assisted-curation", c()), new fpb("search_preview_enabled", "android-lib-assisted-curation", d()), new fpb("use_improved_cards_sort_order", "android-lib-assisted-curation", e())});
    }

    public pl4(luk lukVar) {
        this(true, true, true, true, false, lukVar);
    }
}

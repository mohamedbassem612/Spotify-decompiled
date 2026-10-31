package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hg4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final tgp0 c;
    public final luk d;
    public final idd1 e;
    public final idd1 f;

    public hg4(boolean z, boolean z2, tgp0 tgp0Var, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = tgp0Var;
        this.d = lukVar;
        this.e = new idd1(new gg4(this, (byte) 1));
        this.f = new idd1(new gg4(this, (byte) 0));
    }

    public final boolean a() {
        hg4 hg4Var = (hg4) this.f.getValue();
        return hg4Var != null ? hg4Var.a() : this.a;
    }

    public final boolean b() {
        hg4 hg4Var = (hg4) this.f.getValue();
        return hg4Var != null ? hg4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("debug_is_in_kids_mode", "android-feature-kidsmode", a()), new fpb("kids_mode_enabled", "android-feature-kidsmode", b())});
    }

    public hg4(tgp0 tgp0Var, luk lukVar) {
        this(false, false, tgp0Var, lukVar);
    }
}

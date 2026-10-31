package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aw4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final feh1 c;
    public final idd1 d = new idd1(new fv4(this, 13));

    public aw4(boolean z, boolean z2, feh1 feh1Var) {
        this.a = z;
        this.b = z2;
        this.c = feh1Var;
    }

    public final boolean a() {
        aw4 aw4Var = (aw4) this.d.getValue();
        return aw4Var != null ? aw4Var.a() : this.a;
    }

    public final boolean b() {
        aw4 aw4Var = (aw4) this.d.getValue();
        return aw4Var != null ? aw4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("force_s_finder_to_use_hydrogen_search", "android-oem-integrations-samsung-unauth-properties-service", a()), new fpb("s_finder_enable_unauth_search", "android-oem-integrations-samsung-unauth-properties-service", b())});
    }
}

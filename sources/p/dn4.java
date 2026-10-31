package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dn4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e;

    public dn4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
        this.e = new idd1(new om4(this, (byte) 13));
    }

    public final boolean a() {
        dn4 dn4Var = (dn4) this.e.getValue();
        return dn4Var != null ? dn4Var.a() : this.a;
    }

    public final boolean b() {
        dn4 dn4Var = (dn4) this.e.getValue();
        return dn4Var != null ? dn4Var.b() : this.b;
    }

    public final boolean c() {
        dn4 dn4Var = (dn4) this.e.getValue();
        return dn4Var != null ? dn4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("diff_util_enabled", "android-libs-nowplaying-elements-carousel", a()), new fpb("identity_diffing_enabled", "android-libs-nowplaying-elements-carousel", b()), new fpb("use_track_carousel_element", "android-libs-nowplaying-elements-carousel", c())});
    }

    public dn4(luk lukVar) {
        this(true, false, false, lukVar);
    }
}

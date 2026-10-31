package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tl4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public tl4(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
        this.f = new idd1(new gk4(this, (byte) 14));
    }

    public final boolean a() {
        tl4 tl4Var = (tl4) this.f.getValue();
        return tl4Var != null ? tl4Var.a() : this.a;
    }

    public final boolean b() {
        tl4 tl4Var = (tl4) this.f.getValue();
        return tl4Var != null ? tl4Var.b() : this.b;
    }

    public final boolean c() {
        tl4 tl4Var = (tl4) this.f.getValue();
        return tl4Var != null ? tl4Var.c() : this.c;
    }

    public final boolean d() {
        tl4 tl4Var = (tl4) this.f.getValue();
        return tl4Var != null ? tl4Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("ads_android_turn_on_comscore", "android-libs-ads-common", a()), new fpb("ads_enable_one_trust_cmp_android", "android-libs-ads-common", b()), new fpb("enable_ads_connect_state_observer", "android-libs-ads-common", c()), new fpb("enable_image_loading_for_espresso_tests", "android-libs-ads-common", d()));
    }

    public tl4(luk lukVar) {
        this(false, false, true, false, lukVar);
    }
}

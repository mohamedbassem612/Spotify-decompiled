package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b65 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f = new idd1(new f55(this, (byte) 12));

    public b65(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
    }

    public final boolean a() {
        b65 b65Var = (b65) this.f.getValue();
        return b65Var != null ? b65Var.a() : this.a;
    }

    public final boolean b() {
        b65 b65Var = (b65) this.f.getValue();
        return b65Var != null ? b65Var.b() : this.b;
    }

    public final boolean c() {
        b65 b65Var = (b65) this.f.getValue();
        return b65Var != null ? b65Var.c() : this.c;
    }

    public final boolean d() {
        b65 b65Var = (b65) this.f.getValue();
        return b65Var != null ? b65Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("display_ad_element_v2_enabled", "android-uilogic", a()), new fpb("enable_record_visible_events", "android-uilogic", b()), new fpb("video_ad_element_v2_enabled", "android-uilogic", c()), new fpb("video_brand_ads_auto_dismiss_enabled", "android-uilogic", d()));
    }
}

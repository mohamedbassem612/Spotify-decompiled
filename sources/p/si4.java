package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class si4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f = new idd1(new sh4(this, (byte) 16));

    public si4(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
    }

    public final boolean a() {
        si4 si4Var = (si4) this.f.getValue();
        return si4Var != null ? si4Var.a() : this.a;
    }

    public final boolean b() {
        si4 si4Var = (si4) this.f.getValue();
        return si4Var != null ? si4Var.b() : this.b;
    }

    public final boolean c() {
        si4 si4Var = (si4) this.f.getValue();
        return si4Var != null ? si4Var.c() : this.c;
    }

    public final boolean d() {
        si4 si4Var = (si4) this.f.getValue();
        return si4Var != null ? si4Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("campaign_enabled", "android-feature-unboxing-availability-impl", a()), new fpb("marques_icon_enabled", "android-feature-unboxing-availability-impl", b()), new fpb("premium_entry_banner", "android-feature-unboxing-availability-impl", c()), new fpb("premium_entry_modal", "android-feature-unboxing-availability-impl", d()));
    }
}

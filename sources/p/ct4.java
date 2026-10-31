package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ct4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new rq4(this, (byte) 20));

    public ct4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        ct4 ct4Var = (ct4) this.e.getValue();
        return ct4Var != null ? ct4Var.a() : this.a;
    }

    public final boolean b() {
        ct4 ct4Var = (ct4) this.e.getValue();
        return ct4Var != null ? ct4Var.b() : this.b;
    }

    public final boolean c() {
        ct4 ct4Var = (ct4) this.e.getValue();
        return ct4Var != null ? ct4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("membership_upsell_enabled", "android-membership-upsell", a()), new fpb("membership_welcome_clip_enabled", "android-membership-upsell", b()), new fpb("show_membership_badge_dialog_enabled", "android-membership-upsell", c())});
    }
}

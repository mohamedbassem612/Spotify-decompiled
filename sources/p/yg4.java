package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yg4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final luk k;
    public final idd1 l;

    public yg4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, boolean z9, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = i;
        this.j = z9;
        this.k = lukVar;
        this.l = new idd1(new cg4(this, (byte) 14));
    }

    public final yg4 a() {
        return (yg4) this.l.getValue();
    }

    public final boolean b() {
        yg4 yg4VarA = a();
        return yg4VarA != null ? yg4VarA.b() : this.a;
    }

    public final boolean c() {
        yg4 yg4VarA = a();
        return yg4VarA != null ? yg4VarA.c() : this.b;
    }

    public final boolean d() {
        yg4 yg4VarA = a();
        return yg4VarA != null ? yg4VarA.d() : this.c;
    }

    public final boolean e() {
        yg4 yg4VarA = a();
        return yg4VarA != null ? yg4VarA.e() : this.d;
    }

    public final boolean f() {
        yg4 yg4VarA = a();
        return yg4VarA != null ? yg4VarA.f() : this.e;
    }

    public final boolean g() {
        yg4 yg4VarA = a();
        return yg4VarA != null ? yg4VarA.g() : this.f;
    }

    public final int h() {
        yg4 yg4VarA = a();
        return yg4VarA != null ? yg4VarA.h() : this.i;
    }

    public final boolean i() {
        yg4 yg4VarA = a();
        return yg4VarA != null ? yg4VarA.i() : this.j;
    }

    public final boolean j() {
        yg4 yg4VarA = a();
        return yg4VarA != null ? yg4VarA.j() : this.g;
    }

    public final boolean k() {
        yg4 yg4VarA = a();
        return yg4VarA != null ? yg4VarA.k() : this.h;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_categories_page", "android-feature-notificationsettings", b()), new fpb("enable_category_details_page", "android-feature-notificationsettings", c()), new fpb("enable_group_categories_page", "android-feature-notificationsettings", d()), new fpb("enable_language_selection_row", "android-feature-notificationsettings", e()), new fpb("enable_podcast_nen_settings_page", "android-feature-notificationsettings", f()), new fpb("flatten_social_notification_preferences", "android-feature-notificationsettings", g()), new fpb("is_permission_card_enabled", "android-feature-notificationsettings", j()), new fpb("is_permission_dialog_enabled", "android-feature-notificationsettings", k()), new fpb("nen_opt_in_position", "android-feature-notificationsettings", h(), 0, 11), new fpb("preferences_show_comments_category", "android-feature-notificationsettings", i()));
    }

    public yg4(luk lukVar) {
        this(false, false, false, false, false, false, false, false, 11, false, lukVar);
    }
}

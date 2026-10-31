package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pf4 implements pdy0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final of4 i;
    public final int j;
    public final luk k;
    public final idd1 l = new idd1(new pe4(this, (byte) 20));

    public pf4(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, int i3, of4 of4Var, int i4, luk lukVar) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = i2;
        this.h = i3;
        this.i = of4Var;
        this.j = i4;
        this.k = lukVar;
    }

    public final int a() {
        pf4 pf4VarB = b();
        return pf4VarB != null ? pf4VarB.a() : this.a;
    }

    public final pf4 b() {
        return (pf4) this.l.getValue();
    }

    public final boolean c() {
        pf4 pf4VarB = b();
        return pf4VarB != null ? pf4VarB.c() : this.b;
    }

    public final boolean d() {
        pf4 pf4VarB = b();
        return pf4VarB != null ? pf4VarB.d() : this.c;
    }

    public final boolean e() {
        pf4 pf4VarB = b();
        return pf4VarB != null ? pf4VarB.e() : this.d;
    }

    public final boolean f() {
        pf4 pf4VarB = b();
        return pf4VarB != null ? pf4VarB.f() : this.e;
    }

    public final boolean g() {
        pf4 pf4VarB = b();
        return pf4VarB != null ? pf4VarB.g() : this.f;
    }

    public final int h() {
        pf4 pf4VarB = b();
        return pf4VarB != null ? pf4VarB.h() : this.g;
    }

    public final int i() {
        pf4 pf4VarB = b();
        return pf4VarB != null ? pf4VarB.i() : this.h;
    }

    public final of4 j() {
        of4 of4VarJ;
        pf4 pf4VarB = b();
        return (pf4VarB == null || (of4VarJ = pf4VarB.j()) == null) ? this.i : of4VarJ;
    }

    public final int k() {
        pf4 pf4VarB = b();
        return pf4VarB != null ? pf4VarB.k() : this.j;
    }

    public final List models() {
        fpb fpbVar = new fpb("affirmation_snackbar_time_window_ms", "android-feature-campfire-notification-nudges", a(), 60000, 3600000);
        fpb fpbVar2 = new fpb("disable_non_essential_push_on_nudge_interaction", "android-feature-campfire-notification-nudges", c());
        fpb fpbVar3 = new fpb("enable_dismiss_button_on_nudge", "android-feature-campfire-notification-nudges", d());
        fpb fpbVar4 = new fpb("enable_notifications_opt_in_nudge_on_chat_list", "android-feature-campfire-notification-nudges", e());
        fpb fpbVar5 = new fpb("enable_notifications_opt_in_nudge_on_chat_page", "android-feature-campfire-notification-nudges", f());
        fpb fpbVar6 = new fpb("enable_notifications_opt_in_nudge_on_side_drawer", "android-feature-campfire-notification-nudges", g());
        fpb fpbVar7 = new fpb("max_nudge_dismiss_count", "android-feature-campfire-notification-nudges", h(), 0, 100);
        fpb fpbVar8 = new fpb("max_nudge_interaction_count", "android-feature-campfire-notification-nudges", i(), 0, 100);
        String str = j().a;
        of4[] of4VarArrValues = of4.values();
        ArrayList arrayList = new ArrayList(of4VarArrValues.length);
        for (of4 of4Var : of4VarArrValues) {
            arrayList.add(of4Var.a);
        }
        return p7h.M(new fpb[]{fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, fpbVar6, fpbVar7, fpbVar8, new fpb("notifications_opt_in_nudge_flow", "android-feature-campfire-notification-nudges", str, arrayList), new fpb("nudge_storage_version", "android-feature-campfire-notification-nudges", k(), 1, 100)});
    }
}

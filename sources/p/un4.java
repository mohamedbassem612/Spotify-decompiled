package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class un4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final tn4 f;
    public final luk g;
    public final idd1 h;

    public un4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, tn4 tn4Var, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = tn4Var;
        this.g = lukVar;
        this.h = new idd1(new om4(this, (byte) 25));
    }

    public final un4 a() {
        return (un4) this.h.getValue();
    }

    public final boolean b() {
        un4 un4VarA = a();
        return un4VarA != null ? un4VarA.b() : this.a;
    }

    public final boolean c() {
        un4 un4VarA = a();
        return un4VarA != null ? un4VarA.c() : this.b;
    }

    public final boolean d() {
        un4 un4VarA = a();
        return un4VarA != null ? un4VarA.d() : this.c;
    }

    public final boolean e() {
        un4 un4VarA = a();
        return un4VarA != null ? un4VarA.e() : this.d;
    }

    public final boolean f() {
        un4 un4VarA = a();
        return un4VarA != null ? un4VarA.f() : this.e;
    }

    public final tn4 g() {
        tn4 tn4VarG;
        un4 un4VarA = a();
        return (un4VarA == null || (tn4VarG = un4VarA.g()) == null) ? this.f : tn4VarG;
    }

    public final List models() {
        fpb fpbVar = new fpb("enable_contextual_shuffle_upsell", "android-libs-nowplaying-video-first-mode", b());
        fpb fpbVar2 = new fpb("enable_media_mode_acceptance", "android-libs-nowplaying-video-first-mode", c());
        fpb fpbVar3 = new fpb("enable_swipe_to_collapse", "android-libs-nowplaying-video-first-mode", d());
        fpb fpbVar4 = new fpb("enable_video_interceptor_overlay", "android-libs-nowplaying-video-first-mode", e());
        fpb fpbVar5 = new fpb("mftplus_show_upsell_skip_next_limit", "android-libs-nowplaying-video-first-mode", f());
        String str = g().a;
        tn4[] tn4VarArrValues = tn4.values();
        ArrayList arrayList = new ArrayList(tn4VarArrValues.length);
        for (tn4 tn4Var : tn4VarArrValues) {
            arrayList.add(tn4Var.a);
        }
        return p7h.M(new fpb[]{fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, new fpb("video_behaviour", "android-libs-nowplaying-video-first-mode", str, arrayList)});
    }

    public un4(luk lukVar) {
        this(true, false, false, false, false, tn4.STICKY_VIDEO_ONLY, lukVar);
    }
}

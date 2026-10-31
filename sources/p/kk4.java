package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kk4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final luk g;
    public final idd1 h;

    public kk4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = lukVar;
        this.h = new idd1(new gk4(this, (byte) 2));
    }

    public final boolean a() {
        kk4 kk4VarF = f();
        return kk4VarF != null ? kk4VarF.a() : this.a;
    }

    public final boolean b() {
        kk4 kk4VarF = f();
        return kk4VarF != null ? kk4VarF.b() : this.b;
    }

    public final boolean c() {
        kk4 kk4VarF = f();
        return kk4VarF != null ? kk4VarF.c() : this.c;
    }

    public final boolean d() {
        kk4 kk4VarF = f();
        return kk4VarF != null ? kk4VarF.d() : this.d;
    }

    public final boolean e() {
        kk4 kk4VarF = f();
        return kk4VarF != null ? kk4VarF.e() : this.e;
    }

    public final kk4 f() {
        return (kk4) this.h.getValue();
    }

    public final boolean g() {
        kk4 kk4VarF = f();
        return kk4VarF != null ? kk4VarF.g() : this.f;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("bridge_collection_enabled", "android-genui-chromeless", a()), new fpb("bridge_location_enabled", "android-genui-chromeless", b()), new fpb("bridge_navigation_enabled", "android-genui-chromeless", c()), new fpb("bridge_playback_enabled", "android-genui-chromeless", d()), new fpb("bridge_video_playback_enabled", "android-genui-chromeless", e()), new fpb("is_enabled", "android-genui-chromeless", g())});
    }

    public kk4(luk lukVar) {
        this(true, true, true, true, true, true, lukVar);
    }
}

package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bm4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f = new idd1(new gk4(this, (byte) 20));

    public bm4(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
    }

    public final boolean a() {
        bm4 bm4Var = (bm4) this.f.getValue();
        return bm4Var != null ? bm4Var.a() : this.a;
    }

    public final boolean b() {
        bm4 bm4Var = (bm4) this.f.getValue();
        return bm4Var != null ? bm4Var.b() : this.b;
    }

    public final boolean c() {
        bm4 bm4Var = (bm4) this.f.getValue();
        return bm4Var != null ? bm4Var.c() : this.c;
    }

    public final boolean d() {
        bm4 bm4Var = (bm4) this.f.getValue();
        return bm4Var != null ? bm4Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("add_to_blend_enabled", "android-libs-blend", a()), new fpb("hide_from_blend_enabled", "android-libs-blend", b()), new fpb("remove_from_blend_enabled", "android-libs-blend", c()), new fpb("social_prompting_enabled", "android-libs-blend", d()));
    }
}

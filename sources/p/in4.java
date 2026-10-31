package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class in4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public in4(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
        this.f = new idd1(new hn4(this, (byte) 0));
    }

    public final boolean a() {
        in4 in4Var = (in4) this.f.getValue();
        return in4Var != null ? in4Var.a() : this.a;
    }

    public final boolean b() {
        in4 in4Var = (in4) this.f.getValue();
        return in4Var != null ? in4Var.b() : this.b;
    }

    public final boolean c() {
        in4 in4Var = (in4) this.f.getValue();
        return in4Var != null ? in4Var.c() : this.c;
    }

    public final boolean d() {
        in4 in4Var = (in4) this.f.getValue();
        return in4Var != null ? in4Var.d() : this.d;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("ariana_petal_play_button_easter_egg", "android-libs-nowplaying-elements-playpause", a()), new fpb("color_change_variant_a", "android-libs-nowplaying-elements-playpause", b()), new fpb("color_change_variant_b", "android-libs-nowplaying-elements-playpause", c()), new fpb("harry_potter_play_button_surround_easter_egg", "android-libs-nowplaying-elements-playpause", d())});
    }

    public in4(luk lukVar) {
        this(false, false, false, false, lukVar);
    }
}

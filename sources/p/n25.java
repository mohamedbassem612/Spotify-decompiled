package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n25 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final feh1 f;
    public final idd1 g = new idd1(new k25(this, (byte) 2));

    public n25(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, feh1 feh1Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = feh1Var;
    }

    public final boolean a() {
        n25 n25Var = (n25) this.g.getValue();
        return n25Var != null ? n25Var.a() : this.a;
    }

    public final boolean b() {
        n25 n25Var = (n25) this.g.getValue();
        return n25Var != null ? n25Var.b() : this.b;
    }

    public final boolean c() {
        n25 n25Var = (n25) this.g.getValue();
        return n25Var != null ? n25Var.c() : this.c;
    }

    public final boolean d() {
        n25 n25Var = (n25) this.g.getValue();
        return n25Var != null ? n25Var.d() : this.d;
    }

    public final boolean e() {
        n25 n25Var = (n25) this.g.getValue();
        return n25Var != null ? n25Var.e() : this.e;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_programmatic_episode_card", "android-system-encore", a()), new fpb("enable_programmatic_play_button", "android-system-encore", b()), new fpb("enable_programmatic_section_headings", "android-system-encore", c()), new fpb("enable_programmatic_track_row", "android-system-encore", d()), new fpb("tinted_secondary_buttons", "android-system-encore", e())});
    }
}

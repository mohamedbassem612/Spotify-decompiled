package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cr4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new rq4(this, (byte) 7));

    public cr4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        cr4 cr4Var = (cr4) this.e.getValue();
        return cr4Var != null ? cr4Var.a() : this.a;
    }

    public final boolean b() {
        cr4 cr4Var = (cr4) this.e.getValue();
        return cr4Var != null ? cr4Var.b() : this.b;
    }

    public final boolean c() {
        cr4 cr4Var = (cr4) this.e.getValue();
        return cr4Var != null ? cr4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_lyrics_fullscreen_from_anywhere", "android-lyrics-fullscreenview", a()), new fpb("enable_lyrics_multilanguage", "android-lyrics-fullscreenview", b()), new fpb("user_generated_report_enabled", "android-lyrics-fullscreenview", c())});
    }
}

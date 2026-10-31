package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j55 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public j55(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
        this.f = new idd1(new f55(this, (byte) 3));
    }

    public final boolean a() {
        j55 j55Var = (j55) this.f.getValue();
        return j55Var != null ? j55Var.a() : this.a;
    }

    public final boolean b() {
        j55 j55Var = (j55) this.f.getValue();
        return j55Var != null ? j55Var.b() : this.b;
    }

    public final boolean c() {
        j55 j55Var = (j55) this.f.getValue();
        return j55Var != null ? j55Var.c() : this.c;
    }

    public final boolean d() {
        j55 j55Var = (j55) this.f.getValue();
        return j55Var != null ? j55Var.d() : this.d;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_action_chips", "android-transcript-read-along", a()), new fpb("enable_audio_language_translation", "android-transcript-read-along", b()), new fpb("enable_translation", "android-transcript-read-along", c()), new fpb("use_compose_page", "android-transcript-read-along", d())});
    }

    public j55(luk lukVar) {
        this(false, false, false, false, lukVar);
    }
}

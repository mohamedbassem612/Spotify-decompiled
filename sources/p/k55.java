package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k55 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new f55(this, (byte) 4));

    public k55(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        k55 k55Var = (k55) this.d.getValue();
        return k55Var != null ? k55Var.a() : this.a;
    }

    public final boolean b() {
        k55 k55Var = (k55) this.d.getValue();
        return k55Var != null ? k55Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_transcript_translation", "android-transcript-scroll-card", a()), new fpb("use_compose_transcript_list", "android-transcript-scroll-card", b())});
    }
}

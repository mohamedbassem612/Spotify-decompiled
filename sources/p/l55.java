package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l55 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public l55(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new f55(this, (byte) 5));
    }

    public final boolean a() {
        l55 l55Var = (l55) this.d.getValue();
        return l55Var != null ? l55Var.a() : this.a;
    }

    public final boolean b() {
        l55 l55Var = (l55) this.d.getValue();
        return l55Var != null ? l55Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_translation", "android-transcript-selection", a()), new fpb("use_compose_page", "android-transcript-selection", b())});
    }

    public l55(luk lukVar) {
        this(false, false, lukVar);
    }
}

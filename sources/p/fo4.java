package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fo4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new zn4(this, (byte) 5));

    public fo4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        fo4 fo4Var = (fo4) this.e.getValue();
        return fo4Var != null ? fo4Var.a() : this.a;
    }

    public final boolean b() {
        fo4 fo4Var = (fo4) this.e.getValue();
        return fo4Var != null ? fo4Var.b() : this.b;
    }

    public final boolean c() {
        fo4 fo4Var = (fo4) this.e.getValue();
        return fo4Var != null ? fo4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_comments_membership_badge", "android-libs-podcast-interactivity-common", a()), new fpb("show_updated_ui", "android-libs-podcast-interactivity-common", b()), new fpb("use_page_api", "android-libs-podcast-interactivity-common", c()));
    }
}

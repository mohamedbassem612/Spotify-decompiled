package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xm4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new om4(this, (byte) 7));

    public xm4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        xm4 xm4Var = (xm4) this.d.getValue();
        return xm4Var != null ? xm4Var.a() : this.a;
    }

    public final boolean b() {
        xm4 xm4Var = (xm4) this.d.getValue();
        return xm4Var != null ? xm4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("audiobook_chapter_list_button_enabled", "android-libs-newplaying-podcast-mode", a()), new fpb("use_element_api", "android-libs-newplaying-podcast-mode", b())});
    }
}

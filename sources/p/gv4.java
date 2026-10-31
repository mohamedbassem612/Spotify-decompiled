package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gv4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public gv4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new fv4(this, (byte) 0));
    }

    public final boolean a() {
        gv4 gv4Var = (gv4) this.d.getValue();
        return gv4Var != null ? gv4Var.a() : this.a;
    }

    public final boolean b() {
        gv4 gv4Var = (gv4) this.d.getValue();
        return gv4Var != null ? gv4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_npv_page_load_reporting", "android-nowplaying-musicinstallation", a()), new fpb("enable_page_api_npv", "android-nowplaying-musicinstallation", b())});
    }

    public gv4(luk lukVar) {
        this(false, false, lukVar);
    }
}

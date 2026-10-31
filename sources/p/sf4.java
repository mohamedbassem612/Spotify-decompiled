package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sf4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new pe4(this, (byte) 23));

    public sf4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        sf4 sf4Var = (sf4) this.d.getValue();
        return sf4Var != null ? sf4Var.a() : this.a;
    }

    public final boolean b() {
        sf4 sf4Var = (sf4) this.d.getValue();
        return sf4Var != null ? sf4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_work_page", "android-feature-container-root-page", a()), new fpb("rich_series_page_enabled", "android-feature-container-root-page", b())});
    }
}

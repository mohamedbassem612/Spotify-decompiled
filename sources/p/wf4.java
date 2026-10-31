package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wf4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new pe4(this, (byte) 26));

    public wf4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        wf4 wf4Var = (wf4) this.e.getValue();
        return wf4Var != null ? wf4Var.a() : this.a;
    }

    public final boolean b() {
        wf4 wf4Var = (wf4) this.e.getValue();
        return wf4Var != null ? wf4Var.b() : this.b;
    }

    public final boolean c() {
        wf4 wf4Var = (wf4) this.e.getValue();
        return wf4Var != null ? wf4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_metadata_row_data_element", "android-feature-creativeworkplatform", a()), new fpb("include_banned_artist_items_for_managed_account", "android-feature-creativeworkplatform", b()), new fpb("multithreaded_metadata_datasource", "android-feature-creativeworkplatform", c()));
    }
}

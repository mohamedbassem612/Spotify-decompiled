package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class so4 implements pdy0 {
    public final int a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new zn4(this, (byte) 13));

    public so4(int i, luk lukVar, boolean z) {
        this.a = i;
        this.b = z;
        this.c = lukVar;
    }

    public final int a() {
        so4 so4Var = (so4) this.d.getValue();
        return so4Var != null ? so4Var.a() : this.a;
    }

    public final boolean b() {
        so4 so4Var = (so4) this.d.getValue();
        return so4Var != null ? so4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("initial_timeout_milliseconds", "android-list-entity-music-page", a(), 1000, 120000), new fpb("use_show_condition_for_rows", "android-list-entity-music-page", b())});
    }
}

package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eo4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new zn4(this, (byte) 4));

    public eo4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        eo4 eo4Var = (eo4) this.d.getValue();
        return eo4Var != null ? eo4Var.a() : this.a;
    }

    public final boolean b() {
        eo4 eo4Var = (eo4) this.d.getValue();
        return eo4Var != null ? eo4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("use_queue_on_free", "android-libs-podcast-episode-row", a()), new fpb("vodcast_auto_opens_npv", "android-libs-podcast-episode-row", b())});
    }
}

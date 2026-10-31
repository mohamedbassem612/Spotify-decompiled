package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j05 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new uz4(this, (byte) 12));

    public j05(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        j05 j05Var = (j05) this.d.getValue();
        return j05Var != null ? j05Var.a() : this.a;
    }

    public final boolean b() {
        j05 j05Var = (j05) this.d.getValue();
        return j05Var != null ? j05Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb(rca.d, "android-reinventfree-timecappivot-impl", a()), new fpb("route_search_upsell_to_track_selected", "android-reinventfree-timecappivot-impl", b()));
    }
}

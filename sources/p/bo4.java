package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bo4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e;

    public bo4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
        this.e = new idd1(new zn4(this, (byte) 1));
    }

    public final boolean a() {
        bo4 bo4Var = (bo4) this.e.getValue();
        return bo4Var != null ? bo4Var.a() : this.a;
    }

    public final boolean b() {
        bo4 bo4Var = (bo4) this.e.getValue();
        return bo4Var != null ? bo4Var.b() : this.b;
    }

    public final boolean c() {
        bo4 bo4Var = (bo4) this.e.getValue();
        return bo4Var != null ? bo4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("lenses_filter_chips_enabled", "android-libs-playlist-entity-modes-blend", a()), new fpb("referrals_entrypoint_section_enabled", "android-libs-playlist-entity-modes-blend", b()), new fpb("row_slots_enabled", "android-libs-playlist-entity-modes-blend", c())});
    }

    public bo4(luk lukVar) {
        this(true, false, false, lukVar);
    }
}

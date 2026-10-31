package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hff0 extends bmq0 {
    public final /* synthetic */ iff0 b;

    public hff0(iff0 iff0Var) {
        this.b = iff0Var;
    }

    public final void h(d441 d441Var, Object obj) {
        String str;
        bgf0 bgf0Var = (bgf0) obj;
        d441Var.K(1, bgf0Var.f());
        iff0 iff0Var = this.b;
        u2n u2nVarA = iff0Var.a();
        d441Var.K(2, u2nVarA.a.b(new r36(off0.Companion.serializer(), (byte) 0), bgf0Var.c()));
        int iC = l1d.C(bgf0Var.e());
        if (iC == 0) {
            str = "NOT_SYNCED";
        } else if (iC == 1) {
            str = "LINE_SYNCED";
        } else {
            if (iC != 2) {
                eg.o();
                return;
            }
            str = "SYLLABLE_SYNCED";
        }
        d441Var.K(3, str);
        u2n u2nVarA2 = iff0Var.a();
        d441Var.K(4, u2nVarA2.a.b(new r36(xff0.Companion.serializer(), (byte) 0), bgf0Var.g()));
        d441Var.K(5, bgf0Var.b());
        d441Var.r(6, bgf0Var.i() ? 1L : 0L);
        u2n u2nVarA3 = iff0Var.a();
        d441Var.K(7, u2nVarA3.a.b(rff0.Companion.serializer(), bgf0Var.d()));
        u2n u2nVarA4 = iff0Var.a();
        d441Var.K(8, u2nVarA4.a.b(lff0.Companion.serializer(), bgf0Var.a()));
        u2n u2nVarA5 = iff0Var.a();
        d441Var.K(9, u2nVarA5.a.b(agf0.Companion.serializer(), bgf0Var.h()));
    }
}

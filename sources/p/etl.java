package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class etl implements jsw {
    public final kly0 a;
    public final vt1 b;
    public final boolean c;
    public final idd1 d = new idd1(new vjh(this, (byte) 27));
    public final idd1 e = new idd1(new d4e(this, (byte) 7));

    public etl(kly0 kly0Var, vt1 vt1Var, boolean z) {
        this.a = kly0Var;
        this.b = vt1Var;
        this.c = z;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(dtl dtlVar, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(337609342);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(dtlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1027) != 1026)) {
            ctl.a(dtlVar, (iuj) this.d.getValue(), (maa) this.e.getValue(), this.c, null, 0, 0.0f, null, 0.0f, 0.0f, x340Var, i2 & 14, 1008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, this, dtlVar, iu30Var, kswVar, (byte) 11);
        }
    }
}

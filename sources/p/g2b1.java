package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g2b1 extends tca {
    public final kma K;
    public final jma L;

    public g2b1(kma kmaVar, jma jmaVar, vu30 vu30Var, boolean z, pnf1 pnf1Var, int[] iArr, o4a o4aVar, q8n q8nVar, iu30 iu30Var, iu30 iu30Var2, c5u0 c5u0Var) {
        super(vu30Var, z, false, c5u0Var, pnf1Var, iArr, o4aVar, q8nVar, iu30Var, iu30Var2);
        this.K = kmaVar;
        this.L = jmaVar;
    }

    @Override // p.tca
    public final Object E(vjh0 vjh0Var, zi3 zi3Var) {
        String strA = this.L.a(vjh0Var.c());
        kma kmaVar = this.K;
        return Boolean.valueOf(kmaVar != null ? kmaVar.b(strA) : false);
    }
}

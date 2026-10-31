package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tdo {
    public final lzn0 a;
    public final los b;
    public final q8n c;

    public /* synthetic */ tdo(q8n q8nVar, los losVar, lzn0 lzn0Var) {
        this.a = lzn0Var;
        this.b = losVar;
        this.c = q8nVar;
    }

    public Object a(dn90 dn90Var, tv80 tv80Var, a8d1 a8d1Var) {
        boolean z = dn90Var instanceof ww20;
        d9n d9nVar = d9n.a;
        q8n q8nVar = this.c;
        if (z) {
            Object objY = fn31.Y(q8nVar, new gke(this, dn90Var, tv80Var, (lnm) null, (byte) 17), a8d1Var);
            if (objY == d9nVar) {
                return objY;
            }
        } else {
            if (!(dn90Var instanceof vw20)) {
                eg.o();
                return null;
            }
            Object objY2 = fn31.Y(q8nVar, new hzb(this, (lnm) null, (byte) 26), a8d1Var);
            if (objY2 == d9nVar) {
                return objY2;
            }
        }
        return rih1.a;
    }
}

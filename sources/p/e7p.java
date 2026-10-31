package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e7p implements su70 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ e7p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.su70
    public final wu70 b(kly0 kly0Var, u0i u0iVar, lzn0 lzn0Var, vgm vgmVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, hs00 hs00Var, l0x0 l0x0Var) {
        byte b = this.a;
        tsq tsqVar = this.b;
        switch (b) {
            case 0:
                uw0 uw0Var = (uw0) ((d7p) tsqVar).c;
                gw70 gw70VarB = ((ivj) uw0Var.g).b();
                c8o.l(gw70VarB);
                return new wu70(kly0Var, u0iVar, lzn0Var, vgmVar, z, z2, z3, z4, z5, z6, z7, hs00Var, l0x0Var, gw70VarB, (d7p) uw0Var.c);
            default:
                wdm wdmVar = (wdm) tsqVar.c;
                gw70 gw70VarB2 = ((zuj) wdmVar.c).b();
                c8o.l(gw70VarB2);
                return new wu70(kly0Var, u0iVar, lzn0Var, vgmVar, z, z2, z3, z4, z5, z6, z7, hs00Var, l0x0Var, gw70VarB2, (tsq) wdmVar.i);
        }
    }
}

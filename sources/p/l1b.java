package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l1b implements ik90 {
    public final /* synthetic */ byte a;
    public final uq8 b;
    public final yd91 c;
    public final n381 d;

    public l1b(uq8 uq8Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = uq8Var;
                this.c = new yd91(3, new pr90(this, (byte) 10));
                fna0 fna0Var = fna0.b;
                n381 n381Var = p381.a;
                this.d = new n381(fna0Var);
                break;
            case 2:
                this.b = uq8Var;
                this.c = new yd91(3, new pdp0(this, (byte) 11));
                this.d = p381.a;
                break;
            default:
                this.b = uq8Var;
                this.c = new yd91(3, new vv8(this, (byte) 16));
                rza rzaVar = rza.V0;
                n381 n381Var2 = p381.a;
                this.d = new n381(rzaVar);
                break;
        }
    }

    @Override // p.pk90
    public final m381 c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d;
    }

    @Override // p.pk90
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c;
    }

    public void e(k1b k1bVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2001245486);
        byte b = 4;
        int i2 = (x340Var.g(k1bVar) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            this.b.D(k1bVar.b, k1bVar.c ? 2 : 1, k1bVar.d, k1bVar.e, apo.r(-1272830745, new cka(k1bVar, b), x340Var), x340Var, 24576);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hj8(this, k1bVar, i, (byte) 12);
        }
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bvm implements jk90 {
    public final /* synthetic */ byte a;
    public final String b;
    public final yd91 c;
    public final Object d;
    public final m381 e;

    public bvm(String str, d511 d511Var) {
        this.a = (byte) 2;
        this.b = str;
        this.d = d511Var;
        this.c = new yd91(3, new j4f1(this, (byte) 20));
        ppg1 ppg1Var = ppg1.d;
        n381 n381Var = p381.a;
        this.e = new n381(ppg1Var);
    }

    @Override // p.pk90
    public final m381 c() {
        switch (this.a) {
            case 0:
                return (avm) this.e;
            case 1:
                return this.e;
            case 2:
                return this.e;
            default:
                return this.e;
        }
    }

    @Override // p.pk90
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.c;
    }

    public bvm(String str, hsq hsqVar) {
        this.a = (byte) 3;
        this.b = str;
        this.d = hsqVar;
        this.c = new yd91(3, new bkk1(this, (byte) 27));
        gbm1 gbm1Var = gbm1.Q0;
        n381 n381Var = p381.a;
        this.e = new n381(gbm1Var);
    }

    public bvm(String str, uyp uypVar) {
        this.a = (byte) 1;
        this.b = str;
        this.d = uypVar;
        this.c = new yd91(3, new h2y0(this, (byte) 12));
        e6y0 e6y0Var = e6y0.S0;
        n381 n381Var = p381.a;
        this.e = new n381(e6y0Var);
    }

    public bvm(String str, v1p v1pVar, d0r d0rVar, oum oumVar) {
        this.a = (byte) 0;
        this.b = str;
        this.d = oumVar.a();
        j2i j2iVar = igi.a;
        this.c = new yd91(2, new ssm(v1pVar, d0rVar, this, (byte) 2));
        this.e = new avm(this);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h82 implements ok90 {
    public final /* synthetic */ byte a;
    public final String b;
    public final Object c;
    public final yd91 d;
    public final m381 e;

    public h82(yqg yqgVar, bpb1 bpb1Var, String str, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = str;
                this.c = new smp0(yqgVar, new ypg0(x7y0.a, bpb1Var));
                this.d = new yd91(3, new h2y0(this, (byte) 10));
                this.e = p381.a;
                break;
            default:
                this.b = str;
                this.c = new smp0(yqgVar, new ypg0(f82.a, bpb1Var));
                this.d = new yd91(3, new g82(this, (byte) 0));
                this.e = p381.a;
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
        return this.e;
    }

    @Override // p.pk90
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d;
    }

    public h82(String str, z1p z1pVar) {
        this.a = (byte) 2;
        this.b = str;
        this.c = z1pVar;
        this.e = new uq8(this);
        this.d = new yd91(3, new lwe(this, (byte) 24));
    }
}

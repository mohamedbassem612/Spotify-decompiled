package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ech1 implements ok90 {
    public final String a;
    public final hsq b;
    public final smp0 c;
    public final yd91 d = new yd91(3, new dch1(this, (byte) 0));
    public final vnd1 e = new vnd1(this);

    public ech1(yqg yqgVar, bpb1 bpb1Var, String str, hsq hsqVar) {
        this.a = str;
        this.b = hsqVar;
        this.c = new smp0(yqgVar, new ypg0(bch1.a, bpb1Var));
    }

    @Override // p.pk90
    public final m381 c() {
        return this.e;
    }

    @Override // p.pk90
    public final yd91 d() {
        return this.d;
    }
}

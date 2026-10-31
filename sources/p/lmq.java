package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lmq {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ lmq(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final yby0 a() {
        byte b = this.a;
        ipq ipqVar = this.b;
        switch (b) {
            case 0:
                qqp qqpVar = (qqp) ((jxp) ipqVar).c;
                yqg yqgVar = (yqg) ((z0q) qqpVar.d).a.J1.get();
                c8o.l(yqgVar);
                return new yby0(yqgVar, ((tbt) qqpVar.e).b);
            default:
                goq goqVar = (goq) ipqVar.c;
                yqg yqgVar2 = (yqg) ((k0q) goqVar.f).a.J1.get();
                c8o.l(yqgVar2);
                return new yby0(yqgVar2, ((tbt) goqVar.g).b);
        }
    }
}

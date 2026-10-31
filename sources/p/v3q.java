package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v3q implements vhy {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ v3q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final zhy a(aiy aiyVar) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                thq thqVar = (thq) r7qVar;
                v5q v5qVar = (v5q) thqVar.c;
                oj3 oj3Var = (oj3) v5qVar.p5.get();
                daq daqVar = v5qVar.b;
                return new zhy(aiyVar, new zeu(oj3Var, (g7h) daqVar.b7.get(), (xrc0) daqVar.f5.get()), (lzn0) v5qVar.U0.get(), (gw70) thqVar.b.d8.get());
            default:
                r7q r7qVar2 = r7qVar;
                teq teqVar = r7qVar2.d;
                return new zhy(aiyVar, new zeu((oj3) teqVar.k1.get(), (g7h) teqVar.d.b7.get(), (xrc0) teqVar.e1.get()), (lzn0) teqVar.i.get(), (gw70) r7qVar2.b.d8.get());
        }
    }
}

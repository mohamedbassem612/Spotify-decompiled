package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hzp implements wl7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ hzp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.wl7
    public final xl7 a(bbr0 bbr0Var, iac0 iac0Var, fkk1 fkk1Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                return new xl7(bbr0Var, iac0Var, fkk1Var, new kw4(true, (luk) ((daq) ((yxo) ((p2p) r7qVar).d).d).L1.get()));
            case 1:
                return new xl7(bbr0Var, iac0Var, fkk1Var, new kw4(true, (luk) ((o0q) ((p2p) r7qVar).d).b.L1.get()));
            case 2:
                return new xl7(bbr0Var, iac0Var, fkk1Var, new kw4(true, (luk) ((v5q) ((thq) r7qVar).c).b.L1.get()));
            case 3:
                return new xl7(bbr0Var, iac0Var, fkk1Var, new kw4(true, (luk) ((s7q) r7qVar.d).b.L1.get()));
            case 4:
                return new xl7(bbr0Var, iac0Var, fkk1Var, new kw4(true, (luk) ((daq) ((yxo) ((obq) r7qVar).d).d).L1.get()));
            default:
                return new xl7(bbr0Var, iac0Var, fkk1Var, new kw4(true, (luk) r7qVar.d.d.L1.get()));
        }
    }
}

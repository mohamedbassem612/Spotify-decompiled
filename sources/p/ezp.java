package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ezp implements aks0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ ezp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.aks0
    public final bks0 a(String str) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                return new bks0(str, (iw4) ((daq) ((p2p) r7qVar).c).tm.get());
            case 1:
                return new bks0(str, (iw4) ((daq) ((p2p) r7qVar).c).tm.get());
            case 2:
                return new bks0(str, (iw4) ((thq) r7qVar).b.tm.get());
            case 3:
                return new bks0(str, (iw4) r7qVar.b.tm.get());
            case 4:
                return new bks0(str, (iw4) ((obq) r7qVar).b.tm.get());
            default:
                return new bks0(str, (iw4) r7qVar.b.tm.get());
        }
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q4q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ q4q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ldo a(paj0 paj0Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                return new ldo(paj0Var, new af80((gw70) ((v5q) ((thq) r7qVar).c).b.d8.get()));
            case 1:
                return new ldo(paj0Var, new af80((gw70) ((s7q) r7qVar.d).b.d8.get()));
            case 2:
                return new ldo(paj0Var, new af80((gw70) ((daq) ((ai0) ((obq) r7qVar).d).b).d8.get()));
            default:
                return new ldo(paj0Var, new af80((gw70) r7qVar.d.d.d8.get()));
        }
    }
}

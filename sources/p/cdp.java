package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cdp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ cdp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final iju a(uxb0 uxb0Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                m1q m1qVar = (m1q) ((q2q) ((t7p) ((lbp) r7qVar).c).b).a.Qf.get();
                c8o.l(m1qVar);
                return new iju(m1qVar, uxb0Var, (byte) 1);
            case 1:
                m1q m1qVar2 = (m1q) ((b0q) ((t7p) ((lbp) r7qVar).c).b).a.Qf.get();
                c8o.l(m1qVar2);
                return new iju(m1qVar2, uxb0Var, (byte) 1);
            case 2:
                return new iju((m1q) ((i2q) r7qVar).c.B2.get(), uxb0Var, (byte) 1);
            default:
                return new iju((m1q) r7qVar.d.Qf.get(), uxb0Var, (byte) 1);
        }
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bdp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ bdp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final iju a(aiu aiuVar) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                o290 o290Var = (o290) ((q2q) ((t7p) ((lbp) r7qVar).c).b).a.tf.get();
                c8o.l(o290Var);
                return new iju(o290Var, aiuVar, (byte) 0);
            case 1:
                o290 o290Var2 = (o290) ((b0q) ((t7p) ((lbp) r7qVar).c).b).a.tf.get();
                c8o.l(o290Var2);
                return new iju(o290Var2, aiuVar, (byte) 0);
            default:
                return new iju((o290) r7qVar.d.tf.get(), aiuVar, (byte) 0);
        }
    }
}

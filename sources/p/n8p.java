package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n8p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ n8p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ft3 a(bt3 bt3Var) {
        byte b = this.a;
        d7p d7pVar = this.b;
        switch (b) {
            case 0:
                bqk0 bqk0Var = new bqk0((byte) 6);
                t7p t7pVar = (t7p) d7pVar.c;
                o3m o3mVar = (o3m) t7pVar.b;
                qm3 qm3Var = (qm3) o3mVar.d.get();
                yqg yqgVar = (yqg) o3mVar.i.get();
                edr0 edr0Var = (edr0) o3mVar.c.get();
                c8o.l(edr0Var);
                return new ft3(bqk0Var, new g931(qm3Var, yqgVar, edr0Var, (byte) 22), (o8p) ((jly0) t7pVar.a).get(), new pt3(new bqk0((byte) 6), (byte) 0), new pt3(new bqk0((byte) 6), (byte) 1), (p8p) ((jly0) t7pVar.c).get(), bt3Var);
            default:
                bqk0 bqk0Var2 = new bqk0((byte) 6);
                jnq jnqVar = (jnq) ((ykq) d7pVar).c;
                return new ft3(bqk0Var2, jnqVar.i(), (o8p) ((jly0) jnqVar.a).get(), new pt3(new bqk0((byte) 6), (byte) 0), new pt3(new bqk0((byte) 6), (byte) 1), (p8p) ((jly0) jnqVar.b).get(), bt3Var);
        }
    }
}

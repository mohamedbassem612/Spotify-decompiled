package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q6q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ q6q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final n631 a(p6r0 p6r0Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                daq daqVar = r7qVar.b;
                return new n631((q8n) daqVar.E1.get(), daqVar.M1(), p6r0Var);
            default:
                daq daqVar2 = r7qVar.b;
                return new n631((q8n) daqVar2.E1.get(), daqVar2.M1(), p6r0Var);
        }
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x7q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ x7q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final p68 a(mr20 mr20Var, n6r0 n6r0Var, boolean z) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                daq daqVar = ((caq) r7qVar).a;
                yix0 yix0Var = (yix0) daqVar.W9.get();
                yll yllVarN1 = daqVar.N1();
                return new p68(yix0Var, yllVarN1, (q8n) daqVar.r2.get(), (q8n) daqVar.E1.get(), mr20Var, n6r0Var, z);
            default:
                r7q r7qVar2 = r7qVar;
                yix0 yix0Var2 = (yix0) r7qVar2.d.Y2.get();
                daq daqVar2 = r7qVar2.b;
                yll yllVarN2 = daqVar2.N1();
                return new p68(yix0Var2, yllVarN2, (q8n) daqVar2.r2.get(), (q8n) daqVar2.E1.get(), mr20Var, n6r0Var, z);
        }
    }
}

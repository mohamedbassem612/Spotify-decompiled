package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class baq {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ baq(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final i1c0 a(n6r0 n6r0Var, boolean z) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                daq daqVar = ((caq) r7qVar).a;
                return new i1c0((zxl) daqVar.R9.get(), daqVar.M1(), (q8n) daqVar.E1.get(), (pix0) daqVar.Z9.get(), n6r0Var, z);
            default:
                r7q r7qVar2 = r7qVar;
                daq daqVar2 = r7qVar2.b;
                return new i1c0((zxl) daqVar2.R9.get(), daqVar2.M1(), (q8n) daqVar2.E1.get(), (pix0) r7qVar2.d.B8.get(), n6r0Var, z);
        }
    }
}

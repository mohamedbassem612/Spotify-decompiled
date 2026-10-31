package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ljq {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ ljq(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final qih0 a(uih0 uih0Var) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                daq daqVar = ((obq) jly0Var).b;
                return new qih0(uih0Var, (g510) daqVar.L5.get(), (r8l) daqVar.ff.get());
            default:
                daq daqVar2 = ((obq) jly0Var).b;
                return new qih0(uih0Var, (g510) daqVar2.L5.get(), (r8l) daqVar2.ff.get());
        }
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t7q implements cl4 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final h72 c;

    public /* synthetic */ t7q(daq daqVar, h72 h72Var, byte b) {
        this.a = b;
        this.b = daqVar;
        this.c = h72Var;
    }

    public final dl4 a(Object obj) {
        byte b = this.a;
        h72 h72Var = this.c;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                return new a1q(daqVar, h72Var, (byte) 2);
            default:
                return new g1i(daqVar, h72Var, (u0s0) obj);
        }
    }
}

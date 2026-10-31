package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x2q implements cl4 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final uw0 c;

    public /* synthetic */ x2q(daq daqVar, uw0 uw0Var, byte b) {
        this.a = b;
        this.b = daqVar;
        this.c = uw0Var;
    }

    public final dl4 a(Object obj) {
        byte b = this.a;
        uw0 uw0Var = this.c;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                return new b6p(daqVar, uw0Var);
            case 1:
                return new qqp(daqVar, uw0Var, (bvg0) obj);
            default:
                return new p2o0(daqVar, uw0Var, (mwg0) obj);
        }
    }
}

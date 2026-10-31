package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u2q implements cl4 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final s7q c;

    public /* synthetic */ u2q(daq daqVar, s7q s7qVar, byte b) {
        this.a = b;
        this.b = daqVar;
        this.c = s7qVar;
    }

    public final dl4 a(Object obj) {
        byte b = this.a;
        s7q s7qVar = this.c;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                return new k2q(daqVar, s7qVar, (byte) 1);
            case 1:
                return new qqp(daqVar, s7qVar, (bvg0) obj);
            case 2:
                return new uw0(daqVar, s7qVar, (o0p0) obj);
            case 3:
                return new wtp(daqVar, s7qVar);
            default:
                return new k2q(daqVar, s7qVar, (byte) 5);
        }
    }
}

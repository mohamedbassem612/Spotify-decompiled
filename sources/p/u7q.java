package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u7q implements cl4 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final v5q c;

    public /* synthetic */ u7q(daq daqVar, v5q v5qVar, byte b) {
        this.a = b;
        this.b = daqVar;
        this.c = v5qVar;
    }

    public final dl4 a(Object obj) {
        byte b = this.a;
        v5q v5qVar = this.c;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                return new r2q(daqVar, v5qVar);
            case 1:
                return new qqp(daqVar, v5qVar);
            default:
                return new lbq(daqVar, v5qVar);
        }
    }
}

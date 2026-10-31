package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c0q implements cl4 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final teq c;

    public /* synthetic */ c0q(daq daqVar, teq teqVar, byte b) {
        this.a = b;
        this.b = daqVar;
        this.c = teqVar;
    }

    public final dl4 a(Object obj) {
        byte b = this.a;
        teq teqVar = this.c;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                return new nzp(daqVar, teqVar);
            case 1:
                return new tnm(daqVar, teqVar, (a1b) obj);
            case 2:
                return new j2q(daqVar, teqVar, (wxr) obj);
            case 3:
                return new toj0(daqVar, teqVar, (dqd0) obj);
            case 4:
                return new m3q(daqVar, teqVar, (byte) 0);
            case 5:
                return new wj3(daqVar, teqVar, (o0p0) obj);
            case 6:
                return new byp(daqVar, teqVar, (b4p0) obj);
            case 7:
                return new wtp(daqVar, (dl4) teqVar, obj, (byte) 12);
            case 8:
                return new qqp(daqVar, teqVar);
            case 9:
                return new a1q(daqVar, teqVar);
            case 10:
                return new m3q(daqVar, teqVar, (byte) 1);
            case 11:
                return new k9k(daqVar, teqVar, (ujf1) obj);
            default:
                return new pbq(daqVar, teqVar, (brm1) obj);
        }
    }
}

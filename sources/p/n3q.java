package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n3q implements cl4 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final wdm c;

    public /* synthetic */ n3q(daq daqVar, wdm wdmVar, byte b) {
        this.a = b;
        this.b = daqVar;
        this.c = wdmVar;
    }

    public final dl4 a(Object obj) {
        byte b = this.a;
        wdm wdmVar = this.c;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                return new qqp(daqVar, wdmVar, (byte) 19);
            default:
                return new qqp(daqVar, wdmVar, (byte) 25);
        }
    }
}

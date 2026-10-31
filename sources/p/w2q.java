package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w2q implements jly0 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final s7q c;

    public /* synthetic */ w2q(daq daqVar, s7q s7qVar, byte b) {
        this.a = b;
        this.b = daqVar;
        this.c = s7qVar;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return new v2q(this, (byte) 0);
            default:
                daq daqVar = this.b;
                return new ts90((v4o0) daqVar.je.get(), (gkb) daqVar.Rb.get(), (c9c0) daqVar.Ed.get(), this.c.ld);
        }
    }
}

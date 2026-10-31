package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mu01 implements oh81 {
    public final /* synthetic */ byte a;
    public final Object b;

    public mu01(thq thqVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new idd1(new pd3((kly0) thqVar, (byte) 15));
                break;
            default:
                this.b = new idd1(new pd3(this, (kly0) thqVar));
                break;
        }
    }

    public final mr20 a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (mr20) ((idd1) obj).getValue();
            case 1:
                return (mr20) ((idd1) obj).getValue();
            default:
                return (mgb) obj;
        }
    }

    public mu01(pdc pdcVar, thq thqVar) {
        this.a = (byte) 2;
        this.b = new mgb(rqt0.u(new ld2(pdcVar.a.c("country_code", ""), "KR", (byte) 14)), thqVar, (byte) 7);
    }
}

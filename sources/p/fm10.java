package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fm10 implements mqw {
    public final /* synthetic */ byte a;

    public /* synthetic */ fm10(byte b) {
        this.a = b;
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        switch (this.a) {
            case 0:
                h141 h141Var = (h141) ipb1Var;
                h141Var.e((em10) obj);
                return new mev(h141Var, (byte) 14);
            default:
                h141 h141Var2 = (h141) ipb1Var;
                h141Var2.e((xsv0) obj);
                return new rut0(h141Var2, (byte) 8);
        }
    }

    public final Object d(Object obj) {
        switch (this.a) {
            case 0:
                return (em10) obj;
            default:
                return (xsv0) obj;
        }
    }
}

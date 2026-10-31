package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c5o implements rqw {
    public final /* synthetic */ byte a;
    public final ia00 b;

    public c5o(byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.b = new ia00("PreviewElement", nzv0.Z, nzv0.N0);
                break;
            default:
                this.b = new ia00(c5o.class.getSimpleName(), cnn.N0, cnn.O0);
                break;
        }
    }

    public final op80 a(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        ia00 ia00Var = this.b;
        switch (b) {
            case 0:
                return ia00Var.a((f5o) obj, (j5o) obj2, op80Var);
            case 1:
                return ia00Var.a((dm20) obj, ym20.b.get(obj2), op80Var);
            case 2:
                return ia00Var.a((jh80) obj, (nh80) obj2, op80Var);
            case 3:
                return ia00Var.a((ufw0) obj, (mhw0) obj2, op80Var);
            default:
                return ia00Var.a((nuj1) obj, (ouj1) obj2, op80Var);
        }
    }

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        byte b = this.a;
        ia00 ia00Var = this.b;
        switch (b) {
            case 0:
                return ia00Var.b((f5o) obj, (j5o) obj2, (b5o) obj3, op80Var);
            case 1:
                return ia00Var.b((dm20) obj, ym20.b.get(obj2), (wl20) obj3, op80Var);
            case 2:
                return ia00Var.b((jh80) obj, (nh80) obj2, (ih80) obj3, op80Var);
            case 3:
                return ia00Var.b((ufw0) obj, (mhw0) obj2, (wgw0) obj3, op80Var);
            default:
                return ia00Var.b((nuj1) obj, (ouj1) obj2, (muj1) obj3, op80Var);
        }
    }

    public final boolean c(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        ia00 ia00Var = this.b;
        switch (b) {
            case 0:
                return ia00Var.c((f5o) obj, (j5o) obj2, op80Var);
            case 1:
                return ia00Var.c((dm20) obj, ym20.b.get(obj2), op80Var);
            case 2:
                return ((nh80) obj2) instanceof lh80;
            case 3:
                return ia00Var.c((ufw0) obj, (mhw0) obj2, op80Var);
            default:
                return ia00Var.c((nuj1) obj, (ouj1) obj2, op80Var);
        }
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        ia00 ia00Var = this.b;
        switch (b) {
            case 0:
                return ia00Var.d((f5o) obj, (j5o) obj2, op80Var);
            case 1:
                return ia00Var.d((dm20) obj, ym20.b.get(obj2), op80Var);
            case 2:
                return ia00Var.d((jh80) obj, (nh80) obj2, op80Var);
            case 3:
                return ia00Var.d((ufw0) obj, (mhw0) obj2, op80Var);
            default:
                return ia00Var.d((nuj1) obj, (ouj1) obj2, op80Var);
        }
    }

    public c5o(i8h1 i8h1Var, lik1 lik1Var) {
        this.a = (byte) 4;
        this.b = new ia00("VideoPreviewClientNativeElementInstrumentation", new vm11(lik1Var, (byte) 2), new njf0(i8h1Var, (byte) 2));
    }

    public c5o(rwj rwjVar) {
        this.a = (byte) 2;
        this.b = (ia00) rwjVar.h;
    }

    public c5o(xvu xvuVar) {
        this.a = (byte) 1;
        ym20 ym20Var = ym20.b;
        this.b = (ia00) xvuVar.X;
    }
}

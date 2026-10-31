package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b7y0 implements l381 {
    public final /* synthetic */ byte a = 0;
    public final o3r b;

    public b7y0(gcb1 gcb1Var) {
        this.b = gcb1Var.e;
    }

    public final o3r b() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b;
    }

    public final boolean t(Object obj) {
        boolean zL;
        switch (this.a) {
            case 0:
                zL = gyo1.L(((qxc0) obj).O0);
                break;
            case 1:
                qxc0 qxc0Var = (qxc0) obj;
                exc0 exc0Var = qxc0Var.t.g;
                return (exc0Var.a || exc0Var.c || exc0Var.b) && !gyo1.L(qxc0Var.O0);
            default:
                zL = ihc1.y0(((qxc0) obj).d);
                break;
        }
        return !zL;
    }

    public b7y0(j2y0 j2y0Var) {
        this.b = j2y0Var.e;
    }

    public b7y0(c7y0 c7y0Var) {
        this.b = c7y0Var.g;
    }
}

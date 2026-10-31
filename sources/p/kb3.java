package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kb3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kb3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final jb3 a(qa2 qa2Var, epb1 epb1Var, z83 z83Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((kb3) ((jly0) ((zl5) obj).y).get()).a(qa2Var, epb1Var, z83Var);
            default:
                zl5 zl5Var = (zl5) ((fwo) obj).c;
                return new jb3(qa2Var, epb1Var, z83Var, (fgi0) ((jly0) zl5Var.x).get(), (ojv0) ((ib3) zl5Var.b).b);
        }
    }
}

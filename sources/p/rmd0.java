package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rmd0 implements wpw {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ wpw b;
    public final rsw c;

    public rmd0(qtw qtwVar) {
        this.b = qtwVar;
        this.c = new osw(new kmd0(qtwVar, (byte) 1));
    }

    public final rqw a() {
        byte b = this.a;
        kt11 kt11Var = this.b;
        switch (b) {
            case 0:
                return ((qtw) kt11Var).b;
            default:
                return kt11Var.c1;
        }
    }

    public final String b() {
        byte b = this.a;
        kt11 kt11Var = this.b;
        switch (b) {
            case 0:
                return ((qtw) kt11Var).d.b();
            default:
                return kt11Var.b();
        }
    }

    public final rsw c() {
        byte b = this.a;
        osw oswVar = this.c;
        switch (b) {
            case 0:
                return oswVar;
            default:
                return (qdv0) oswVar;
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        kt11 kt11Var = this.b;
        switch (b) {
            case 0:
                return ((qtw) kt11Var).a;
            default:
                return kt11Var.b1;
        }
    }

    public rmd0(kt11 kt11Var, osw oswVar) {
        this.b = kt11Var;
        this.c = new qdv0(kt11Var, oswVar, (byte) 0);
    }
}

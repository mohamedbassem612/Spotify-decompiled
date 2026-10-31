package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j1c0 implements war0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1c0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final dbr0 a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                war0 war0Var = (war0) obj;
                if (war0Var != null) {
                    return war0Var.a();
                }
                return null;
            default:
                return (dbr0) ((kdn0) obj).e();
        }
    }

    public final void c(rjp0 rjp0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                war0 war0Var = (war0) obj;
                if (war0Var != null) {
                    war0Var.c(rjp0Var);
                }
                break;
            default:
                ((kdn0) obj).k(rjp0Var);
                break;
        }
    }

    public final void d(rjp0 rjp0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                war0 war0Var = (war0) obj;
                if (war0Var != null) {
                    war0Var.d(rjp0Var);
                } else {
                    rjp0Var.b((Object) null);
                }
                break;
            default:
                kdn0 kdn0Var = (kdn0) obj;
                if (kdn0Var.e() == null) {
                    rjp0Var.b((Object) null);
                }
                kdn0Var.g(rjp0Var);
                break;
        }
    }
}

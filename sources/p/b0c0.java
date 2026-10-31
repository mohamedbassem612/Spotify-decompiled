package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b0c0 implements b1c0 {
    public final /* synthetic */ byte a;
    public final kdn0 b;

    public b0c0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new kdn0();
                break;
            default:
                this.b = new kdn0();
                break;
        }
    }

    public final dbr0 a() {
        byte b = this.a;
        kdn0 kdn0Var = this.b;
        switch (b) {
            case 0:
                return (r8r) kdn0Var.e();
            default:
                return (j0c0) kdn0Var.e();
        }
    }

    public final void b(String str, zf30 zf30Var) {
        byte b = this.a;
        kdn0 kdn0Var = this.b;
        switch (b) {
            case 0:
                kdn0Var.m(new r8r(zf30Var.getClass().getSimpleName()));
                break;
            default:
                if (!(zf30Var instanceof fn10)) {
                    kdn0Var.m((Object) null);
                } else {
                    kdn0Var.m(new j0c0(((fn10) zf30Var).Q()));
                }
                break;
        }
    }

    public final void c(rjp0 rjp0Var) {
        byte b = this.a;
        kdn0 kdn0Var = this.b;
        switch (b) {
            case 0:
                kdn0Var.k(rjp0Var);
                break;
            default:
                kdn0Var.k(rjp0Var);
                break;
        }
    }

    public final void d(rjp0 rjp0Var) {
        byte b = this.a;
        kdn0 kdn0Var = this.b;
        switch (b) {
            case 0:
                kdn0Var.g(rjp0Var);
                break;
            default:
                kdn0Var.g(rjp0Var);
                break;
        }
    }
}

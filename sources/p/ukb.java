package p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ukb implements ec10 {
    public final /* synthetic */ byte a;
    public final Object b;

    public ukb(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new j191(35152, 2, "image/png");
                break;
            default:
                this.b = new j191(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // p.ec10
    public final void a(long j, long j2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((j191) obj).a(j, j2);
                break;
            case 1:
                ((j191) obj).a(j, j2);
                break;
        }
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((j191) obj).b(gc10Var);
                break;
            case 1:
                ((j191) obj).b(gc10Var);
                break;
            default:
                gtf1 gtf1VarW = gc10Var.w(0, 3);
                gc10Var.c(new bc9(-9223372036854775807L));
                gc10Var.s();
                ie30 ie30Var = (ie30) obj;
                ge30 ge30VarA = ie30Var.a();
                ge30VarA.o = asj0.p("text/x-unknown");
                ge30VarA.k = ie30Var.f66p;
                xvj1.q(ge30VarA, gtf1VarW);
                break;
        }
    }

    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((j191) obj).c(fc10Var, sfv0Var);
            case 1:
                return ((j191) obj).c(fc10Var, sfv0Var);
            default:
                return fc10Var.r(Alert.DURATION_SHOW_INDEFINITELY) == -1 ? -1 : 0;
        }
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((j191) obj).d(fc10Var);
            case 1:
                return ((j191) obj).d(fc10Var);
            default:
                return true;
        }
    }

    @Override // p.ec10
    public final void release() {
        byte b = this.a;
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    public ukb(ie30 ie30Var) {
        this.a = (byte) 2;
        this.b = ie30Var;
    }

    private final void i(long j, long j2) {
    }
}

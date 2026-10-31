package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eae extends har implements ipc1 {
    public ipc1 d;
    public long e;
    public final /* synthetic */ byte f = 0;
    public Object g;

    public eae(c6t c6tVar) {
        this.g = c6tVar;
    }

    public final int a(long j) {
        ipc1 ipc1Var = this.d;
        ipc1Var.getClass();
        return ipc1Var.a(j - this.e);
    }

    public final List b(long j) {
        ipc1 ipc1Var = this.d;
        ipc1Var.getClass();
        return ipc1Var.b(j - this.e);
    }

    public final long c(int i) {
        ipc1 ipc1Var = this.d;
        ipc1Var.getClass();
        return ipc1Var.c(i) + this.e;
    }

    public final int d() {
        ipc1 ipc1Var = this.d;
        ipc1Var.getClass();
        return ipc1Var.d();
    }

    @Override // p.har
    public final void g() {
        ((oac) this).a = 0;
        this.b = 0L;
        this.c = false;
        this.d = null;
    }

    @Override // p.har
    public final void h() {
        switch (this.f) {
            case 0:
                fae faeVar = (fae) ((lpd) this.g).b;
                g();
                faeVar.b.add(this);
                break;
            default:
                ((c6t) this.g).m(this);
                break;
        }
    }

    public /* synthetic */ eae() {
    }
}

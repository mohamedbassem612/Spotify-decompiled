package p;

import io.reactivex.rxjava3.core.CompletableEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gxg implements yy70 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ixg b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gxg(ixg ixgVar, Object obj, byte b) {
        this.a = b;
        this.b = ixgVar;
        this.c = obj;
    }

    public final void a(zy70 zy70Var, tsc1 tsc1Var) {
        byte b = this.a;
        Object obj = this.c;
        ixg ixgVar = this.b;
        switch (b) {
            case 0:
                nq80 nq80Var = ixgVar.c;
                if (nq80Var != null) {
                    nq80Var.k(ixgVar.i, zy70Var.b.toString(), tsc1Var);
                }
                int iC = l1d.C(tsc1Var.c);
                int i = 1;
                if (iC != 0 && iC != 1) {
                    i = 2;
                    if (iC != 2) {
                        i = 3;
                        if (iC != 3) {
                            eg.o();
                        }
                    }
                }
                ((f080) obj).e(i, x2p1.q(tsc1Var.a));
                break;
            default:
                nq80 nq80Var2 = ixgVar.c;
                if (nq80Var2 != null) {
                    nq80Var2.k(ixgVar.i, zy70Var.b.toString(), tsc1Var);
                }
                ((CompletableEmitter) obj).onComplete();
                break;
        }
    }

    public final void b() {
        byte b = this.a;
        ixg ixgVar = this.b;
        switch (b) {
            case 0:
                nq80 nq80Var = ixgVar.c;
                if (nq80Var != null) {
                    nq80Var.j(ixgVar.i, ixgVar.h);
                }
                break;
            default:
                nq80 nq80Var2 = ixgVar.c;
                if (nq80Var2 != null) {
                    nq80Var2.j(ixgVar.i, ixgVar.h);
                }
                break;
        }
    }

    public final void c(zy70 zy70Var, viz vizVar) {
        byte b = this.a;
        ixg ixgVar = this.b;
        switch (b) {
            case 0:
                nq80 nq80Var = ixgVar.c;
                if (nq80Var != null) {
                    nq80Var.i(ixgVar.i, zy70Var.b.toString(), vizVar);
                }
                break;
            default:
                nq80 nq80Var2 = ixgVar.c;
                if (nq80Var2 != null) {
                    nq80Var2.i(ixgVar.i, zy70Var.b.toString(), vizVar);
                }
                ((CompletableEmitter) this.c).onError(vizVar.c);
                break;
        }
    }

    public final void d(zy70 zy70Var) {
        byte b = this.a;
        ixg ixgVar = this.b;
        switch (b) {
            case 0:
                if (ixgVar.c != null) {
                    zy70Var.b.toString();
                }
                break;
            default:
                if (ixgVar.c != null) {
                    zy70Var.b.toString();
                }
                ((CompletableEmitter) this.c).onComplete();
                break;
        }
    }
}

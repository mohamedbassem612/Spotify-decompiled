package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c72 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c72(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                g72 g72Var = (g72) obj;
                g72.b(g72Var).a(g72.c(g72Var));
                break;
            case 1:
                ((q900) obj).c.set(false);
                break;
            case 2:
                fc00.b((fc00) obj).a();
                break;
            case 3:
                ((sam0) obj).i.a(gam0.a);
                break;
            case 4:
                dg30 dg30VarF0 = ((r3p0) obj).f0();
                if (dg30VarF0 != null) {
                    dg30VarF0.finish();
                }
                break;
            case 5:
                tvt0.b((tvt0) obj).a();
                break;
            case 6:
                ((sdx0) obj).j.onNext(Boolean.FALSE);
                break;
            default:
                ((ram0) obj).dispose();
                break;
        }
    }
}

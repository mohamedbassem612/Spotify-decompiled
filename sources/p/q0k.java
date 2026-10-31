package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q0k implements kko {
    public final /* synthetic */ byte a = 0;
    public final Object b;

    public q0k() {
        w7x w7xVar = w7x.a;
        this.b = gio1.b(new ijo(12, w7xVar, w7xVar));
    }

    public final zob1 a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (bpb1) obj;
            default:
                return ((aod0) obj).b;
        }
    }

    public final Object b(String str, tv80 tv80Var, onm onmVar) {
        Object objI;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return rih1Var;
            default:
                aod0 aod0Var = (aod0) this.b;
                boolean zContains = ((ijo) aod0Var.b.a.getValue()).a.contains(str);
                sd41 sd41Var = aod0Var.a;
                d9n d9nVar = d9n.a;
                if (zContains) {
                    objI = fc11.i(sd41.a(sd41Var, str, tv80Var, 2), onmVar);
                    if (objI != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    objI = fc11.i(sd41.b(sd41Var, str, tv80Var, 2), onmVar);
                    if (objI != d9nVar) {
                        return rih1Var;
                    }
                }
                return objI;
        }
    }

    public q0k(aod0 aod0Var) {
        this.b = aod0Var;
    }
}

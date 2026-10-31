package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k2o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n2o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2o(n2o n2oVar, byte b) {
        super(1);
        this.a = b;
        this.b = n2oVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        t1o t1oVar = t1o.a;
        n2o n2oVar = this.b;
        switch (b) {
            case 0:
                if (j2o.a[((ft6) obj).ordinal()] == 1) {
                    ((iu30) n2oVar.f).invoke(t1oVar);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 1:
                if (l2o.a[((lt6) obj).ordinal()] == 1) {
                    ((iu30) n2oVar.f).invoke(t1oVar);
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                if (m2o.a[((it6) obj).ordinal()] == 1) {
                    ((iu30) n2oVar.f).invoke(t1oVar);
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }
}

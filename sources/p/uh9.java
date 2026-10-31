package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uh9 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m441 b;
    public final /* synthetic */ jh9 c;

    public /* synthetic */ uh9(m441 m441Var, jh9 jh9Var, byte b) {
        this.a = b;
        this.b = m441Var;
        this.c = jh9Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        jh9 jh9Var = this.c;
        m441 m441Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = m441Var.collect(new th9(vr20Var, jh9Var, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = m441Var.collect(new th9(vr20Var, jh9Var, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}

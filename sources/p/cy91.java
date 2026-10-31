package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cy91 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ezc b;
    public final /* synthetic */ fy91 c;

    public /* synthetic */ cy91(ezc ezcVar, fy91 fy91Var, byte b) {
        this.a = b;
        this.b = ezcVar;
        this.c = fy91Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        fy91 fy91Var = this.c;
        ezc ezcVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = ezcVar.collect(new ae91((byte) 10, fy91Var, vr20Var), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = ezcVar.collect(new ae91((byte) 11, fy91Var, vr20Var), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tb6 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ezc b;
    public final /* synthetic */ y2r0 c;

    public /* synthetic */ tb6(ezc ezcVar, y2r0 y2r0Var, byte b) {
        this.a = b;
        this.b = ezcVar;
        this.c = y2r0Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        y2r0 y2r0Var = this.c;
        ezc ezcVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = ezcVar.collect(new sb6(vr20Var, y2r0Var, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = ezcVar.collect(new sb6(vr20Var, y2r0Var, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}

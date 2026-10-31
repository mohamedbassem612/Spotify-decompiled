package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zcd implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ezc b;

    public /* synthetic */ zcd(ezc ezcVar, byte b) {
        this.a = b;
        this.b = ezcVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        ezc ezcVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = ezcVar.collect(new oq0(vr20Var, (byte) 5), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ezcVar.collect(new mib((Object) vr20Var, (Object) new n811(), (byte) 12), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ezcVar.collect(new oq0(vr20Var, (byte) 27), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            default:
                Object objCollect4 = ezcVar.collect(new qzh1(vr20Var, (byte) 21), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
        }
    }
}

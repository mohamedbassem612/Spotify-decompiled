package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dn6 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ mr20 c;
    public final /* synthetic */ Object d;

    public dn6(mr20 mr20Var, int i, dhc0 dhc0Var) {
        this.a = (byte) 2;
        this.c = mr20Var;
        this.b = i;
        this.d = dhc0Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.d;
        int i = this.b;
        ezc ezcVar = this.c;
        switch (b) {
            case 0:
                ((ay8) ezcVar).collect(new cn6(vr20Var, (sxg) obj, i, (byte) 0), lnmVar);
                return d9nVar;
            case 1:
                Object objCollect = ezcVar.collect(new zld(vr20Var, (String) obj, i), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = ezcVar.collect(new cn6(vr20Var, i, (dhc0) obj, (byte) 2), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }

    public /* synthetic */ dn6(mr20 mr20Var, Object obj, int i, byte b) {
        this.a = b;
        this.c = mr20Var;
        this.d = obj;
        this.b = i;
    }
}

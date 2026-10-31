package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ks4 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jge b;
    public final /* synthetic */ String c;

    public /* synthetic */ ks4(jge jgeVar, String str, byte b) {
        this.a = b;
        this.b = jgeVar;
        this.c = str;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        String str = this.c;
        jge jgeVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = jgeVar.collect(new st(vr20Var, str, (byte) 7), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = jgeVar.collect(new st(vr20Var, str, (byte) 8), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = jgeVar.collect(new st(vr20Var, str, (byte) 9), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = jgeVar.collect(new st(vr20Var, str, (byte) 14), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            default:
                Object objCollect5 = jgeVar.collect(new buc0(vr20Var, str, (byte) 16), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
        }
    }
}

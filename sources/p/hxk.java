package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hxk implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mfe b;

    public /* synthetic */ hxk(mfe mfeVar, byte b) {
        this.a = b;
        this.b = mfeVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        mfe mfeVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = mfeVar.collect(new x1h(vr20Var, (byte) 22), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = mfeVar.collect(new cy20(vr20Var, (byte) 9), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = mfeVar.collect(new qkv0(vr20Var, (byte) 19), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = mfeVar.collect(new p0x0(vr20Var, (byte) 13), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = mfeVar.collect(new p0x0(vr20Var, (byte) 14), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            default:
                Object objCollect6 = mfeVar.collect(new ml21(vr20Var, (byte) 17), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
        }
    }
}

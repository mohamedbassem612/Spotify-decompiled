package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x010 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x010(mr20 mr20Var, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = obj;
        this.d = obj2;
    }

    @Override // p.mr20
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.d;
        Object obj2 = this.c;
        lt0 lt0Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = ((jge) lt0Var).collect(new w010(vr20Var, (iu30) obj2, obj, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objS = fc11.s(vrl.c, lnmVar, vr20Var, new ekv((xu30) obj, (lnm) null), new mr20[]{lt0Var, (mr20) obj2});
                return objS == d9nVar ? objS : rih1Var;
            case 2:
                Object objCollect2 = ((ezc) lt0Var).collect(new e8m(vr20Var, (String) obj2, (String) obj, (byte) 4), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 3:
                Object objCollect3 = lt0Var.collect(new e8m(vr20Var, (String) obj2, (rsc0) obj, (byte) 6), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            default:
                Object objCollect4 = lt0Var.collect(new ap70(vr20Var, (r3d0) obj2, (String) obj, (byte) 8), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
        }
    }
}

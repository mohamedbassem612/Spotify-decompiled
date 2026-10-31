package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rpk1 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rpk1(mr20 mr20Var, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = obj;
        this.d = obj2;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.d;
        Object obj2 = this.c;
        ezc ezcVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = ezcVar.collect(new i6e1((byte) 27, (upk1) obj2, (gfu0) obj, vr20Var), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ezcVar.collect(new efb1(vr20Var, (fd0) obj2, (itk1) obj, (byte) 17), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            default:
                Object objCollect3 = ezcVar.collect(new efb1(vr20Var, (skx0) obj2, (ykx0) obj, (byte) 20), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
        }
    }
}

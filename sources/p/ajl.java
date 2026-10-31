package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ajl {
    public static final /* synthetic */ int a = 0;

    static {
        qs10.c("ConstraintTrkngWrkr");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(cwh0 cwh0Var, vwl1 vwl1Var, onm onmVar) {
        zil zilVar;
        if (onmVar instanceof zil) {
            zilVar = (zil) onmVar;
            int i = zilVar.b;
            if ((i & os00.INVALID_ID) != 0) {
                zilVar.b = i - os00.INVALID_ID;
            } else {
                zilVar = new zil(onmVar);
            }
        } else {
            zilVar = new zil(onmVar);
        }
        Object objI = zilVar.a;
        int i2 = zilVar.b;
        if (i2 == 0) {
            hm5.M(objI);
            s1g s1gVar = new s1g(new fu20(cwh0Var.t(vwl1Var), new hzb(vwl1Var, (lnm) null, (byte) 20), (byte) 1), (byte) 2);
            zilVar.b = 1;
            objI = b5p1.i(s1gVar, zilVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        return new Integer(((njl) objI).a);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g16 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jge b;
    public final /* synthetic */ vtf c;

    public /* synthetic */ g16(jge jgeVar, vtf vtfVar, byte b) {
        this.a = b;
        this.b = jgeVar;
        this.c = vtfVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        vtf vtfVar = this.c;
        jge jgeVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = jgeVar.collect(new f16(vr20Var, vtfVar, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = jgeVar.collect(new f16(vr20Var, vtfVar, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}

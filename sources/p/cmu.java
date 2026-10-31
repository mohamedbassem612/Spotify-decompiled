package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cmu extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dmu b;
    public final /* synthetic */ j2i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cmu(dmu dmuVar, j2i j2iVar, byte b) {
        super(4);
        this.a = b;
        this.b = dmuVar;
        this.c = j2iVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.c;
        dmu dmuVar = this.b;
        switch (b) {
            case 0:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                b0k b0kVar = (b0k) obj3;
                ((Number) obj4).intValue();
                cto1.g(iIntValue != 0 ? dmuVar.a : 1, apo.r(-1639998605, new bmu(j2iVar, aqb0Var, iIntValue, (byte) 0), b0kVar), b0kVar, 48);
                break;
            default:
                int iIntValue2 = ((Number) obj2).intValue();
                b0k b0kVar2 = (b0k) obj3;
                ((Number) obj4).intValue();
                cto1.g(dmuVar.a, apo.r(-836494646, new bmu(j2iVar, (aqb0) obj, iIntValue2, (byte) 1), b0kVar2), b0kVar2, 48);
                break;
        }
        return rih1Var;
    }
}

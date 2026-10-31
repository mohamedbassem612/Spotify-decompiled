package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class weg extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g7m1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ weg(g7m1 g7m1Var, byte b) {
        super(4);
        this.a = b;
        this.b = g7m1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        g7m1 g7m1Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int iIntValue2 = ((Number) obj4).intValue();
                b0k b0kVar = (x340) ((b0k) obj3);
                b0kVar.i0(-812948208);
                jfe jfeVarA = g7m1Var.d.a(iIntValue, iIntValue2 & 126, b0kVar, zBooleanValue);
                b0kVar.r(false);
                return jfeVarA;
            default:
                int iIntValue3 = ((Number) obj).intValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                int iIntValue4 = ((Number) obj4).intValue();
                b0k b0kVar2 = (x340) ((b0k) obj3);
                b0kVar2.i0(1304146777);
                jfe jfeVarA2 = g7m1Var.d.a(iIntValue3, iIntValue4 & 126, b0kVar2, zBooleanValue2);
                b0kVar2.r(false);
                return jfeVarA2;
        }
    }
}

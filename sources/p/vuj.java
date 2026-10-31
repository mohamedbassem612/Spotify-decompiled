package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vuj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vuj(j2i j2iVar, Object obj, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = j2iVar;
        this.c = obj;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        Object obj3 = this.c;
        j2i j2iVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    j2iVar.J(obj3, iu30Var, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    j2iVar.J(obj3, iu30Var, x340Var4, 0);
                }
                break;
        }
        return rih1Var;
    }
}

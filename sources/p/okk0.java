package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class okk0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ kkk0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ okk0(iu30 iu30Var, kkk0 kkk0Var, byte b) {
        super(4);
        this.a = b;
        this.b = iu30Var;
        this.c = kkk0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kkk0 kkk0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj4).intValue();
                jkk0 jkk0Var = kkk0Var.a;
                iu30Var.invoke(new yjk0(jkk0Var.n, jkk0Var.o, iIntValue, (jez) obj3));
                break;
            case 1:
                int iIntValue2 = ((Number) obj4).intValue();
                jkk0 jkk0Var2 = kkk0Var.a;
                iu30Var.invoke(new zjk0(jkk0Var2.s, jkk0Var2.t, iIntValue2, (ha20) obj3));
                break;
            default:
                int iIntValue3 = ((Number) obj4).intValue();
                jkk0 jkk0Var3 = kkk0Var.a;
                iu30Var.invoke(new akk0(jkk0Var3.x, jkk0Var3.y, iIntValue3, (rx30) obj3));
                break;
        }
        return rih1Var;
    }
}

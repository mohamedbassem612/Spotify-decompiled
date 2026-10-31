package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a801 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a801(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        Number number = (Number) obj;
        switch (b) {
            case 0:
                int iIntValue = number.intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                a801 a801Var = new a801(i, (lnm) obj3, (byte) 0);
                a801Var.b = iIntValue;
                a801Var.c = iIntValue2;
                return a801Var.invokeSuspend(rih1Var);
            case 1:
                int iIntValue3 = number.intValue();
                int iIntValue4 = ((Number) obj2).intValue();
                a801 a801Var2 = new a801(i, (lnm) obj3, (byte) 1);
                a801Var2.b = iIntValue3;
                a801Var2.c = iIntValue4;
                return a801Var2.invokeSuspend(rih1Var);
            default:
                int iIntValue5 = number.intValue();
                int iIntValue6 = ((Number) obj2).intValue();
                a801 a801Var3 = new a801(i, (lnm) obj3, (byte) 2);
                a801Var3.b = iIntValue5;
                a801Var3.c = iIntValue6;
                return a801Var3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                int i = this.b;
                int i2 = this.c;
                hm5.M(obj);
                return new Integer(i2 - i);
            case 1:
                int i3 = this.b;
                int i4 = this.c;
                hm5.M(obj);
                return Boolean.valueOf(i3 < (-i4) || i3 > i4);
            default:
                int i5 = this.b;
                int i6 = this.c;
                hm5.M(obj);
                return new kne(i5, i6);
        }
    }
}

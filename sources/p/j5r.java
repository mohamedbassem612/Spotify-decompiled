package p;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j5r extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5r(iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2, byte b) {
        super(4);
        this.a = b;
        this.b = iu30Var;
        this.c = ven0Var;
        this.d = ven0Var2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.d;
        ven0 ven0Var2 = this.c;
        switch (b) {
            case 0:
                s720 s720Var = new s720((ldl0) obj2, ((Number) obj).intValue());
                iu30 iu30Var = this.b;
                iu30Var.invoke(s720Var);
                ven0Var2.setValue((LocalDate) obj3);
                ven0Var.setValue((LocalDate) obj4);
                iu30Var.invoke(new o720((LocalDate) ven0Var2.getValue(), (LocalDate) ven0Var.getValue()));
                break;
            default:
                int iIntValue = ((Number) obj4).intValue();
                yap1.e((ysf0) ven0Var2.getValue(), ((Number) obj2).intValue(), (Boolean) ven0Var.getValue(), this.b, (b0k) obj3, iIntValue & 112);
                break;
        }
        return rih1Var;
    }
}

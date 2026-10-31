package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tjr0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vjr0 b;

    public /* synthetic */ tjr0(vjr0 vjr0Var, byte b) {
        this.a = b;
        this.b = vjr0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vjr0 vjr0Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                Integer num = vjr0Var.g;
                if (num == null || iIntValue != num.intValue()) {
                    Integer num2 = vjr0Var.g;
                    vjr0Var.g = new Integer(iIntValue);
                    n1i n1iVar = n1i.d;
                    if (num2 != null) {
                        int iIntValue2 = num2.intValue();
                        xm90 xm90VarA = vjr0Var.a(iIntValue2, (z0i) vjr0Var.i.get(iIntValue2));
                        if (xm90VarA.a == n1iVar) {
                            xm90VarA.a(n1i.b);
                        }
                    }
                    xm90 xm90VarA2 = vjr0Var.a(iIntValue, (z0i) vjr0Var.i.get(iIntValue));
                    xm90VarA2.a(n1iVar);
                    q9l1 q9l1Var = vjr0Var.b;
                    q9l1Var.a.l(xm90VarA2.d);
                }
                break;
            default:
                int iIntValue3 = ((Number) obj).intValue();
                vjr0Var.h = new Integer(iIntValue3);
                if (iIntValue3 <= p7h.L(vjr0Var.i)) {
                    vjr0Var.a(iIntValue3, (z0i) vjr0Var.i.get(iIntValue3)).a(n1i.c);
                }
                break;
        }
        return rih1Var;
    }
}

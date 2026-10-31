package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p531 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r531 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p531(r531 r531Var, byte b) {
        super(4);
        this.a = b;
        this.b = r531Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        r531 r531Var = this.b;
        switch (b) {
            case 0:
                n531 n531Var = (n531) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                int i = (iIntValue & 6) == 0 ? ((iIntValue & 8) == 0 ? x340Var.g(n531Var) : x340Var.i(n531Var) ? 4 : 2) | iIntValue : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= x340Var.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    tx9.f(n531Var, new yjs(n531Var.d, iu30Var, r531Var.e), x340Var2, i & 14);
                }
                break;
            default:
                y531 y531Var = (a631) obj;
                x340 x340Var3 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? x340Var3.g(y531Var) : x340Var3.i(y531Var) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                    x340Var4.b0();
                } else {
                    y531 y531Var2 = y531Var instanceof y531 ? y531Var : null;
                    if (y531Var2 != null) {
                        x340Var4.i0(1051786669);
                        nyx.a(2, (wux) null, apo.r(801620503, new tc11(y531Var2, r531Var, (byte) 19), x340Var4), x340Var4, 3078, 6);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(1051786668);
                        x340Var4.r(false);
                    }
                }
                break;
        }
        return rih1Var;
    }
}

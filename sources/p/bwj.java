package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bwj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu30 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bwj(zu30 zu30Var, Object obj, Function0 function0, byte b) {
        super(2);
        this.a = b;
        this.b = zu30Var;
        this.c = obj;
        this.d = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        Object obj3 = this.c;
        zu30 zu30Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    zu30Var.J(obj3, function0, x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    qsw.a(apo.r(1908401285, new bwj(zu30Var, obj3, function0, null == true ? 1 : 0), x340Var4), x340Var4);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    k2r0.c(6, apo.r(1801524356, new bwj(zu30Var, obj3, function0, b2), x340Var6), x340Var6);
                }
                break;
        }
        return rih1Var;
    }
}

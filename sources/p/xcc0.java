package p;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xcc0 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ tqw b;
    public /* synthetic */ Object c;
    public /* synthetic */ Enum d;
    public final /* synthetic */ avl1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xcc0(avl1 avl1Var, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.e = avl1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        htz0 htz0Var = this.e;
        switch (b) {
            case 0:
                xcc0 xcc0Var = new xcc0((zcc0) htz0Var, (lnm) obj5, (byte) 0);
                xcc0Var.c = (ucc0) obj2;
                xcc0Var.d = (rcc0) obj3;
                xcc0Var.b = (tqw) obj4;
                xcc0Var.invokeSuspend(rih1Var);
                break;
            default:
                xcc0 xcc0Var2 = new xcc0(htz0Var, (lnm) obj5, (byte) 1);
                xcc0Var2.c = (vsz0) obj;
                xcc0Var2.d = (usz0) obj3;
                xcc0Var2.b = (tqw) obj4;
                xcc0Var2.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        htz0 htz0Var = this.e;
        switch (b) {
            case 0:
                ucc0 ucc0Var = (ucc0) this.c;
                rcc0 rcc0Var = this.d;
                tqw tqwVar = this.b;
                hm5.M(obj);
                if (tqwVar == null) {
                    return rih1Var;
                }
                tv80 tv80VarY = n3o1.y(tqwVar);
                zcc0 zcc0Var = (zcc0) htz0Var;
                if (wcc0.a[rcc0Var.ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                if (ucc0Var.a().length() <= 0) {
                    return rih1Var;
                }
                zcc0Var.b.a(ucc0Var.a(), tv80VarY, (Bundle) null);
                return rih1Var;
            default:
                vsz0 vsz0Var = (vsz0) this.c;
                usz0 usz0Var = this.d;
                tqw tqwVar2 = this.b;
                hm5.M(obj);
                if (ctz0.a[usz0Var.ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                if (tqwVar2 == null) {
                    return rih1Var;
                }
                htz0Var.c.a(vsz0Var.a(), n3o1.y(tqwVar2), (Bundle) null);
                return rih1Var;
        }
    }
}

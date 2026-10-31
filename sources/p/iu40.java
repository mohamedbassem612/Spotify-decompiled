package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iu40 extends hab0 implements zu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu40(boolean z, ven0 ven0Var, Function0 function0, boolean z2, Function0 function1) {
        super(4);
        this.a = z;
        this.b = ven0Var;
        this.c = function0;
        this.d = z2;
        this.e = function1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        x340 x340Var = (b0k) obj3;
        ((Number) obj4).intValue();
        m4c m4cVar = fkj0.X;
        int iOrdinal = ((u8w) obj2).ordinal();
        ven0 ven0Var = this.b;
        if (iOrdinal != 0) {
            Function0 function0 = this.e;
            if (iOrdinal == 1) {
                x340 x340Var2 = x340Var;
                x340Var2.i0(-1469152449);
                boolean z = this.d;
                boolean z2 = !z;
                boolean zH = x340Var2.h(z) | x340Var2.i(ven0Var) | x340Var2.g(function0);
                Object objT = x340Var2.T();
                if (zH || objT == m4cVar) {
                    objT = new hrn(z, function0, ven0Var, (byte) 2);
                    x340Var2.s0(objT);
                }
                vby0.e(0, (Function0) objT, x340Var2, z2);
                x340Var2.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw p3d1.k(x340Var, -1469161027, false);
                }
                x340 x340Var3 = x340Var;
                x340Var3.i0(-1469146246);
                vby0.k(function0, x340Var3, 0);
                x340Var3.r(false);
            }
        } else {
            x340 x340Var4 = x340Var;
            x340Var4.i0(-1469159513);
            boolean zI = x340Var4.i(ven0Var);
            Object objT2 = x340Var4.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new iwr(ven0Var, (byte) 27);
                x340Var4.s0(objT2);
            }
            vby0.f(this.a, (Function0) objT2, this.c, x340Var4, 0);
            x340Var4.r(false);
        }
        return rih1.a;
    }
}

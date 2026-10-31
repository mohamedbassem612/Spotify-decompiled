package p;

import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hxm1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ bzr d;
    public final /* synthetic */ azr e;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxm1(List list, boolean z, bzr bzrVar, azr azrVar, Function0 function0, int i) {
        super(2);
        this.b = list;
        this.c = z;
        this.d = bzrVar;
        this.e = azrVar;
        this.f = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    float f = ixm1.b;
                    zzq0 zzq0Var = new zzq0(f, f, f, f);
                    WeakHashMap weakHashMap = osl1.x;
                    hdh hdhVarN = lnn1.n(zzq0Var, hqq0.C(lhc.g(x340Var2).g, x340Var2));
                    d36 d36Var = new d36(f, true, new um5(false));
                    qim0 qim0VarL = bmq0.L(u291.f(nim0.a, 1.0f), k1o1.q(x340Var2), (g6o0) null);
                    boolean zH = x340Var2.h(this.c) | x340Var2.i(this.e) | x340Var2.g(this.f) | x340Var2.g(this.b) | x340Var2.i(this.d);
                    Object objT = x340Var2.T();
                    if (zH || objT == fkj0.X) {
                        o96 o96Var = new o96(this.e, this.b, this.c, this.f, this.d, (byte) 16);
                        x340Var2.s0(o96Var);
                        objT = o96Var;
                    }
                    s3o1.d(qim0VarL, (xtb0) null, hdhVarN, d36Var, (nl3) null, (iq20) null, false, (h3h1) null, (iu30) objT, x340Var2, 24576, 490);
                }
                break;
            default:
                ((Number) obj2).intValue();
                ixm1.c(this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxm1(boolean z, azr azrVar, Function0 function0, List list, bzr bzrVar) {
        super(2);
        this.c = z;
        this.e = azrVar;
        this.f = function0;
        this.b = list;
        this.d = bzrVar;
    }
}

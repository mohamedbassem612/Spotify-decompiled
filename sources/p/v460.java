package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v460 extends hab0 implements bv30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v460(w460 w460Var, boolean z, boolean z2) {
        super(5);
        this.a = z;
        this.b = z2;
    }

    @Override // p.bv30
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        s460 s460Var = (s460) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(s460Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            String str = s460Var.a;
            String str2 = s460Var.c;
            xqn0 xqn0Var = new xqn0(s460Var.i, str, str2 == null ? "" : str2, s460Var.b, s460Var.h, (str2 == null || ihc1.y0(str2)) && s460Var.d != null, s460Var.j);
            int iC = l1d.C(s460Var.e);
            Function0 function0 = null;
            if (iC != 0) {
                int i3 = 2;
                if (iC == 1) {
                    i2 = i3;
                } else if (iC == 2) {
                    i2 = 3;
                } else {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    i3 = 4;
                    i2 = i3;
                }
            } else {
                i2 = 1;
            }
            boolean z = s460Var.f;
            if (s460Var.j) {
                x340Var2.i0(1343045238);
                boolean z2 = (i & 896) == 256;
                Object objT = x340Var2.T();
                if (z2 || objT == m4cVar) {
                    objT = new u460(iu30Var, (byte) 0);
                    x340Var2.s0(objT);
                }
                function0 = (Function0) objT;
                x340Var2.r(false);
            } else {
                x340Var2.i0(1343110617);
                x340Var2.r(false);
            }
            Function0 function1 = function0;
            boolean z3 = ((i & 112) == 32) | ((i & 896) == 256);
            Object objT2 = x340Var2.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new hs20(s460Var, iu30Var, (byte) 18);
                x340Var2.s0(objT2);
            }
            eqn1.c(xqn0Var, this.a, z, (Function0) objT2, (qim0) null, i2, this.b, (vu30) null, function1, x340Var2, 0, 144);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}

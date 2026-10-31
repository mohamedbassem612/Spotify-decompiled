package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d9i1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ w9i1 b;
    public final /* synthetic */ n9i1 c;
    public final /* synthetic */ lzn0 d;
    public final /* synthetic */ gon0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9i1(n9i1 n9i1Var, w9i1 w9i1Var, lzn0 lzn0Var, gon0 gon0Var) {
        super(4);
        this.c = n9i1Var;
        this.b = w9i1Var;
        this.d = lzn0Var;
        this.e = gon0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        Function0 function0;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lzn0 lzn0Var = this.d;
        gon0 gon0Var = this.e;
        switch (b) {
            case 0:
                ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var = (b0k) obj3;
                n9i1 n9i1Var = this.c;
                boolean zI = x340Var.i(n9i1Var);
                w9i1 w9i1Var = this.b;
                boolean zI2 = x340Var.i(w9i1Var) | zI | x340Var.i(lzn0Var);
                Object objT = x340Var.T();
                if (zI2 || objT == m4cVar) {
                    objT = new c9i1(n9i1Var, w9i1Var, lzn0Var, (byte) 0);
                    x340Var.s0(objT);
                }
                Function0 function1 = (Function0) objT;
                boolean zI3 = x340Var.i(n9i1Var) | x340Var.i(w9i1Var) | x340Var.i(gon0Var);
                Object objT2 = x340Var.T();
                if (zI3 || objT2 == m4cVar) {
                    objT2 = new rsc1(n9i1Var, w9i1Var, gon0Var, (byte) 26);
                    x340Var.s0(objT2);
                }
                upo1.q(function1, (iu30) objT2, w9i1Var, (qim0) null, x340Var, 0);
                boolean zI4 = x340Var.i(n9i1Var) | x340Var.i(w9i1Var) | x340Var.i(lzn0Var);
                Object objT3 = x340Var.T();
                if (zI4 || objT3 == m4cVar) {
                    objT3 = new c9i1(n9i1Var, w9i1Var, lzn0Var, (byte) 1);
                    x340Var.s0(objT3);
                }
                q3p1.b(0, 1, (Function0) objT3, x340Var, false);
                break;
            default:
                x340 x340Var2 = (b0k) obj3;
                ((Number) obj4).intValue();
                m4c m4cVar2 = fkj0.X;
                w9i1 w9i1Var2 = this.b;
                boolean z = w9i1Var2.R0;
                n9i1 n9i1Var2 = this.c;
                if (z) {
                    x340 x340Var3 = x340Var2;
                    x340Var3.i0(365232332);
                    boolean zI5 = x340Var3.i(n9i1Var2) | x340Var3.i(w9i1Var2) | x340Var3.i(lzn0Var);
                    Object objT4 = x340Var3.T();
                    if (zI5 || objT4 == m4cVar2) {
                        objT4 = new c9i1(n9i1Var2, w9i1Var2, lzn0Var, (byte) 3);
                        x340Var3.s0(objT4);
                    }
                    function0 = (Function0) objT4;
                    x340Var3.r(false);
                } else {
                    x340 x340Var4 = x340Var2;
                    x340Var4.i0(365596241);
                    boolean zI6 = x340Var4.i(n9i1Var2) | x340Var4.i(gon0Var);
                    Object objT5 = x340Var4.T();
                    if (zI6 || objT5 == m4cVar2) {
                        objT5 = new mah1(n9i1Var2, gon0Var, (byte) 9);
                        x340Var4.s0(objT5);
                    }
                    function0 = (Function0) objT5;
                    x340Var4.r(false);
                }
                x340 x340Var5 = x340Var2;
                boolean zI7 = x340Var5.i(n9i1Var2) | x340Var5.i(w9i1Var2) | x340Var5.i(lzn0Var);
                Object objT6 = x340Var5.T();
                if (zI7 || objT6 == m4cVar2) {
                    objT6 = new c9i1(n9i1Var2, w9i1Var2, lzn0Var, (byte) 2);
                    x340Var5.s0(objT6);
                }
                rpo1.p(w9i1Var2, function0, (Function0) objT6, n9i1Var2, (qim0) null, x340Var5, 0);
                boolean zG = x340Var5.g(function0);
                Object objT7 = x340Var5.T();
                if (zG || objT7 == m4cVar2) {
                    objT7 = new sah1(function0, (byte) 10);
                    x340Var5.s0(objT7);
                }
                q3p1.b(0, 1, (Function0) objT7, x340Var5, false);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9i1(w9i1 w9i1Var, n9i1 n9i1Var, lzn0 lzn0Var, gon0 gon0Var) {
        super(4);
        this.b = w9i1Var;
        this.c = n9i1Var;
        this.d = lzn0Var;
        this.e = gon0Var;
    }
}

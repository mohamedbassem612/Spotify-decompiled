package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class il0 {
    public final j72 a;
    public final bpb1 b;
    public final dt61 c;
    public final ve01 d;

    public il0(j72 j72Var) {
        this.a = j72Var;
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        llm llmVarE = smo1.e(flo1.l(j0d1VarB, b3s.c));
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.b = bpb1VarB;
        ve01 ve01VarR = d5p1.r(rqt0.u(new any(new ht20(bpb1VarB, new q4(this, (lnm) null, (byte) 10)), (byte) 18)), llmVarE, new alb1(500L, 10000L), 1);
        this.c = new dt61(ve01VarR, new et61(di0.e, (byte) 0), (byte) 0);
        this.d = d5p1.r(new dt61(ve01VarR, di0.d, (byte) 0), llmVarE, new alb1(500L, 10000L), 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        cl0 cl0Var;
        String str;
        if (onmVar instanceof cl0) {
            cl0Var = (cl0) onmVar;
            int i = cl0Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                cl0Var.c = i - os00.INVALID_ID;
            } else {
                cl0Var = new cl0(this, onmVar);
            }
        } else {
            cl0Var = new cl0(this, onmVar);
        }
        Object objB = cl0Var.a;
        int i2 = cl0Var.c;
        iy0 iy0Var = iy0.a;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                j72 j72Var = this.a;
                cl0Var.c = 1;
                objB = j72Var.b(cl0Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            List<xk0> list = ((jk40) objB).a;
            if (list == null) {
                return iy0Var;
            }
            ArrayList arrayList = new ArrayList();
            for (xk0 xk0Var : list) {
                String str2 = xk0Var.a;
                mmr0 mmr0Var = (str2 == null || (str = xk0Var.b) == null) ? null : new mmr0(str2, str);
                if (mmr0Var != null) {
                    arrayList.add(mmr0Var);
                }
            }
            return new jy0(sqg0.T(arrayList));
        } catch (Exception unused) {
            op71.x(cl0Var.getContext());
            return iy0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, bl0 bl0Var, onm onmVar) {
        dl0 dl0Var;
        bl0 bl0Var2;
        if (onmVar instanceof dl0) {
            dl0Var = (dl0) onmVar;
            int i = dl0Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                dl0Var.d = i - os00.INVALID_ID;
            } else {
                dl0Var = new dl0(this, onmVar);
            }
        } else {
            dl0Var = new dl0(this, onmVar);
        }
        Object objY = dl0Var.b;
        int i2 = dl0Var.d;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objY);
            dl0Var.a = bl0Var;
            dl0Var.d = 1;
            fns fnsVar = igu.a;
            objY = fn31.Y(b3s.c, new el0((Object) bl0Var, (Object) str, (Object) this, lnmVar, (byte) 0), dl0Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
            bl0Var2 = bl0Var;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bl0Var2 = dl0Var.a;
            hm5.M(objY);
        }
        am0 am0Var = (am0) objY;
        if (u890.j(am0Var, zl0.a)) {
            return new it61(bl0Var2);
        }
        if ((am0Var instanceof yl0) || (am0Var instanceof xl0)) {
            return new ht61((Integer) null, 0);
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar, boolean z) {
        fl0 fl0Var;
        String str2;
        String simpleName;
        if (onmVar instanceof fl0) {
            fl0Var = (fl0) onmVar;
            int i = fl0Var.e;
            if ((i & os00.INVALID_ID) != 0) {
                fl0Var.e = i - os00.INVALID_ID;
            } else {
                fl0Var = new fl0(this, onmVar);
            }
        } else {
            fl0Var = new fl0(this, onmVar);
        }
        Object objY = fl0Var.c;
        int i2 = fl0Var.e;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objY);
            bl0 bl0Var = z ? bl0.b : bl0.a;
            fl0Var.a = str;
            fl0Var.b = z;
            fl0Var.e = 1;
            fns fnsVar = igu.a;
            objY = fn31.Y(b3s.c, new el0((Object) bl0Var, (Object) str, (Object) this, lnmVar, (byte) 0), fl0Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = fl0Var.b;
            str2 = fl0Var.a;
            hm5.M(objY);
        }
        am0 am0Var = (am0) objY;
        if (u890.j(am0Var, zl0.a)) {
            return null;
        }
        if (am0Var instanceof yl0) {
            simpleName = ((yl0) am0Var).a;
            if (simpleName == null) {
                simpleName = "Preference not updated";
            }
        } else {
            if (!(am0Var instanceof xl0)) {
                eg.o();
                return null;
            }
            Exception exc = ((xl0) am0Var).a;
            String message = exc.getMessage();
            simpleName = message == null ? exc.getClass().getSimpleName() : message;
        }
        return cy30.p(simpleName, " ", str2, " ", z ? "INTEREST_LEVEL_SEE_MORE" : "INTEREST_LEVEL_DEFAULT");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Map map, onm onmVar) {
        gl0 gl0Var;
        if (onmVar instanceof gl0) {
            gl0Var = (gl0) onmVar;
            int i = gl0Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                gl0Var.c = i - os00.INVALID_ID;
            } else {
                gl0Var = new gl0(this, onmVar);
            }
        } else {
            gl0Var = new gl0(this, onmVar);
        }
        Object objS = gl0Var.a;
        int i2 = gl0Var.c;
        if (i2 == 0) {
            hm5.M(objS);
            c6 c6Var = new c6(map, this, (lnm) null, (byte) 5);
            gl0Var.c = 1;
            objS = smo1.s(c6Var, gl0Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objS);
        }
        Map map2 = (Map) objS;
        return map2.isEmpty() ? my0.a : new ly0(map2);
    }
}

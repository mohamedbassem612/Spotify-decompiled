package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ll1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ hti0 c;
    public final /* synthetic */ a42 d;
    public final /* synthetic */ d0r e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll1(a42 a42Var, d0r d0rVar, hti0 hti0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = a42Var;
        this.e = d0rVar;
        this.c = hti0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        d0r d0rVar = this.e;
        a42 a42Var = this.d;
        hti0 hti0Var = this.c;
        switch (b) {
            case 0:
                return new ll1(a42Var, d0rVar, hti0Var, lnmVar);
            default:
                return new ll1(hti0Var, a42Var, d0rVar, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d0r d0rVar = this.e;
        d9n d9nVar = d9n.a;
        hti0 hti0Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str = hti0Var.a;
                this.b = true;
                Object objE = k8p1.e(d3p1.F(d0rVar, w3p1.o(new l4r(hvm.b, 1, uh1.N0, new j4r(uh1.P0), uh1.O0), uh1.Q0), str), this);
                return objE == d9nVar ? d9nVar : objE;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    qxc0 qxc0Var = hti0Var.d;
                    String str2 = hti0Var.a;
                    if (qxc0Var != null) {
                        if (!qxc0Var.h) {
                            Set set = s4b1.f;
                            if (uic.x(str2).c == blc0.g1) {
                            }
                            return Boolean.valueOf(z);
                        }
                        this.b = true;
                        obj = k8p1.e(d3p1.F(d0rVar, w3p1.o(new l4r(new xv00(rc11.a.b(qp31.class)), 1, uh1.R0, new j4r(uh1.T0), uh1.S0), uh1.U0), str2), this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (!z2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                boolean z3 = ((qp31) obj).a;
                return Boolean.valueOf(z3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll1(hti0 hti0Var, a42 a42Var, d0r d0rVar, lnm lnmVar) {
        super(2, lnmVar);
        this.c = hti0Var;
        this.d = a42Var;
        this.e = d0rVar;
    }
}

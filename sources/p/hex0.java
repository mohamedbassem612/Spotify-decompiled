package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hex0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ d0r c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hex0(d0r d0rVar, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = d0rVar;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        d0r d0rVar = this.c;
        switch (b) {
            case 0:
                return new hex0(d0rVar, str, lnmVar, (byte) 0);
            case 1:
                return new hex0(d0rVar, str, lnmVar, (byte) 1);
            case 2:
                return new hex0(d0rVar, str, lnmVar, (byte) 2);
            default:
                return new hex0(d0rVar, str, lnmVar, (byte) 3);
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
            case 1:
                break;
            case 2:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.d;
        d0r d0rVar = this.c;
        d9n d9nVar = d9n.a;
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
                ay8 ay8VarF = d3p1.F(d0rVar, w3p1.o(new l4r(hvm.b, 1, k1x0.Z0, new j4r(k1x0.X0), k1x0.a1), k1x0.Y0), str);
                this.b = true;
                Object objQ = wpb1.q(ay8VarF, this);
                return objQ == d9nVar ? d9nVar : objQ;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ay8 ay8VarF2 = d3p1.F(d0rVar, w3p1.o(new l4r(new xv00(rc11.a.b(qp31.class)), 1, k1x0.d1, new j4r(k1x0.b1), k1x0.e1), k1x0.c1), str);
                this.b = true;
                Object objQ2 = wpb1.q(ay8VarF2, this);
                return objQ2 == d9nVar ? d9nVar : objQ2;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                v061 v061Var = v061.d;
                hnj1 hnj1Var = new hnj1(str);
                this.b = true;
                d0rVar.getClass();
                return d0r.d(d0rVar, v061Var, hnj1Var, fnj1.a, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ay8 ay8VarF3 = d3p1.F(d0rVar, w3p1.o(new l4r(v061.d, 1, jmj1.f, new j4r(new ysf1(str, (byte) 27)), jmj1.g), jmj1.e), rih1Var);
                this.b = true;
                Object objH = u2p1.h(ay8VarF3, this);
                return objH == d9nVar ? d9nVar : objH;
        }
    }
}

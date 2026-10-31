package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cyl1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ f2g1 c;
    public final /* synthetic */ y4m1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cyl1(f2g1 f2g1Var, y4m1 y4m1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = f2g1Var;
        this.d = y4m1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        y4m1 y4m1Var = this.d;
        f2g1 f2g1Var = this.c;
        switch (b) {
            case 0:
                return new cyl1(y4m1Var, f2g1Var, lnmVar, (byte) 0);
            case 1:
                return new cyl1(f2g1Var, y4m1Var, lnmVar, (byte) 1);
            case 2:
                return new cyl1(y4m1Var, f2g1Var, lnmVar, (byte) 2);
            default:
                return new cyl1(f2g1Var, y4m1Var, lnmVar, (byte) 3);
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
        f2g1 f2g1Var = this.c;
        rih1 rih1Var = rih1.a;
        y4m1 y4m1Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                lt20 lt20Var = new lt20(h4p1.l(new xoh1(y4m1Var, ezl1.b, (lnm) null, (byte) 10)), new bi61(3, (lnm) null, (byte) 6), (byte) 0);
                byl1 byl1Var = new byl1(f2g1Var, (byte) 0);
                this.b = true;
                return lt20Var.collect(byl1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                f2g1 f2g1Var2 = this.c;
                lt20 lt20Var2 = new lt20(h4p1.f(new sh6(f2g1Var2, "/workout_coaching_toggle", new yvf1(f2g1Var2, (byte) 19), (lnm) null, (byte) 14)), new bi61(3, (lnm) null, (byte) 7), (byte) 0);
                eyl1 eyl1Var = new eyl1(y4m1Var, f2g1Var2, (byte) 0);
                this.b = true;
                return lt20Var2.collect(eyl1Var, this) == d9nVar ? d9nVar : rih1Var;
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
                lt20 lt20Var3 = new lt20(h4p1.l(new xoh1(y4m1Var, ezl1.a, (lnm) null, (byte) 10)), new bi61(3, (lnm) null, (byte) 8), (byte) 0);
                byl1 byl1Var2 = new byl1(f2g1Var, (byte) 1);
                this.b = true;
                return lt20Var3.collect(byl1Var2, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                f2g1 f2g1Var3 = this.c;
                lt20 lt20Var4 = new lt20(h4p1.f(new sh6(f2g1Var3, "/workout_mode_toggle", new yvf1(f2g1Var3, (byte) 20), (lnm) null, (byte) 14)), new bi61(3, (lnm) null, (byte) 9), (byte) 0);
                eyl1 eyl1Var2 = new eyl1(y4m1Var, f2g1Var3, (byte) 1);
                this.b = true;
                return lt20Var4.collect(eyl1Var2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cyl1(y4m1 y4m1Var, f2g1 f2g1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = y4m1Var;
        this.c = f2g1Var;
    }
}

package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w73 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w73(boolean z, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.b = z;
        this.c = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                return new w73(iu30Var, lnmVar, (byte) 0);
            case 1:
                return new w73(this.b, iu30Var, lnmVar);
            case 2:
                return new w73(iu30Var, lnmVar, (byte) 2);
            case 3:
                return new w73(iu30Var, lnmVar, (byte) 3);
            case 4:
                return new w73(iu30Var, lnmVar, (byte) 4);
            case 5:
                return new w73(iu30Var, lnmVar, (byte) 5);
            case 6:
                return new w73(iu30Var, lnmVar, (byte) 6);
            case 7:
                return new w73(iu30Var, lnmVar, (byte) 7);
            case 8:
                return new w73(iu30Var, lnmVar, (byte) 8);
            case 9:
                return new w73(iu30Var, lnmVar, (byte) 9);
            case 10:
                return new w73(iu30Var, lnmVar, (byte) 10);
            case 11:
                return new w73(iu30Var, lnmVar, (byte) 11);
            case 12:
                return new w73(iu30Var, lnmVar, (byte) 12);
            case 13:
                return new w73(iu30Var, lnmVar, (byte) 13);
            case 14:
                return new w73(iu30Var, lnmVar, (byte) 14);
            case 15:
                return new w73(iu30Var, this.b, lnmVar, (byte) 15);
            case 16:
                return new w73(iu30Var, lnmVar, (byte) 16);
            case 17:
                return new w73(iu30Var, lnmVar, (byte) 17);
            case 18:
                return new w73(iu30Var, lnmVar, (byte) 18);
            case 19:
                return new w73(iu30Var, lnmVar, (byte) 19);
            case 20:
                return new w73(iu30Var, lnmVar, (byte) 20);
            case 21:
                return new w73(iu30Var, lnmVar, (byte) 21);
            case 22:
                return new w73(iu30Var, lnmVar, (byte) 22);
            case 23:
                return new w73(iu30Var, this.b, lnmVar, (byte) 23);
            case 24:
                return new w73(iu30Var, lnmVar, (byte) 24);
            case 25:
                return new w73(iu30Var, lnmVar, (byte) 25);
            default:
                return new w73(iu30Var, lnmVar, (byte) 26);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 3:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 4:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 5:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 6:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 7:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 8:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 9:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 10:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 11:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 12:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 13:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 14:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 15:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 17:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 18:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 19:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 20:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 21:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 22:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 23:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 25:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objInvoke;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        d9n d9nVar = d9n.a;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objInvoke2 = iu30Var.invoke(this);
                    return objInvoke2 == d9nVar ? d9nVar : objInvoke2;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                hm5.M(obj);
                if (!this.b) {
                    iu30Var.invoke(Boolean.TRUE);
                }
                return rih1Var;
            case 2:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    return iu30Var.invoke(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
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
                geo0 geo0Var = geo0.b;
                w73 w73Var = new w73(iu30Var, lnmVar, (byte) 2);
                this.b = true;
                return fn31.Y(geo0Var, w73Var, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.b = true;
                    Object objInvoke3 = iu30Var.invoke(this);
                    return objInvoke3 == d9nVar ? d9nVar : objInvoke3;
                }
                if (z4) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    return iu30Var.invoke(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.b = true;
                    Object objInvoke4 = iu30Var.invoke(this);
                    return objInvoke4 == d9nVar ? d9nVar : objInvoke4;
                }
                if (z6) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    this.b = true;
                    return iu30Var.invoke(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z7) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    this.b = true;
                    Object objInvoke5 = iu30Var.invoke(this);
                    return objInvoke5 == d9nVar ? d9nVar : objInvoke5;
                }
                if (z8) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    this.b = true;
                    Object objInvoke6 = iu30Var.invoke(this);
                    return objInvoke6 == d9nVar ? d9nVar : objInvoke6;
                }
                if (z9) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    this.b = true;
                    Object objInvoke7 = iu30Var.invoke(this);
                    return objInvoke7 == d9nVar ? d9nVar : objInvoke7;
                }
                if (z10) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    this.b = true;
                    return iu30Var.invoke(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z11) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    this.b = true;
                    Object objInvoke8 = iu30Var.invoke(this);
                    return objInvoke8 == d9nVar ? d9nVar : objInvoke8;
                }
                if (z12) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    this.b = true;
                    objInvoke = iu30Var.invoke(this);
                    if (objInvoke == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objInvoke = obj;
                }
                l111 l111Var = (l111) objInvoke;
                List listSubList = l111Var.a;
                if (listSubList.size() > 9) {
                    listSubList = listSubList.subList(0, 9);
                }
                return new l111(listSubList, l111Var.b);
            case 14:
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    this.b = true;
                    return iu30Var.invoke(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z14) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                hm5.M(obj);
                iu30Var.invoke(Boolean.valueOf(this.b));
                return rih1Var;
            case 16:
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    this.b = true;
                    Object objInvoke9 = iu30Var.invoke(this);
                    return objInvoke9 == d9nVar ? d9nVar : objInvoke9;
                }
                if (z15) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    this.b = true;
                    Object objInvoke10 = iu30Var.invoke(this);
                    return objInvoke10 == d9nVar ? d9nVar : objInvoke10;
                }
                if (z16) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    this.b = true;
                    return iu30Var.invoke(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z17) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    this.b = true;
                    return iu30Var.invoke(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z18) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    this.b = true;
                    Object objInvoke11 = iu30Var.invoke(this);
                    return objInvoke11 == d9nVar ? d9nVar : objInvoke11;
                }
                if (z19) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    this.b = true;
                    return iu30Var.invoke(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z20) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    this.b = true;
                    Object objInvoke12 = iu30Var.invoke(this);
                    return objInvoke12 == d9nVar ? d9nVar : objInvoke12;
                }
                if (z21) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                hm5.M(obj);
                iu30Var.invoke(Boolean.valueOf(this.b));
                return rih1Var;
            case 24:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    this.b = true;
                    return iu30Var.invoke(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z22) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    this.b = true;
                    return iu30Var.invoke(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z23) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z24 = this.b;
                hm5.M(obj);
                if (z24) {
                    return obj;
                }
                h2x0 h2x0Var = h2x0.Z0;
                this.b = true;
                Object objC = h2x0Var.c(20, 100L, 1000L, 2.0d, this.c, this);
                return objC == d9nVar ? d9nVar : objC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w73(iu30 iu30Var, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = iu30Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w73(iu30 iu30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = iu30Var;
    }
}

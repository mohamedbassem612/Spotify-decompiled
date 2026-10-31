package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class es9 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es9(lnm lnmVar, iu30 iu30Var, en31 en31Var, boolean z, boolean z2) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.e = en31Var;
        this.c = z;
        this.d = z2;
        this.f = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                return new es9(this.c, this.d, obj3, (ven0) obj2, lnmVar, (byte) 0);
            case 1:
                return new es9(this.c, this.d, obj3, (ven0) obj2, lnmVar, (byte) 1);
            case 2:
                return new es9(this.c, (Long) obj3, this.d, (ven0) obj2, lnmVar);
            case 3:
                return new es9(lnmVar, (iu30) obj3, (en31) obj2, this.c, this.d);
            case 4:
                return new es9(obj3, obj2, this.c, this.d, lnmVar, (byte) 4);
            default:
                return new es9(obj3, obj2, this.c, this.d, lnmVar, (byte) 5);
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
            case 3:
                break;
            case 4:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objB;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.d;
        boolean z2 = this.c;
        Object obj2 = this.e;
        Object obj3 = this.f;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (!z2 || !z || ((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                        return rih1Var;
                    }
                    this.b = true;
                    if (hap1.i(3500L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((iu30) obj3).invoke(Boolean.FALSE);
                return rih1Var;
            case 1:
                ven0 ven0Var = (ven0) obj2;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    if (!z2 || z) {
                        ceo ceoVar = kub.a;
                        ven0Var.setValue(Boolean.FALSE);
                        return rih1Var;
                    }
                    long j = ((sdp0) obj3).c;
                    this.b = true;
                    if (hap1.i(j, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ceo ceoVar2 = kub.a;
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 2:
                ven0 ven0Var2 = (ven0) obj2;
                Long l = (Long) obj3;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    if (!z2) {
                        boolean z6 = l == null || z;
                        ceo ceoVar3 = kub.a;
                        ven0Var2.setValue(Boolean.valueOf(z6));
                        return rih1Var;
                    }
                    if (!z && l != null && l.longValue() > 0) {
                        long jLongValue = l.longValue();
                        this.b = true;
                        if (hap1.i(jLongValue, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ceo ceoVar4 = kub.a;
                ven0Var2.setValue(Boolean.TRUE);
                return rih1Var;
            case 3:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                en31 en31Var = (en31) obj2;
                boolean z8 = this.d;
                boolean z9 = this.c;
                iuo iuoVar = new iuo((lnm) null, (iu30) obj3, en31Var, z8, z9);
                this.b = true;
                Object objT = en31Var.t(z9, iuoVar, this);
                return objT == d9nVar ? d9nVar : objT;
            case 4:
                mzr0 mzr0Var = (mzr0) obj3;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    i8h1 i8h1Var = (i8h1) ((wgb) mzr0Var.g).a.get();
                    sqk0 sqk0VarA = wgb.a();
                    x6h1 x6h1VarC = sqk0VarA.b.c();
                    x6h1VarC.i.add(new a7h1("confirm_action", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    b7x b7xVar = b7x.a;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, sqk0VarA.c.b, System.currentTimeMillis()), (xj61) null);
                    o130 o130Var = (j130) mzr0Var.c;
                    this.b = true;
                    objB = o130Var.b((String) obj2, this, z2);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = obj;
                }
                if (!(((py21) objB) instanceof oy21)) {
                    mzr0Var.w();
                    return rih1Var;
                }
                if (!z) {
                    return rih1Var;
                }
                ((lzn0) mzr0Var.b).e();
                return rih1Var;
            default:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dlg1 dlg1Var = (dlg1) obj3;
                k2b0 k2b0Var = (e2b0) dlg1Var.b;
                yig1 yig1Var = ((yxa0) obj2).a;
                cmg1 cmg1Var = (cmg1) dlg1Var.c;
                String str = cmg1Var.b;
                String str2 = cmg1Var.c;
                String str3 = cmg1Var.d;
                this.b = true;
                Object objE = k2b0Var.e(yig1Var, str, str2, this.c, this.d, str3, this);
                return objE == d9nVar ? d9nVar : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ es9(Object obj, Object obj2, boolean z, boolean z2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.e = obj2;
        this.c = z;
        this.d = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es9(boolean z, Long l, boolean z2, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.c = z;
        this.f = l;
        this.d = z2;
        this.e = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ es9(boolean z, boolean z2, Object obj, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.d = z2;
        this.f = obj;
        this.e = ven0Var;
    }
}

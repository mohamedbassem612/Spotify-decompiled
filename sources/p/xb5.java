package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xb5 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public float c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb5(float f, drr0 drr0Var, tob1 tob1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.c = f;
        this.d = drr0Var;
        this.e = tob1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return new xb5((yb5) this.d, this.c, (n8b1) obj2, lnmVar, (byte) 0);
            case 1:
                return new xb5((vrv0) this.d, this.c, (fe5) obj2, lnmVar, (byte) 1);
            case 2:
                return new xb5((fke1) this.d, this.c, (l811) obj2, lnmVar, (byte) 2);
            case 3:
                xb5 xb5Var = new xb5((mhg1) obj2, lnmVar);
                xb5Var.d = obj;
                return xb5Var;
            default:
                return new xb5(this.c, (drr0) this.d, (tob1) obj2, lnmVar);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objB;
        c9n c9nVar;
        float fC;
        byte b = this.a;
        Object obj2 = this.e;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    o95 o95Var = ((yb5) this.d).P0;
                    if (o95Var != null) {
                        this.b = true;
                        objB = o95.b(o95Var, new p3v(this.c), (n8b1) obj2, (Float) null, (iu30) null, this, 12);
                        if (objB == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1Var;
                }
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objB = obj;
                return rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    if (o95.b((o95) ((vrv0) this.d).d, new Float(this.c), (fe5) obj2, (Float) null, (iu30) null, this, 12) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 2:
                fke1 fke1Var = (fke1) this.d;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    o95 o95Var2 = fke1Var.b1;
                    Float f = new Float(this.c);
                    n8b1 n8b1Var = fke1Var.V0;
                    cmd1 cmd1Var = new cmd1(fke1Var, (l811) obj2, (byte) 10);
                    this.b = true;
                    if (o95.b(o95Var2, f, n8b1Var, (Float) null, cmd1Var, this, 4) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    c9n c9nVar2 = (c9n) this.d;
                    c9nVar = c9nVar2;
                    fC = wwo1.C(c9nVar2.J());
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fC = this.c;
                    c9nVar = (c9n) this.d;
                    hm5.M(obj);
                }
                while (smo1.u(c9nVar)) {
                    h5v h5vVar = new h5v((mhg1) obj2, fC);
                    this.d = c9nVar;
                    this.c = fC;
                    this.b = true;
                    if (s110.h(getContext()).D(h5vVar, this) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            default:
                drr0 drr0Var = (drr0) this.d;
                float f2 = this.c;
                boolean z5 = this.b;
                try {
                    if (!z5) {
                        hm5.M(obj);
                        if (Math.abs(f2) >= 100.0f) {
                            o95 o95VarB = c97.b(drr0Var.s());
                            Float f3 = new Float(-f2);
                            e9r e9rVar = new e9r(new bhv(2.0f, 50.0f, (byte) 1));
                            lb90 lb90Var = new lb90(drr0Var, (tob1) obj2);
                            this.b = true;
                            if (o95VarB.a(f3, e9rVar, lb90Var, this) == d9nVar) {
                                return d9nVar;
                            }
                        }
                        return rih1Var;
                    }
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    break;
                } catch (Exception unused) {
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb5(Object obj, float f, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = f;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb5(mhg1 mhg1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.e = mhg1Var;
    }
}

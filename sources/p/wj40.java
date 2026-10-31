package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wj40 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ float c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj40(float f, upb0 upb0Var, tob1 tob1Var, drr0 drr0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.c = f;
        this.d = upb0Var;
        this.e = tob1Var;
        this.f = drr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                return new wj40(this.d, this.c, obj3, obj2, lnmVar, (byte) 0);
            case 1:
                return new wj40(this.c, (upb0) this.d, (tob1) obj3, (drr0) obj2, lnmVar);
            case 2:
                wj40 wj40Var = new wj40(this.c, (fe5) obj3, (m811) obj2, lnmVar);
                wj40Var.d = obj;
                return wj40Var;
            case 3:
                return new wj40(this.d, obj3, this.c, (ven0) obj2, lnmVar, (byte) 3);
            case 4:
                return new wj40(this.d, this.c, obj3, obj2, lnmVar, (byte) 4);
            default:
                return new wj40(this.d, obj3, this.c, (ven0) obj2, lnmVar, (byte) 5);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((bs41) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        yv40 yv40Var;
        byte b = this.a;
        float f = this.c;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        d9n d9nVar = d9n.a;
        Object obj3 = this.f;
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
                pob0 pob0Var = (pob0) this.d;
                long jO = vpb1.o((bav0) obj2, true, new p5e1((byte) 17));
                this.b = true;
                Object objA = pob0Var.e.a(hfn0.b, new oob0(pob0Var, (lbh) obj3, this.c, jO, null), this);
                if (objA != d9nVar) {
                    objA = rih1Var;
                }
                return objA == d9nVar ? d9nVar : rih1Var;
            case 1:
                drr0 drr0Var = (drr0) obj3;
                upb0 upb0Var = (upb0) this.d;
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
                gg50 gg50Var = (gg50) ((tob1) obj2).getValue();
                int i = gg50Var.b;
                int i2 = gg50Var.a;
                float fS = drr0Var.s() + (f * (i / gg50Var.e) * gg50Var.c);
                int i3 = (int) fS;
                drr0Var.t(fS - i3);
                fdc fdcVar = upb0Var.d;
                fdc fdcVar2 = upb0Var.d;
                int i4 = i2 - 1;
                int iP = yoi1.p(((err0) fdcVar.c).s() + i3, 0, i4);
                mpb0 mpb0Var = (mpb0) o7h.C0(upb0Var.h().n);
                int i5 = mpb0Var != null ? mpb0Var.a : 0;
                boolean z3 = ((err0) fdcVar2.c).s() == 0 && ((err0) fdcVar2.d).s() == 0;
                boolean z4 = i5 == i4;
                if (i3 < 0 && z3) {
                    return rih1Var;
                }
                if ((i3 > 0 && z4) || ((err0) fdcVar2.c).s() == iP) {
                    return rih1Var;
                }
                this.b = true;
                return upb0.i(upb0Var, iP, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    f14 f14Var = new f14((m811) obj3, (bs41) this.d, (byte) 28);
                    this.b = true;
                    return wwo1.t(0.0f, this.c, (fe5) obj2, f14Var, this, 4) == d9nVar ? d9nVar : rih1Var;
                }
                if (z5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                err0 err0Var = (hdn0) obj3;
                c380 c380Var = (c380) this.d;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (c380Var.isEmpty()) {
                    return rih1Var;
                }
                int size = c380Var.size();
                d261 d261Var = c1e1.a;
                err0 err0Var2 = err0Var;
                int iS = err0Var2.s();
                if (iS < 0 || iS >= size) {
                    return rih1Var;
                }
                this.b = true;
                return ((xtb0) obj2).k(err0Var2.s(), -((int) f), this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    o95 o95Var = (o95) this.d;
                    Float f2 = new Float(f);
                    pxg1 pxg1VarO0 = irn1.o0(300, 0, mlv.a, 2);
                    ktk1 ktk1Var = new ktk1((drr0) obj3, (byte) 1);
                    this.b = true;
                    if (o95.b(o95Var, f2, pxg1VarO0, (Float) null, ktk1Var, this, 4) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((jti0) obj2).f(true);
                return rih1Var;
            default:
                frr0 frr0Var = (frr0) obj3;
                vcu0 vcu0Var = (ycu0) this.d;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    if (!(vcu0Var instanceof vcu0) || vcu0Var.a <= 0) {
                        frr0Var.t(0L);
                        return rih1Var;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                do {
                    yv40Var = new yv40((yqg) obj2, vcu0Var, this.c, frr0Var, (byte) 4);
                    this.b = true;
                } while (s110.q(yv40Var, this) != d9nVar);
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj40(float f, fe5 fe5Var, m811 m811Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.c = f;
        this.e = fe5Var;
        this.f = m811Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj40(Object obj, float f, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = f;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj40(Object obj, Object obj2, float f, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = f;
        this.f = ven0Var;
    }
}

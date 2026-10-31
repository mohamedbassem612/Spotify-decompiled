package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kkr extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public byte b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkr(float f, jo51 jo51Var, hnn0 hnn0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = f;
        this.d = jo51Var;
        this.e = hnn0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                return new kkr((o95) obj3, this.c, null, (qt80) obj2, lnmVar);
            default:
                return new kkr(this.c, (jo51) obj3, (hnn0) obj2, lnmVar);
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

    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    public final Object invokeSuspend(Object obj) {
        qt80 ry20Var;
        Object objG;
        Object objA;
        byte b = this.a;
        Object obj2 = this.e;
        d9n d9nVar = d9n.a;
        float f = this.c;
        rih1 rih1Var = rih1.a;
        pxg1 pxg1Var = null;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                o95 o95Var = (o95) obj3;
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    if (!p3v.c(((p3v) o95Var.e.getValue()).a, f)) {
                        float f2 = ((p3v) o95Var.e.getValue()).a;
                        if (p3v.c(f2, 8.0f)) {
                            ry20Var = new r9w0(0L);
                        } else if (p3v.c(f2, 4.0f)) {
                            ry20Var = new dy60();
                        } else {
                            ry20Var = p3v.c(f2, 4.0f) ? new ry20() : null;
                        }
                        o95 o95Var2 = (o95) obj3;
                        qt80 qt80Var = (qt80) obj2;
                        this.b = (byte) 2;
                        pxg1 pxg1Var2 = euw.b;
                        pxg1 pxg1Var3 = euw.a;
                        if (qt80Var != null) {
                            if ((qt80Var instanceof r9w0) || (qt80Var instanceof o5v) || (qt80Var instanceof dy60) || (qt80Var instanceof ry20)) {
                                pxg1Var = pxg1Var3;
                            }
                        } else if (ry20Var != null) {
                            if ((ry20Var instanceof r9w0) || (ry20Var instanceof o5v)) {
                                pxg1Var = pxg1Var2;
                            } else if (ry20Var instanceof dy60) {
                                pxg1Var = euw.c;
                            } else if (ry20Var instanceof ry20) {
                                pxg1Var = pxg1Var2;
                            }
                        }
                        pxg1 pxg1Var4 = pxg1Var;
                        if (pxg1Var4 == null ? (objG = o95Var2.g(new p3v(f), this)) != d9nVar : (objG = o95.b(o95Var2, new p3v(f), pxg1Var4, (Float) null, (iu30) null, this, 12)) != d9nVar) {
                            objG = rih1Var;
                        }
                        if (objG == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (b2 != 1 && b2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                jo51 jo51Var = (jo51) obj3;
                byte b3 = this.b;
                if (b3 != 0) {
                    if (b3 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                }
                hm5.M(obj);
                if (f > 0.0f) {
                    this.b = (byte) 1;
                    if (jo51Var.A1(f, jo51Var.c.getValue(), this) == d9nVar) {
                        return d9nVar;
                    }
                }
                if (f == 0.0f) {
                    hnn0 hnn0Var = (hnn0) obj2;
                    this.b = (byte) 2;
                    mhg1 mhg1Var = jo51Var.f;
                    if (mhg1Var == null || ((u890.j(jo51Var.d.getValue(), hnn0Var) && u890.j(jo51Var.c.getValue(), hnn0Var)) || (objA = qfn0.a(jo51Var.Z, new do51(jo51Var, hnn0Var, mhg1Var, (lnm) null, (byte) 1), this)) != d9nVar)) {
                        objA = rih1Var;
                    }
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkr(o95 o95Var, float f, t6p1 t6p1Var, qt80 qt80Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = o95Var;
        this.c = f;
        this.e = qt80Var;
    }
}

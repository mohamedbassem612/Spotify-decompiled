package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k4g extends a8d1 implements vu30 {
    public int a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ p3g d;
    public final /* synthetic */ l4g e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4g(p3g p3gVar, l4g l4gVar, float f, lnm lnmVar) {
        super(2, lnmVar);
        this.d = p3gVar;
        this.e = l4gVar;
        this.f = f;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        k4g k4gVar = new k4g(this.d, this.e, this.f, lnmVar);
        k4gVar.c = obj;
        return k4gVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1 A[RETURN] */
    public final Object invokeSuspend(Object obj) {
        int iU;
        Float f;
        int i;
        Object objB;
        Object objS;
        l4g l4gVar = this.e;
        o95 o95Var = l4gVar.c;
        o95 o95Var2 = l4gVar.b;
        c9n c9nVar = (c9n) this.c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
                iU = jch0.U(Math.abs(this.f - ((Number) o95Var2.e()).floatValue()) * 500.0f);
                if (iU < 150) {
                    iU = 150;
                }
                f = new Float(1.1666666f);
                this.c = c9nVar;
                this.a = iU;
                this.b = (byte) 2;
                if (o95Var.g(f, this) != d9nVar) {
                    i = iU;
                }
            } else if (b == 2) {
                i = this.a;
                hm5.M(obj);
            } else {
                if (b == 3) {
                    hm5.M(obj);
                    return obj;
                }
                if (b != 4) {
                    if (b == 5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.c = null;
                this.b = (byte) 5;
                objS = smo1.s(new vs0(l4gVar, (lnm) null, (byte) 25), this);
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                if (objS == d9nVar) {
                    return rih1Var;
                }
            }
            l811 l811Var = new l811();
            Float f2 = new Float(1.0f);
            pxg1 pxg1VarO0 = irn1.o0(i, 0, q2g.d, 2);
            o0d o0dVar = new o0d(l811Var, l4gVar, c9nVar, (byte) 8);
            this.c = null;
            this.a = i;
            this.b = (byte) 3;
            objB = o95.b(o95Var2, f2, pxg1VarO0, (Float) null, o0dVar, this, 4);
            if (objB == d9nVar) {
                return objB;
            }
        } else {
            hm5.M(obj);
            if (this.d == p3g.b) {
                o95 o95Var3 = l4gVar.d;
                Float f3 = new Float(1.0f);
                this.c = c9nVar;
                this.b = (byte) 1;
                if (o95Var3.g(f3, this) != d9nVar) {
                    iU = jch0.U(Math.abs(this.f - ((Number) o95Var2.e()).floatValue()) * 500.0f);
                    if (iU < 150) {
                        iU = 150;
                    }
                    f = new Float(1.1666666f);
                    this.c = c9nVar;
                    this.a = iU;
                    this.b = (byte) 2;
                    if (o95Var.g(f, this) != d9nVar) {
                        i = iU;
                        l811 l811Var2 = new l811();
                        Float f4 = new Float(1.0f);
                        pxg1 pxg1VarO1 = irn1.o0(i, 0, q2g.d, 2);
                        o0d o0dVar2 = new o0d(l811Var2, l4gVar, c9nVar, (byte) 8);
                        this.c = null;
                        this.a = i;
                        this.b = (byte) 3;
                        objB = o95.b(o95Var2, f4, pxg1VarO1, (Float) null, o0dVar2, this, 4);
                        if (objB == d9nVar) {
                            return objB;
                        }
                    }
                }
            } else {
                Float f5 = new Float(1.0f);
                this.c = null;
                this.b = (byte) 4;
                if (o95Var.g(f5, this) != d9nVar) {
                    this.c = null;
                    this.b = (byte) 5;
                    objS = smo1.s(new vs0(l4gVar, (lnm) null, (byte) 25), this);
                    if (objS != d9nVar) {
                        objS = rih1Var;
                    }
                    if (objS == d9nVar) {
                        return rih1Var;
                    }
                }
            }
        }
        return d9nVar;
    }
}

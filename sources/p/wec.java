package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wec extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ o95 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ qt80 f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wec(o95 o95Var, float f, boolean z, Object obj, qt80 qt80Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = o95Var;
        this.d = f;
        this.e = z;
        this.g = obj;
        this.f = qt80Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                return new wec(this.c, this.d, this.e, (xec) obj2, this.f, lnmVar, (byte) 0);
            default:
                return new wec(this.c, this.d, this.e, (ltd) obj2, this.f, lnmVar, (byte) 1);
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
        rih1 rih1Var = rih1.a;
        qt80 qt80Var = this.f;
        boolean z = this.e;
        d9n d9nVar = d9n.a;
        o95 o95Var = this.c;
        float f = this.d;
        qt80 ry20Var = null;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (p3v.c(((p3v) o95Var.e.getValue()).a, f)) {
                    return rih1Var;
                }
                if (z) {
                    float f2 = ((p3v) o95Var.e.getValue()).a;
                    if (p3v.c(f2, 0.0f)) {
                        ry20Var = new r9w0(0L);
                    } else if (p3v.c(f2, 1.0f)) {
                        ry20Var = new dy60();
                    } else if (p3v.c(f2, 0.0f)) {
                        ry20Var = new ry20();
                    }
                    this.b = (byte) 2;
                    if (duw.a(o95Var, f, ry20Var, qt80Var, this) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    p3v p3vVar = new p3v(f);
                    this.b = (byte) 1;
                    if (o95Var.g(p3vVar, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            default:
                ltd ltdVar = (ltd) this.g;
                byte b3 = this.b;
                if (b3 != 0) {
                    if (b3 == 1 || b3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (p3v.c(((p3v) o95Var.e.getValue()).a, f)) {
                    return rih1Var;
                }
                if (z) {
                    float f3 = ((p3v) o95Var.e.getValue()).a;
                    if (p3v.c(f3, 0.0f)) {
                        ry20Var = new r9w0(0L);
                    } else if (p3v.c(f3, ltdVar.b)) {
                        ry20Var = new dy60();
                    } else if (p3v.c(f3, 0.0f)) {
                        ry20Var = new ry20();
                    } else if (p3v.c(f3, ltdVar.c)) {
                        ry20Var = new o5v();
                    }
                    this.b = (byte) 2;
                    if (duw.a(o95Var, f, ry20Var, qt80Var, this) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    p3v p3vVar2 = new p3v(f);
                    this.b = (byte) 1;
                    if (o95Var.g(p3vVar2, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
        }
    }
}

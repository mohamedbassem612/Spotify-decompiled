package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bj01 extends a8d1 implements vu30 {
    public vgn0 a;
    public hj01 b;
    public gp41 c;
    public x8c0 d;
    public int e;
    public byte f;
    public /* synthetic */ Object g;
    public final /* synthetic */ hj01 h;
    public final /* synthetic */ gp41 i;
    public final /* synthetic */ x8c0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj01(hj01 hj01Var, gp41 gp41Var, x8c0 x8c0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.h = hj01Var;
        this.i = gp41Var;
        this.t = x8c0Var;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        bj01 bj01Var = new bj01(this.h, this.i, this.t, lnmVar);
        bj01Var.g = obj;
        return bj01Var;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((bj01) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) throws Throwable {
        vgn0 vgn0Var;
        gp41 gp41Var;
        x8c0 x8c0Var;
        hj01 hj01Var;
        int i;
        vgn0 vgn0Var2;
        x8c0 x8c0Var2;
        gp41 gp41Var2;
        hj01 hj01Var2;
        c9n c9nVar = (c9n) this.g;
        d9n d9nVar = d9n.a;
        byte b = this.f;
        try {
            if (b == 0) {
                hm5.M(obj);
                hj01 hj01Var3 = this.h;
                vgn0Var = hj01Var3.l;
                gp41Var = this.i;
                x8c0 x8c0Var3 = this.t;
                this.g = c9nVar;
                this.a = vgn0Var;
                this.b = hj01Var3;
                this.c = gp41Var;
                this.d = x8c0Var3;
                this.e = 0;
                this.f = (byte) 1;
                if (vgn0Var.a(this) != d9nVar) {
                    x8c0Var = x8c0Var3;
                    hj01Var = hj01Var3;
                    i = 0;
                }
                return d9nVar;
            }
            if (b != 1) {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x8c0Var2 = this.d;
                gp41Var2 = this.c;
                hj01Var2 = this.b;
                vgn0Var2 = this.a;
                try {
                    hm5.M(obj);
                    x8c0Var = x8c0Var2;
                    gp41Var = gp41Var2;
                    hj01Var = hj01Var2;
                    hj01Var.k = hj01Var.d.d(gp41Var);
                    hj01Var.m = c921.y(c9nVar, (o8n) null, 0, new b201(x8c0Var, hj01Var, (lnm) null, (byte) 9), 3);
                    vgn0Var2.c(null);
                    return rih1.a;
                } catch (Throwable th) {
                    th = th;
                    vgn0Var2.c(null);
                    throw th;
                }
            }
            int i2 = this.e;
            x8c0Var = this.d;
            gp41Var = this.c;
            hj01Var = this.b;
            vgn0 vgn0Var3 = this.a;
            hm5.M(obj);
            i = i2;
            vgn0Var = vgn0Var3;
            faa0 faa0Var = hj01Var.m;
            if (faa0Var != null) {
                this.g = c9nVar;
                this.a = vgn0Var;
                this.b = hj01Var;
                this.c = gp41Var;
                this.d = x8c0Var;
                this.e = i;
                this.f = (byte) 2;
                if (op71.p(faa0Var, this) != d9nVar) {
                    vgn0Var2 = vgn0Var;
                    x8c0Var2 = x8c0Var;
                    gp41Var2 = gp41Var;
                    hj01Var2 = hj01Var;
                    x8c0Var = x8c0Var2;
                    gp41Var = gp41Var2;
                    hj01Var = hj01Var2;
                }
                return d9nVar;
            }
            vgn0Var2 = vgn0Var;
            hj01Var.k = hj01Var.d.d(gp41Var);
            hj01Var.m = c921.y(c9nVar, (o8n) null, 0, new b201(x8c0Var, hj01Var, (lnm) null, (byte) 9), 3);
            vgn0Var2.c(null);
            return rih1.a;
        } catch (Throwable th2) {
            th = th2;
            vgn0Var2 = vgn0Var;
            vgn0Var2.c(null);
            throw th;
        }
    }
}

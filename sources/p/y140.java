package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y140 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ o95 g;
    public final /* synthetic */ o95 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y140(boolean z, boolean z2, ven0 ven0Var, float f, o95 o95Var, o95 o95Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.c = z;
        this.d = z2;
        this.e = ven0Var;
        this.f = f;
        this.g = o95Var;
        this.h = o95Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        y140 y140Var = new y140(this.c, this.d, this.e, this.f, this.g, this.h, lnmVar);
        y140Var.b = obj;
        return y140Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        c9n c9nVar = (c9n) this.b;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            if (!this.c && !this.d && ((int) (((yr80) this.e.getValue()).a & 4294967295L)) > 0) {
                fn31.T(c9nVar, (o8n) null, 0, new nzr(this.f, this.e, this.g, this.h, null), 3);
            }
            this.b = null;
            this.a = true;
            Object objI = hap1.i(1100L, this);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}

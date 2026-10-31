package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s6v extends a8d1 implements vu30 {
    public final /* synthetic */ ven0 N0;
    public final /* synthetic */ float X;
    public final /* synthetic */ ss50 Y;
    public final /* synthetic */ xtb0 Z;
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ dw91 f;
    public final /* synthetic */ dw91 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6v(int i, int i2, ven0 ven0Var, dw91 dw91Var, dw91 dw91Var2, float f, float f2, float f3, float f4, ss50 ss50Var, xtb0 xtb0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.c = i;
        this.d = i2;
        this.e = ven0Var;
        this.f = dw91Var;
        this.g = dw91Var2;
        this.h = f;
        this.i = f2;
        this.t = f3;
        this.X = f4;
        this.Y = ss50Var;
        this.Z = xtb0Var;
        this.N0 = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        s6v s6vVar = new s6v(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, lnmVar);
        s6vVar.b = obj;
        return s6vVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        c9n c9nVar = (c9n) this.b;
        boolean z = this.a;
        ven0 ven0Var = this.e;
        if (!z) {
            hm5.M(obj);
            if (((h7v) ven0Var.getValue()).b()) {
            }
            return rih1.a;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        while (smo1.u(c9nVar)) {
            bs51.d(ven0Var, this.Y, this.Z, this.N0, new ry(this.c, this.d, bs51.e(this.f, this.g, this.h, this.i, this.t, this.X, ven0Var)));
            this.b = c9nVar;
            this.a = true;
            Object objI = hap1.i(16L, this);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }
}

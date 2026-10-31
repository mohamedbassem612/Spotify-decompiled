package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h781 extends a8d1 implements vu30 {
    public final /* synthetic */ g781 X;
    public final /* synthetic */ spq0 Y;
    public final /* synthetic */ boolean Z;
    public boolean a;
    public final /* synthetic */ k781 b;
    public final /* synthetic */ q781 c;
    public final /* synthetic */ lik1 d;
    public final /* synthetic */ vum1 e;
    public final /* synthetic */ l781 f;
    public final /* synthetic */ v1v g;
    public final /* synthetic */ kk3 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ c221 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h781(k781 k781Var, q781 q781Var, lik1 lik1Var, vum1 vum1Var, l781 l781Var, v1v v1vVar, kk3 kk3Var, boolean z, c221 c221Var, g781 g781Var, spq0 spq0Var, boolean z2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = k781Var;
        this.c = q781Var;
        this.d = lik1Var;
        this.e = vum1Var;
        this.f = l781Var;
        this.g = v1vVar;
        this.h = kk3Var;
        this.i = z;
        this.t = c221Var;
        this.X = g781Var;
        this.Y = spq0Var;
        this.Z = z2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new h781(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        who0 who0Var = (who0) this.Y.h();
        this.a = true;
        Object objB = this.b.b(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, who0Var, this.Z, this);
        d9n d9nVar = d9n.a;
        return objB == d9nVar ? d9nVar : objB;
    }
}

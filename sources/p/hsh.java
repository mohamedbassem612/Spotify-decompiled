package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hsh extends a8d1 implements xu30 {
    public final /* synthetic */ boolean N0;
    public final /* synthetic */ boolean O0;
    public final /* synthetic */ boolean P0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ boolean Z;
    public boolean a;
    public /* synthetic */ vr20 b;
    public /* synthetic */ Object[] c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsh(lnm lnmVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(3, lnmVar);
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.t = z7;
        this.X = z8;
        this.Y = z9;
        this.Z = z10;
        this.N0 = z11;
        this.O0 = z12;
        this.P0 = z13;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        hsh hshVar = new hsh((lnm) obj3, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0);
        hshVar.b = (vr20) obj;
        hshVar.c = (Object[]) obj2;
        return hshVar.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        vr20 vr20Var = this.b;
        Object[] objArr = this.c;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            ioj0 ioj0Var = (ioj0) objArr[0];
            Object obj2 = objArr[1];
            zkm zkmVar = obj2 instanceof zkm ? (zkm) obj2 : null;
            hwt hwtVar = (hwt) objArr[2];
            Object obj3 = objArr[3];
            t810 t810Var = new t810(ioj0Var, zkmVar, hwtVar, obj3 instanceof ijo ? (ijo) obj3 : null, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (y2u0) objArr[4], (sq51) objArr[5], this.Z, this.N0, this.O0, this.P0);
            this.b = null;
            this.c = null;
            this.a = true;
            Object objEmit = vr20Var.emit(t810Var, this);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
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

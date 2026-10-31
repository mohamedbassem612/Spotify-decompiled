package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tyg extends hab0 implements xu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyg(long j, boolean z, boolean z2) {
        super(3);
        this.a = z;
        this.b = z2;
        this.c = j;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        if (this.a) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-534314177);
            qim0 qim0VarV = u291.v(anm1.N("collaborators_toggle_loading.subtitle_shimmer", nim0.a), 80.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarH = u291.h(qim0VarV, 12.0f);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            t1c.a(i3p1.E(i1p1.q(qim0VarH, er31.b(8.0f)), this.b, this.c), x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-533982632);
            x340Var3.r(false);
        }
        return rih1.a;
    }
}

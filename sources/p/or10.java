package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class or10 extends hab0 implements xu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or10(boolean z, iu30 iu30Var, String str, boolean z2, long j, boolean z3) {
        super(3);
        this.a = z;
        this.b = iu30Var;
        this.c = str;
        this.d = z2;
        this.e = j;
        this.f = z3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jax haxVar;
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        boolean z = this.a;
        boolean zH = x340Var.h(z);
        iu30 iu30Var = this.b;
        boolean zG = zH | x340Var.g(iu30Var);
        String str = this.c;
        boolean zG2 = zG | x340Var.g(str);
        Object objT = x340Var.T();
        if (zG2 || objT == fkj0.X) {
            objT = new cpv((byte) 1, str, iu30Var, z);
            x340Var.s0(objT);
        }
        gbx gbxVar = new gbx(z50.c, (Function0) objT);
        ldx ldxVar = ldx.c;
        gdx gdxVarS = yla.s(x340Var);
        if (!this.d || z) {
            x340Var.i0(1263974220);
            haxVar = new hax(cwl1.o0(x340Var, 2131958264));
            x340Var.r(false);
        } else {
            x340Var.i0(1263920559);
            x340Var.r(false);
            haxVar = jax.a;
        }
        foo1.c(gbxVar, ldxVar, anm1.N("feedback_actions_thumbs_up_button", nim0.a), haxVar, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1768851108, new nr10(this.e, z, this.f), x340Var), x340Var, 0, 48, 1992);
        return rih1.a;
    }
}

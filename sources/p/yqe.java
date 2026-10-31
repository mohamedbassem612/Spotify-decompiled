package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yqe extends hab0 implements xu30 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ ven0 a;
    public final /* synthetic */ g9m b;
    public final /* synthetic */ lz71 c;
    public final /* synthetic */ nu d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ orm0 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqe(ven0 ven0Var, g9m g9mVar, lz71 lz71Var, nu nuVar, iu30 iu30Var, boolean z, ven0 ven0Var2, boolean z2, orm0 orm0Var, boolean z3, boolean z4, boolean z5, zg61 zg61Var) {
        super(3);
        this.a = ven0Var;
        this.b = g9mVar;
        this.c = lz71Var;
        this.d = nuVar;
        this.e = iu30Var;
        this.f = z;
        this.g = ven0Var2;
        this.h = z2;
        this.i = orm0Var;
        this.t = z3;
        this.X = z4;
        this.Y = z5;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        jre jreVar = (jre) this.a.getValue();
        x340 x340Var = (b0k) obj2;
        if (jreVar == null) {
            x340Var.i0(-1849840550);
            x340Var.r(false);
        } else {
            x340Var.i0(-1849840549);
            boolean z = !this.f;
            ven0 ven0Var = this.g;
            boolean zI = x340Var.i(ven0Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new cy7(ven0Var, (byte) 19);
                x340Var.s0(objT);
            }
            poo1.p(jreVar, this.b, this.c, this.d, this.e, z, (iu30) objT, this.h, this.i, this.t, this.X, this.Y, null, u291.x(0.0f, dsa0.m(x340Var, 2131166901), 1, nim0.a), x340Var, 0, 0);
            x340Var.r(false);
        }
        return rih1.a;
    }
}

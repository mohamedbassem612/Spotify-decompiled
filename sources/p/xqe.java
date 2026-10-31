package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xqe extends hab0 implements xu30 {
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ jre a;
    public final /* synthetic */ g9m b;
    public final /* synthetic */ lz71 c;
    public final /* synthetic */ nu d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ orm0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqe(jre jreVar, g9m g9mVar, lz71 lz71Var, nu nuVar, iu30 iu30Var, ven0 ven0Var, orm0 orm0Var, boolean z, boolean z2, boolean z3, zg61 zg61Var, ven0 ven0Var2) {
        super(3);
        this.a = jreVar;
        this.b = g9mVar;
        this.c = lz71Var;
        this.d = nuVar;
        this.e = iu30Var;
        this.f = ven0Var;
        this.g = orm0Var;
        this.h = z;
        this.i = z2;
        this.t = z3;
        this.X = ven0Var2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jre jreVar;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        ven0 ven0Var = this.X;
        jre jreVar2 = this.a;
        if (jreVar2 == null) {
            jre ireVar = (jre) ven0Var.getValue();
            if (ireVar == null) {
                ireVar = new ire(null);
            }
            jreVar = ireVar;
        } else {
            jreVar = jreVar2;
        }
        x340 x340Var2 = x340Var;
        ven0 ven0Var2 = this.f;
        boolean zI = x340Var2.i(ven0Var2);
        Object objT = x340Var2.T();
        if (zI || objT == fkj0.X) {
            objT = new cy7(ven0Var2, (byte) 18);
            x340Var2.s0(objT);
        }
        iu30 iu30Var = (iu30) objT;
        float fM = dsa0.m(x340Var2, 2131166901);
        nim0 nim0Var = nim0.a;
        qim0 qim0VarX = u291.x(0.0f, fM, 1, nim0Var);
        if (jreVar2 == null) {
            jreVar2 = (jre) ven0Var.getValue();
        }
        if (jreVar2 instanceof gre) {
            qim0VarX = qim0VarX.then(uyn1.z(0.0f, 32.0f, 1, nim0Var));
        }
        poo1.p(jreVar, this.b, this.c, this.d, this.e, false, iu30Var, false, this.g, this.h, this.i, this.t, null, qim0VarX, x340Var2, 12779520, 0);
        return rih1.a;
    }
}

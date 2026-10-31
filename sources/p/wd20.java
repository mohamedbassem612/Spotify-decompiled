package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wd20 extends hab0 implements xu30 {
    public final /* synthetic */ zc20 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ yc20 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd20(zc20 zc20Var, int i, boolean z, boolean z2, iu30 iu30Var, yc20 yc20Var) {
        super(3);
        this.a = zc20Var;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = iu30Var;
        this.f = yc20Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        zc20 zc20Var = this.a;
        String str = zc20Var.d;
        boolean z = zc20Var.e == 2;
        qim0 qim0VarX = lrn1.x(nim0.a, -this.b);
        boolean z2 = this.c;
        float f = z2 ? -48.0f : 0.0f;
        n511 n511Var = ckk1.a;
        qim0 qim0VarI = zr7.i(qim0VarX, new ye6(f, irn1.l0(0.0f, 400.0f, new p3v(0.4f), 1), (byte) 6));
        bby bbyVar = xd20.a;
        qim0 qim0VarN = anm1.N("SecondaryFilter", qim0VarI);
        x340 x340Var2 = x340Var;
        boolean z3 = this.c;
        boolean zH = x340Var2.h(z3);
        iu30 iu30Var = this.e;
        boolean zG = zH | x340Var2.g(iu30Var);
        yc20 yc20Var = this.f;
        boolean zG2 = zG | x340Var2.g(yc20Var) | x340Var2.g(zc20Var);
        Object objT = x340Var2.T();
        if (zG2 || objT == fkj0.X) {
            zg6 zg6Var = new zg6(z2, iu30Var, yc20Var, zc20Var, (byte) 4);
            x340Var2.s0(zg6Var);
            objT = zg6Var;
        }
        g0p1.h(384, str, (Function0) objT, (fe5) null, x340Var2, qim0VarN, (idn0) null, z3, true, this.d, z);
        return rih1.a;
    }
}

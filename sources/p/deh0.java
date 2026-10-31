package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class deh0 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deh0(float f, float f2, float f3, int i) {
        super(3);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        float f = zjy.j(this.a, new p3v(((i2c) obj).d() * 0.74f)).a;
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        zzq0 zzq0VarH = uyn1.h(2, this.b, 0.0f);
        d36 d36Var = new d36(this.c, true, new um5(false));
        x340 x340Var = (b0k) obj2;
        int i = this.d;
        boolean zE = x340Var.e(i) | x340Var.d(f);
        Object objT = x340Var.T();
        if (zE || objT == fkj0.X) {
            objT = new sj6((byte) 2, f, i);
            x340Var.s0(objT);
        }
        ujo1.e(qim0VarF, (xtb0) null, zzq0VarH, d36Var, (pl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, 490);
        return rih1.a;
    }
}

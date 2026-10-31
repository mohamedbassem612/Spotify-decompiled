package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ake1 extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tob1 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ake1(boolean z, boolean z2, tob1 tob1Var, float f, float f2) {
        super(1);
        this.a = z;
        this.b = z2;
        this.c = tob1Var;
        this.d = f;
        this.e = f2;
    }

    public final Object invoke(Object obj) {
        kd31 kd31Var = (kd31) obj;
        boolean z = this.a;
        if (z && this.b) {
            kd31Var.i(1);
        }
        if (z) {
            zje1 zje1Var = (zje1) this.c.getValue();
            float f = zje1Var.a;
            float f2 = zje1Var.b;
            float f3 = this.d;
            kd31Var.C(f * f3);
            kd31Var.E(f3 * f2);
            float f4 = zje1Var.a;
            float f5 = this.e;
            kd31Var.n(f4 * f5);
            kd31Var.l((-f2) * f5);
        }
        kd31Var.e(kd31Var.T0.h() * 12.0f);
        return rih1.a;
    }
}

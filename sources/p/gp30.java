package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gp30 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wat b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gp30(wat watVar, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = watVar;
        this.c = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        tob1 tob1Var = this.c;
        wat watVar = this.b;
        switch (b) {
            case 0:
                Integer num = ((tbb1) tob1Var.getValue()).b;
                float fM0 = num != null ? watVar.M0(num.intValue()) : 0.0f;
                float fM1 = watVar.M0(((tbb1) tob1Var.getValue()).a);
                float f = 0.5f * fM0;
                return new hp30(-fM1, ((float) Math.rint((p3v.b(fM0, 0.0f) > 0 ? 1.0f - yoi1.o(yoi1.t(new p3v(-fM1), new p3v(0.0f), new p3v(f)).a / f, 0.0f, 1.0f) : 1.0f) * ((float) Math.pow(10.0d, 2.0d)))) / ((float) Math.pow(10.0d, 2.0d)));
            default:
                float fU = jch0.U(watVar.M0(((tbb1) tob1Var.getValue()).a));
                Integer num2 = ((tbb1) tob1Var.getValue()).b;
                return new mfo0(fU, num2 != null ? watVar.M0(num2.intValue()) : 0.0f);
        }
    }
}

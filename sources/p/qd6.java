package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qd6 extends hab0 implements iu30 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd6(Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i, float f, Function0 function4, Function0 function5) {
        super(1);
        this.a = function0;
        this.b = function1;
        this.c = function2;
        this.d = function3;
        this.e = i;
        this.f = f;
        this.g = function4;
        this.h = function5;
    }

    public final Object invoke(Object obj) {
        float fG;
        kd31 kd31Var = (kd31) obj;
        float fFloatValue = ((Number) this.a.invoke()).floatValue();
        float fFloatValue2 = ((Number) this.b.invoke()).floatValue();
        boolean zBooleanValue = ((Boolean) this.c.invoke()).booleanValue();
        float f = this.f;
        int i = this.e;
        if (zBooleanValue) {
            fG = ((Number) this.d.invoke()).floatValue();
        } else {
            fG = fd21.g(fFloatValue, 2.5f, td6.f(i), f);
            if (((Boolean) this.g.invoke()).booleanValue()) {
                fG = -fG;
            }
        }
        float fFloatValue3 = zBooleanValue ? ((Number) this.h.invoke()).floatValue() : c13.p(fFloatValue2, 2.5f, td6.g(i), f);
        kd31Var.C(kd31Var.T0.h() * fG);
        kd31Var.E(kd31Var.T0.h() * fFloatValue3);
        return rih1.a;
    }
}

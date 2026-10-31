package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p6f1 extends hab0 implements iu30 {
    public final /* synthetic */ float X;
    public final /* synthetic */ float a;
    public final /* synthetic */ gjn b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ pdn e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6f1(float f, gjn gjnVar, Function0 function0, int i, pdn pdnVar, float f2, boolean z, Function0 function1, Function0 function2, int i2, float f3) {
        super(1);
        this.a = f;
        this.b = gjnVar;
        this.c = function0;
        this.d = i;
        this.e = pdnVar;
        this.f = f2;
        this.g = z;
        this.h = function1;
        this.i = function2;
        this.t = i2;
        this.X = f3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    public final Object invoke(Object obj) {
        float fFloatValue;
        float fH;
        kd31 kd31Var = (kd31) obj;
        pdn pdnVar = this.e;
        tob1 tob1Var = pdnVar.a;
        float fH2 = kd31Var.T0.h() * this.a;
        gjn gjnVar = this.b;
        float f = gjnVar.b;
        float f2 = gjnVar.c;
        float f3 = (f * fH2) / 267.0f;
        float fFloatValue2 = ((Number) this.c.invoke()).floatValue();
        boolean z = this.d > 0;
        if (z) {
            tob1 tob1Var2 = pdnVar.b;
            if (tob1Var2 != null) {
                fFloatValue = ((Number) tob1Var2.getValue()).floatValue();
            } else {
                fFloatValue = 1.0f;
            }
        } else if (Float.isNaN(fFloatValue2)) {
            fFloatValue = 0.0f;
        } else {
            fFloatValue = 1.0f;
        }
        kd31Var.b(fFloatValue);
        if (z) {
            fH = kd31Var.T0.h() * x6f1.e * (1.0f - ((Number) tob1Var.getValue()).floatValue());
        } else if (Float.isNaN(fFloatValue2)) {
            fH = 0.0f;
        } else {
            float fH3 = (kd31Var.T0.h() * this.f) + f3;
            float fFloatValue3 = 1.0f - ((Number) tob1Var.getValue()).floatValue();
            float f4 = (fFloatValue2 + (0.08f * fH2)) - fH3;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            fH = fFloatValue3 * f4;
        }
        boolean z2 = this.g;
        Function0 function0 = this.h;
        if (z2) {
            float fFloatValue4 = ((Number) function0.invoke()).floatValue();
            float fO = yoi1.o(((Number) this.i.invoke()).floatValue() * 3.0f, 0.0f, 3.0f);
            int i = (int) fO;
            if (i > 2) {
                i = 2;
            }
            ilv.a.getClass();
            float fA = flv.d.a(fO - i);
            float[] fArr = smo1.a;
            float fT = dm5.T(fArr[i], fArr[i + 1], fA);
            List list = k6f1.a;
            kd31Var.C((kd31Var.T0.h() * 10.0f * fT) + fFloatValue4);
            kd31Var.E(fH);
            kd31Var.p((fT * 1.0f) + f2 + (fH2 > 0.0f ? (fFloatValue4 / fH2) * 5.0f : 0.0f));
        } else {
            gjn gjnVar2 = (gjn) k6f1.a.get(this.t - 1);
            float fH4 = kd31Var.T0.h() * this.X;
            float fO2 = fH4 > 0.0f ? yoi1.o(Math.abs(((Number) function0.invoke()).floatValue()) / fH4, 0.0f, 1.0f) : 0.0f;
            kd31Var.C((((gjnVar2.a - gjnVar.a) * fO2) / 267.0f) * fH2);
            kd31Var.E(((((gjnVar2.b - gjnVar.b) * fO2) / 267.0f) * fH2) + fH);
            kd31Var.p(((gjnVar2.c - f2) * fO2) + f2);
        }
        return rih1.a;
    }
}

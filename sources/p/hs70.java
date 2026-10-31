package p;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hs70 extends hab0 implements zu30 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ drr0 g;
    public final /* synthetic */ drr0 h;
    public final /* synthetic */ drr0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs70(Function0 function0, Function0 function1, Function0 function2, float f, float f2, float f3, drr0 drr0Var, drr0 drr0Var2, drr0 drr0Var3) {
        super(4);
        this.a = function0;
        this.b = function1;
        this.c = function2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = drr0Var;
        this.h = drr0Var2;
        this.i = drr0Var3;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        long j = ((Offset) obj).a;
        long j2 = ((Offset) obj2).a;
        float fFloatValue = ((Number) obj3).floatValue();
        ((Number) obj4).floatValue();
        drr0 drr0Var = this.g;
        float fO = yoi1.o(drr0Var.s() * fFloatValue, 1.0f, 5.0f);
        if (fO > drr0Var.s()) {
            this.a.invoke();
        } else if (fO < drr0Var.s()) {
            this.b.invoke();
        } else if (!Offset.c(j2, 0L)) {
            this.c.invoke();
        }
        float fS = fO / drr0Var.s();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        drr0 drr0Var2 = this.h;
        float f = 1.0f - fS;
        float fS2 = (fIntBitsToFloat - drr0Var2.s()) * f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        drr0 drr0Var3 = this.i;
        float fS3 = (fIntBitsToFloat2 - drr0Var3.s()) * f;
        float f2 = this.d * fO;
        float f3 = this.e;
        float f4 = f2 - f3;
        float f5 = (this.f * fO) - f3;
        drr0Var.t(fO);
        drr0Var2.t(yoi1.o(Float.intBitsToFloat((int) (j2 >> 32)) + drr0Var2.s() + fS2, Math.min(-f4, f4), 0.0f));
        drr0Var3.t(yoi1.o(Float.intBitsToFloat((int) (j2 & 4294967295L)) + drr0Var3.s() + fS3, Math.min(-f5, f5), 0.0f));
        return rih1.a;
    }
}

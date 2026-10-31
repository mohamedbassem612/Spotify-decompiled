package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class svb1 extends hab0 implements xu30 {
    public final /* synthetic */ zu30 a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ drr0 e;
    public final /* synthetic */ drr0 f;
    public final /* synthetic */ drr0 g;
    public final /* synthetic */ drr0 h;
    public final /* synthetic */ ven0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svb1(zu30 zu30Var, iu30 iu30Var, float f, ven0 ven0Var, drr0 drr0Var, drr0 drr0Var2, drr0 drr0Var3, drr0 drr0Var4, ven0 ven0Var2) {
        super(3);
        this.a = zu30Var;
        this.b = iu30Var;
        this.c = f;
        this.d = ven0Var;
        this.e = drr0Var;
        this.f = drr0Var2;
        this.g = drr0Var3;
        this.h = drr0Var4;
        this.i = ven0Var2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((Offset) obj).a;
        float fFloatValue = ((Number) obj2).floatValue();
        float fFloatValue2 = ((Number) obj3).floatValue();
        ven0 ven0Var = this.d;
        n511 n511Var = (n511) ven0Var.getValue();
        float f = n511Var.c - n511Var.a;
        n511 n511Var2 = (n511) ven0Var.getValue();
        float f2 = n511Var2.d - n511Var2.b;
        drr0 drr0Var = this.f;
        drr0 drr0Var2 = this.e;
        if (f > 0.0f && f2 > 0.0f) {
            drr0Var2.t((Float.intBitsToFloat((int) (j >> 32)) / f) + drr0Var2.s());
            drr0Var.t((Float.intBitsToFloat((int) (j & 4294967295L)) / f2) + drr0Var.s());
        }
        drr0 drr0Var3 = this.g;
        drr0Var3.t(yoi1.o(drr0Var3.s() * fFloatValue, 0.33f, 3.0f));
        drr0 drr0Var4 = this.h;
        drr0Var4.t(drr0Var4.s() + fFloatValue2);
        this.a.J(Float.valueOf(drr0Var2.s()), Float.valueOf(drr0Var.s()), Float.valueOf(drr0Var4.s()), Float.valueOf(drr0Var3.s()));
        this.b.invoke(Boolean.valueOf(r4o1.S(drr0Var2.s(), drr0Var.s(), drr0Var3.s(), (n511) ven0Var.getValue(), (n511) this.i.getValue(), this.c)));
        return rih1.a;
    }
}

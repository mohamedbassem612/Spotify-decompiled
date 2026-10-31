package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b3c extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ drr0 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ tob1 g;
    public final /* synthetic */ ven0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3c(pbq pbqVar, tob1 tob1Var, b8f1 b8f1Var, float f, float f2, tob1 tob1Var2, drr0 drr0Var, hdn0 hdn0Var) {
        super(0);
        this.e = tob1Var;
        this.f = b8f1Var;
        this.b = f;
        this.c = f2;
        this.g = tob1Var2;
        this.d = drr0Var;
        this.h = hdn0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        ven0 ven0Var = this.g;
        switch (b) {
            case 0:
                ven0 ven0Var2 = ven0Var;
                xab1 xab1VarT = fn31.T((c9n) obj2, (o8n) null, 0, new a3c((o95) obj, this.b, this.c, this.d, ven0Var2, this.h, null), 3);
                lee1 lee1Var = g3c.a;
                ven0Var2.setValue(xab1VarT);
                return rih1.a;
            default:
                boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                float fO = 1.0f;
                if (!zBooleanValue) {
                    float fS = this.d.s();
                    int iS = ((hdn0) this.h).s();
                    float fS2 = ((b8f1) obj).c.s() + ((Number) ((tob1) obj2).getValue()).floatValue();
                    float f = this.b;
                    float f2 = this.c;
                    fO = yoi1.o(((((fS2 - iS) - f) - f2) - fS) / ((f / 2.0f) + f2), 0.0f, 1.0f);
                }
                return Float.valueOf(fO);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3c(c9n c9nVar, o95 o95Var, float f, float f2, drr0 drr0Var, ven0 ven0Var, ven0 ven0Var2) {
        super(0);
        this.e = c9nVar;
        this.f = o95Var;
        this.b = f;
        this.c = f2;
        this.d = drr0Var;
        this.g = ven0Var;
        this.h = ven0Var2;
    }
}

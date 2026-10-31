package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v2c extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2c(float f, drr0 drr0Var) {
        super(0);
        this.b = f;
        this.c = drr0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        float f = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                lee1 lee1Var = g3c.a;
                return Integer.valueOf(jch0.U(((drr0) obj).s() / f));
            default:
                es41 es41Var = (es41) obj;
                int iS = es41Var.a.s();
                float fMin = Math.min(f, es41Var.f.s());
                return Float.valueOf(fMin > 0.0f ? yoi1.o(iS / fMin, 0.0f, 1.0f) : 0.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2c(es41 es41Var, float f) {
        super(0);
        this.c = es41Var;
        this.b = f;
    }
}

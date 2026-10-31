package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tf1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf1(xtb0 xtb0Var, float f, byte b) {
        super(0);
        this.a = b;
        this.b = xtb0Var;
        this.c = f;
    }

    public final Object invoke() {
        byte b = this.a;
        xtb0 xtb0Var = this.b;
        float f = this.c;
        switch (b) {
            case 0:
                return Float.valueOf(((err0) xtb0Var.e.b).s() == 0 ? ((err0) xtb0Var.e.c).s() / f : 1.0f);
            case 1:
                return Float.valueOf(((err0) xtb0Var.e.b).s() == 0 ? ((err0) xtb0Var.e.c).s() / f : 1.0f);
            default:
                if (((err0) xtb0Var.e.b).s() <= 0) {
                    float fS = ((err0) xtb0Var.e.c).s();
                    if (fS <= f) {
                        f = fS;
                    }
                }
                return Float.valueOf(f);
        }
    }
}

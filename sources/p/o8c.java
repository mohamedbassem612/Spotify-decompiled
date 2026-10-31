package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o8c extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ hdn0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o8c(xtb0 xtb0Var, int i, hdn0 hdn0Var, byte b) {
        super(0);
        this.a = b;
        this.b = xtb0Var;
        this.c = i;
        this.d = hdn0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        err0 err0Var = this.d;
        int i = this.c;
        xtb0 xtb0Var = this.b;
        switch (b) {
            case 0:
                int iS = ((err0) xtb0Var.e.b).s();
                int iS2 = ((err0) xtb0Var.e.c).s();
                int iS3 = err0Var.s();
                float fO = 0.0f;
                if (iS >= 1) {
                    if (iS > 1) {
                        fO = 1.0f;
                    } else {
                        int i2 = i - iS3;
                        fO = yoi1.o(iS2 / (i2 >= 1 ? i2 : 1), 0.0f, 1.0f);
                    }
                }
                return Float.valueOf(fO);
            default:
                int iS4 = ((err0) xtb0Var.e.b).s();
                int iS5 = ((err0) xtb0Var.e.c).s();
                int iS6 = err0Var.s();
                if (iS4 >= 1 && (iS4 > 1 || (i = i - iS5) < iS6)) {
                    i = iS6;
                }
                return Integer.valueOf(i);
        }
    }
}

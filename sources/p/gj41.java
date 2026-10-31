package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gj41 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj41(float f, ven0 ven0Var) {
        super(0);
        this.b = f;
        this.c = ven0Var;
    }

    public final Object invoke() {
        int i;
        byte b = this.a;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                long j = ((yr80) ven0Var.getValue()).a;
                int i2 = (int) (j >> 32);
                if (i2 <= 0 || (i = (int) (j & 4294967295L)) <= 0) {
                    return null;
                }
                float f = i;
                tw4 tw4VarA = ww4.a();
                float f2 = this.b;
                tw4VarA.e(ila0.e(0.0f, 0.0f, i2, f, f2, f2), 2);
                return tw4VarA;
            default:
                return !u890.j((n511) ven0Var.getValue(), n511.e) ? n511.b((n511) ven0Var.getValue(), 0.0f, ((n511) ven0Var.getValue()).b - this.b, 0.0f, 13) : (n511) ven0Var.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj41(ven0 ven0Var, float f) {
        super(0);
        this.c = ven0Var;
        this.b = f;
    }
}

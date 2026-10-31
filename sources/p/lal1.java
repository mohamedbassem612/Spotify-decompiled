package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lal1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lox0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lal1(lox0 lox0Var, byte b) {
        super(0);
        this.a = b;
        this.b = lox0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        lox0 lox0Var = this.b;
        switch (b) {
            case 0:
                return cwl1.F((q7r0) lox0Var.c);
            case 1:
                return cwl1.B((q7r0) lox0Var.c);
            case 2:
                return cwl1.F((q7r0) lox0Var.c);
            default:
                return cwl1.B((q7r0) lox0Var.c);
        }
    }
}

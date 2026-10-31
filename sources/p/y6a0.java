package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y6a0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ z6a0 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6a0(z6a0 z6a0Var, long j) {
        super(0);
        this.b = z6a0Var;
        this.c = j;
    }

    public final Object invoke() {
        byte b = this.a;
        long j = this.c;
        z6a0 z6a0Var = this.b;
        switch (b) {
            case 0:
                if (j != z6a0Var.X) {
                    return null;
                }
                z6a0Var.t = false;
                return z6a0Var.b(z6a0Var.c());
            default:
                z6a0Var.d(new y6a0(j, z6a0Var));
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6a0(long j, z6a0 z6a0Var) {
        super(0);
        this.c = j;
        this.b = z6a0Var;
    }
}

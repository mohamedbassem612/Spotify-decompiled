package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gjh0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hjh0 b;
    public final /* synthetic */ m210 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gjh0(hjh0 hjh0Var, m210 m210Var, byte b) {
        super(0);
        this.a = b;
        this.b = hjh0Var;
        this.c = m210Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                hjh0 hjh0Var = this.b;
                return hjh0Var.f.c(hjh0Var.c(this.c, true, hjh0Var.X));
            default:
                hjh0 hjh0Var2 = this.b;
                return hjh0Var2.f.b(hjh0Var2.c(this.c, false, hjh0Var2.X));
        }
    }
}

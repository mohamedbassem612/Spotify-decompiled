package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lac0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nac0 b;
    public final /* synthetic */ n6r0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lac0(nac0 nac0Var, n6r0 n6r0Var, byte b) {
        super(0);
        this.a = b;
        this.b = nac0Var;
        this.c = n6r0Var;
    }

    public final Object invoke() {
        Object value;
        Object value2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n6r0 n6r0Var = this.c;
        nac0 nac0Var = this.b;
        switch (b) {
            case 0:
                bpb1 bpb1Var = nac0Var.a.a;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, dm61.u0(n6r0Var, (Set) value)));
                break;
            default:
                bpb1 bpb1Var2 = nac0Var.a.a;
                do {
                    value2 = bpb1Var2.getValue();
                } while (!bpb1Var2.k(value2, dm61.x0(n6r0Var, (Set) value2)));
                break;
        }
        return rih1Var;
    }
}

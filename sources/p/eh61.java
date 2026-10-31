package p;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eh61 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ni61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh61(ni61 ni61Var, byte b) {
        super(0);
        this.a = b;
        this.b = ni61Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke() throws NoWhenBranchMatchedException {
        mi61 mi61Var;
        boolean z;
        switch (this.a) {
            case 0:
                return Collections.singletonList(new fjg(this.b, (byte) 8));
            default:
                ni61 ni61Var = this.b;
                synchronized (ni61Var.b) {
                    mi61Var = ni61Var.c;
                }
                if (mi61Var != null) {
                    ni61 ni61Var2 = this.b;
                    synchronized (ni61Var2.b) {
                        z = mi61Var.c;
                    }
                    if (z) {
                        ni61Var2.a(mi61Var, null, "Session UI host remains contaminated");
                    } else {
                        try {
                            oi61 oi61VarE = mi61Var.b.e();
                            if (!oi61VarE.equals(r5x0.X)) {
                                if (!(oi61VarE instanceof oi61)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ni61Var2.a(mi61Var, null, oi61VarE.a);
                            }
                        } catch (Exception e) {
                            ni61Var2.a(mi61Var, e, "Session UI teardown failed");
                        }
                    }
                }
                return rih1.a;
        }
    }
}

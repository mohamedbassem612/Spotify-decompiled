package p;

import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dl3 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ynb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dl3(ynb0 ynb0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ynb0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ynb0 ynb0Var = this.b;
        switch (b) {
            case 0:
                return (tx4) ynb0Var.get();
            case 1:
                return (ol4) ynb0Var.get();
            case 2:
                return (ivr) ynb0Var.get();
            case 3:
                return Boolean.valueOf(((gu4) ynb0Var.get()).b());
            case 4:
                return Boolean.valueOf(((gu4) ynb0Var.get()).b());
            case 5:
                return (Set) ynb0Var.get();
            case 6:
                return (sdx0) ynb0Var.get();
            default:
                rim1 rim1Var = (rim1) ynb0Var.get();
                xab1 xab1Var = rim1Var.f;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                rim1Var.f = null;
                rim1Var.d.set(false);
                return rih1.a;
        }
    }
}

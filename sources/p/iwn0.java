package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iwn0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kwn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iwn0(kwn0 kwn0Var, byte b) {
        super(0);
        this.a = b;
        this.b = kwn0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        kwn0 kwn0Var = this.b;
        switch (b) {
            case 0:
                return (mwn0) kwn0Var.a.get();
            default:
                return (Set) kwn0Var.b.get();
        }
    }
}

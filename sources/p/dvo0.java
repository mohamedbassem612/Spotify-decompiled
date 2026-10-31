package p;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dvo0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LinkedHashSet b;
    public final /* synthetic */ k5a1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dvo0(LinkedHashSet linkedHashSet, k5a1 k5a1Var, byte b) {
        super(0);
        this.a = b;
        this.b = linkedHashSet;
        this.c = k5a1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        k5a1 k5a1Var = this.c;
        LinkedHashSet linkedHashSet = this.b;
        switch (b) {
            case 0:
                linkedHashSet.add(new guo0(2, k5a1Var.b));
                break;
            default:
                linkedHashSet.add(new fuo0(k5a1Var.q, k5a1Var.b));
                break;
        }
        return rih1Var;
    }
}

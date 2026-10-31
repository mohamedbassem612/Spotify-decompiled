package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gpc extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l811 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gpc(l811 l811Var, byte b) {
        super(0);
        this.a = b;
        this.b = l811Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        l811 l811Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(l811Var.a);
            case 1:
                l811Var.a = true;
                return rih1Var;
            case 2:
                l811Var.a = true;
                return rih1Var;
            case 3:
                return Boolean.valueOf(l811Var.a);
            case 4:
                l811Var.a = true;
                return rih1Var;
            case 5:
                l811Var.a = true;
                return rih1Var;
            case 6:
                return Boolean.valueOf(!l811Var.a);
            default:
                l811Var.a = true;
                return rih1Var;
        }
    }
}

package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u3t0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v3t0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u3t0(v3t0 v3t0Var, byte b) {
        super(0);
        this.a = b;
        this.b = v3t0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        v3t0 v3t0Var = this.b;
        switch (b) {
            case 0:
                return (h4t0) v3t0Var.a.get();
            default:
                h4t0 h4t0Var = (h4t0) v3t0Var.b.getValue();
                r091 r091Var = h4t0Var.c;
                if (r091Var != null) {
                    r091Var.g();
                }
                h4t0Var.c = null;
                return rih1.a;
        }
    }
}

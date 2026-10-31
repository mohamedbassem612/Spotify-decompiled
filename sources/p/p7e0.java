package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p7e0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q6e0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7e0(q6e0 q6e0Var, byte b) {
        super(0);
        this.a = b;
        this.b = q6e0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        q6e0 q6e0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return q6e0Var.serialize();
    }
}

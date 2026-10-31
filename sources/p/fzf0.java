package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fzf0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dzf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fzf0(dzf0 dzf0Var, byte b) {
        super(0);
        this.a = b;
        this.b = dzf0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        dzf0 dzf0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return v8r.q(dzf0Var.a().getValue());
    }
}

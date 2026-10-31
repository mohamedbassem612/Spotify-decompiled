package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wbi0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e9g1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wbi0(e9g1 e9g1Var, byte b) {
        super(0);
        this.a = b;
        this.b = e9g1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        e9g1 e9g1Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return e9g1Var.create();
    }
}

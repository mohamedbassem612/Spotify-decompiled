package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hk81 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x2y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk81(x2y x2yVar, byte b) {
        super(0);
        this.a = b;
        this.b = x2yVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        x2y x2yVar = this.b;
        switch (b) {
            case 0:
                x2yVar.b().accept(q000.a);
                break;
            case 1:
                x2yVar.b().accept(e200.a);
                break;
            default:
                x2yVar.b().accept(e100.a);
                break;
        }
        return rih1Var;
    }
}

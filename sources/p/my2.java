package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class my2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hrr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my2(hrr0 hrr0Var, byte b) {
        super(0);
        this.a = b;
        this.b = hrr0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hrr0 hrr0Var = this.b;
        switch (b) {
            case 0:
                hrr0Var.setValue((Object) null);
                break;
            default:
                hrr0Var.setValue(Boolean.FALSE);
                break;
        }
        return rih1Var;
    }
}

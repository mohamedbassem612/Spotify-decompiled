package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r8k0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t8k0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8k0(t8k0 t8k0Var, byte b) {
        super(0);
        this.a = b;
        this.b = t8k0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        t8k0 t8k0Var = this.b;
        switch (b) {
            case 0:
                c9q c9qVar = t8k0Var.h;
                return new cjk0(c9qVar.a.a.A5, t8k0Var.N0);
            default:
                t8k0Var.Q0.setValue(e8k0.a);
                return rih1.a;
        }
    }
}

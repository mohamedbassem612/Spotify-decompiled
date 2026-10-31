package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vvr0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ shg1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vvr0(shg1 shg1Var, byte b) {
        super(0);
        this.a = b;
        this.b = shg1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        shg1 shg1Var = this.b;
        switch (b) {
            case 0:
                ((i8h1) shg1Var.d.getValue()).m(shg1Var.c.e(), (xj61) null);
                return rih1.a;
            default:
                return (i8h1) shg1Var.a.get();
        }
    }
}

package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pwr0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qwr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pwr0(qwr0 qwr0Var, byte b) {
        super(0);
        this.a = b;
        this.b = qwr0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        qwr0 qwr0Var = this.b;
        switch (b) {
            case 0:
                return (i8h1) qwr0Var.a.get();
            default:
                ((i8h1) qwr0Var.d.getValue()).m(qwr0Var.c.e(), (xj61) null);
                return rih1.a;
        }
    }
}

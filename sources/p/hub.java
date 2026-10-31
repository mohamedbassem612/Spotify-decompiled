package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hub extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o95 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hub(o95 o95Var, byte b) {
        super(0);
        this.a = b;
        this.b = o95Var;
    }

    public final Object invoke() {
        byte b = this.a;
        o95 o95Var = this.b;
        switch (b) {
            case 0:
                return (Float) o95Var.e();
            case 1:
                return (Float) o95Var.e();
            case 2:
                return (Float) o95Var.e();
            default:
                return Boolean.valueOf(((Number) o95Var.e()).floatValue() > 0.0f);
        }
    }
}

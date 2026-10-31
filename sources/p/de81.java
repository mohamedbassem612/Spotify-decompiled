package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class de81 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ee81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ de81(ee81 ee81Var, byte b) {
        super(0);
        this.a = b;
        this.b = ee81Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ee81 ee81Var = this.b;
        switch (b) {
            case 0:
                return ee81Var.e.e();
            default:
                return ycm.a(ee81Var.f);
        }
    }
}

package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fdl1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gdl1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fdl1(gdl1 gdl1Var, byte b) {
        super(0);
        this.a = b;
        this.b = gdl1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        gdl1 gdl1Var = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(gdl1Var.getResources().getDisplayMetrics().density * 1.8f);
            case 1:
                return Integer.valueOf(((int) gdl1Var.getResources().getDisplayMetrics().density) * 3);
            case 2:
                return Float.valueOf(gdl1Var.getResources().getDisplayMetrics().density * 24.0f);
            default:
                return Integer.valueOf((int) (gdl1Var.getResources().getDisplayMetrics().density * 2.0f));
        }
    }
}

package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ugg1 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mhg1 b;

    public /* synthetic */ ugg1(mhg1 mhg1Var, byte b) {
        this.a = b;
        this.b = mhg1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        mhg1 mhg1Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf((u890.j(mhg1Var.d.getValue(), mhg1Var.a.P0()) && mhg1Var.h.s() == Long.MIN_VALUE && !((Boolean) mhg1Var.i.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(mhg1Var.b());
        }
    }
}

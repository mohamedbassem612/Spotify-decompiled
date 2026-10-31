package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mld1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mmd1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mld1(mmd1 mmd1Var, byte b) {
        super(0);
        this.a = b;
        this.b = mmd1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        mmd1 mmd1Var = this.b;
        switch (b) {
            case 0:
                return mmd1Var.a.getString(2131952580);
            case 1:
                return mmd1Var.a.getString(2131952589);
            default:
                return mmd1Var.a.getString(2131952613);
        }
    }
}

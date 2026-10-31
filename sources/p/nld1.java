package p;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nld1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nld1(uw0 uw0Var, byte b) {
        super(0);
        this.a = b;
        this.b = uw0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        uw0 uw0Var = this.b;
        switch (b) {
            case 0:
                return ((Context) uw0Var.d).getString(2131952580);
            default:
                return ((Context) uw0Var.d).getString(2131952613);
        }
    }
}

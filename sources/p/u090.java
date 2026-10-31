package p;

import android.app.Activity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u090 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wp20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u090(wp20 wp20Var, byte b) {
        super(0);
        this.a = b;
        this.b = wp20Var;
    }

    public final Object invoke() {
        byte b = this.a;
        wp20 wp20Var = this.b;
        switch (b) {
            case 0:
                return new cwb((Activity) wp20Var.b);
            default:
                ((cwb) ((idd1) wp20Var.e).getValue()).dismiss();
                return rih1.a;
        }
    }
}

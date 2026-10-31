package p;

import android.util.TypedValue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class adk1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bdk1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ adk1(bdk1 bdk1Var, byte b) {
        super(0);
        this.a = b;
        this.b = bdk1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        bdk1 bdk1Var = this.b;
        switch (b) {
            case 0:
                TypedValue typedValue = new TypedValue();
                bdk1Var.a.getTheme().resolveAttribute(2130970418, typedValue, true);
                return Integer.valueOf(typedValue.data);
            default:
                TypedValue typedValue2 = new TypedValue();
                bdk1Var.a.getTheme().resolveAttribute(2130970440, typedValue2, true);
                return Integer.valueOf(typedValue2.data);
        }
    }
}

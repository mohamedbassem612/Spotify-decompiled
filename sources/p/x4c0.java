package p;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x4c0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o860 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4c0(o860 o860Var, byte b) {
        super(0);
        this.a = b;
        this.b = o860Var;
    }

    public final Object invoke() {
        byte b = this.a;
        o860 o860Var = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(((ConstraintLayout) o860Var.b).getResources().getDimensionPixelSize(2131166206));
            case 1:
                return Integer.valueOf(((ConstraintLayout) o860Var.b).getResources().getDimensionPixelSize(2131166207));
            default:
                return Integer.valueOf(((ConstraintLayout) o860Var.b).getResources().getDimensionPixelSize(2131166205));
        }
    }
}

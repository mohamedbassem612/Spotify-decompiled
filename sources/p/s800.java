package p;

import android.widget.TextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s800 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u800 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s800(u800 u800Var, byte b) {
        super(0);
        this.a = b;
        this.b = u800Var;
    }

    public final Object invoke() {
        byte b = this.a;
        u800 u800Var = this.b;
        switch (b) {
            case 0:
                return b8k1.n(u800Var.b(), 2131429075);
            case 1:
                return b8k1.n(u800Var.b(), 2131428890);
            default:
                return (TextView) b8k1.n(u800Var.b(), 2131431356);
        }
    }
}

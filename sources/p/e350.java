package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e350 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f350 b;

    public /* synthetic */ e350(f350 f350Var, byte b) {
        this.a = b;
        this.b = f350Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        f350 f350Var = this.b;
        switch (b) {
            case 0:
                Function0 function0 = f350Var.W1;
                if (function0 != null) {
                    function0.invoke();
                }
                f350Var.k1();
                f350Var.Z0(false, false);
                break;
            default:
                Function0 function1 = f350Var.X1;
                if (function1 != null) {
                    function1.invoke();
                }
                f350Var.j1();
                f350Var.Z0(false, false);
                break;
        }
    }
}

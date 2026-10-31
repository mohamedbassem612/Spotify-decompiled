package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l350 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m350 b;

    public /* synthetic */ l350(m350 m350Var, byte b) {
        this.a = b;
        this.b = m350Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        m350 m350Var = this.b;
        switch (b) {
            case 0:
                Function0 function0 = m350Var.W1;
                if (function0 != null) {
                    function0.invoke();
                }
                m350Var.k1();
                m350Var.Z0(false, false);
                break;
            default:
                Function0 function1 = m350Var.X1;
                if (function1 != null) {
                    function1.invoke();
                }
                m350Var.j1();
                m350Var.Z0(false, false);
                break;
        }
    }
}

package p;

import android.view.View;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i350 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k350 b;

    public /* synthetic */ i350(k350 k350Var, byte b) {
        this.a = b;
        this.b = k350Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        k350 k350Var = this.b;
        switch (b) {
            case 0:
                Function0 function0 = k350Var.W1;
                if (function0 != null) {
                    function0.invoke();
                }
                Iterator it = k350Var.V1.iterator();
                while (it.hasNext()) {
                    ((uqd0) it.next()).a();
                }
                k350Var.dismiss();
                break;
            default:
                Function0 function1 = k350Var.X1;
                if (function1 != null) {
                    function1.invoke();
                }
                Iterator it2 = k350Var.V1.iterator();
                while (it2.hasNext()) {
                    ((uqd0) it2.next()).b();
                }
                k350Var.dismiss();
                break;
        }
    }
}

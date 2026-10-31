package p;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aus implements bhd1 {
    public final /* synthetic */ nxr a;
    public final /* synthetic */ mxr b;
    public final /* synthetic */ int c;
    public final /* synthetic */ qwc1 d;
    public final /* synthetic */ ArrayList e;

    public aus(nxr nxrVar, mxr mxrVar, int i, qwc1 qwc1Var, ArrayList arrayList) {
        this.a = nxrVar;
        this.b = mxrVar;
        this.c = i;
        this.d = qwc1Var;
        this.e = arrayList;
    }

    public final void a(dhd1 dhd1Var) {
        this.a.invoke();
        TextView textViewN = xzo1.n(dhd1Var);
        if (textViewN != null) {
            textViewN.setTextAppearance(2132018004);
        }
        int i = dhd1Var.b;
        mxr mxrVar = this.b;
        View view = (View) mxrVar.b;
        if (view != null) {
            view.setVisibility(i == this.c ? 0 : 8);
        }
        mxrVar.c = Integer.valueOf(dhd1Var.b);
        int i2 = dhd1Var.b;
        this.d.invoke(new kod1(i2, ((ito) this.e.get(i2)).b));
    }

    public final void b(dhd1 dhd1Var) {
        xzo1.x(dhd1Var);
    }

    public final void c(dhd1 dhd1Var) {
    }
}

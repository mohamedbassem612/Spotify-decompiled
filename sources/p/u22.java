package p;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u22 extends kj30 {
    public final oj80 d;
    public final j22 e;
    public final String f;
    public final idd1 g;

    public u22(oj80 oj80Var, j22 j22Var, Bundle bundle, String str) {
        super(((FrameLayout) oj80Var.c).getId(), bundle);
        this.d = oj80Var;
        this.e = j22Var;
        this.f = str;
        this.g = new idd1(new g3(this, (byte) 24));
        ScrollView scrollView = (ScrollView) oj80Var.b;
        yo31 yo31Var = new yo31(this, (byte) 9);
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(scrollView, yo31Var);
    }

    @Override // p.kj30
    public final void d(yf30 yf30Var) {
        th30 th30VarB = b();
        if (th30VarB == null) {
            hhg1.n("Required value was null.");
            return;
        }
        int id = ((FrameLayout) this.d.c).getId();
        l12 l12Var = new l12(3, 2, null, "tax", this.f);
        this.e.getClass();
        j22.a(th30VarB, id, l12Var, yf30Var);
    }

    public final Object getView() {
        return (ViewGroup) this.g.getValue();
    }
}

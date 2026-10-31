package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j931 implements u601 {
    public final ViewGroup a;
    public final bpb1 b;

    public j931(ViewGroup viewGroup, u601 u601Var) {
        this.a = viewGroup;
        this.b = gio1.b(u601Var);
    }

    public final mr20 a() {
        return hu20.e(this.b, new i64(3, (lnm) null, (byte) 28));
    }

    public final Object b(vu30 vu30Var, lnm lnmVar) {
        Object objCollect = a().collect(new t940(vu30Var, (byte) 2), lnmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }

    public final Object getValue() {
        q6x q6xVar = (op80) ((u601) this.b.getValue()).getValue();
        if (q6xVar == q6x.b) {
            Object parent = this.a.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                ien0 ien0Var = xhk1.a;
                return xhk1.a(view);
            }
        }
        return q6xVar;
    }
}

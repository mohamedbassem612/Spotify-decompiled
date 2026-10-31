package p;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sic0 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int iO;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((w611) this.k.get(i2)).a;
            g611 g611Var = (g611) view3.getLayoutParams();
            if (view3 != view && !g611Var.a.v() && (iO = (g611Var.a.o() - this.d) * this.e) >= 0 && iO < i) {
                view2 = view3;
                if (iO == 0) {
                    break;
                } else {
                    i = iO;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((g611) view2.getLayoutParams()).a.o();
        }
    }

    public final View b(n611 n611Var) {
        List list = this.k;
        if (list == null) {
            View viewD = n611Var.d(this.d);
            this.d += this.e;
            return viewD;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((w611) this.k.get(i)).a;
            g611 g611Var = (g611) view.getLayoutParams();
            if (!g611Var.a.v() && this.d == g611Var.a.o()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}

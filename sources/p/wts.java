package p;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wts extends udk1 {
    public final /* synthetic */ qwc1 a;
    public final /* synthetic */ mxr b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ ArrayList e;

    public wts(qwc1 qwc1Var, mxr mxrVar, ArrayList arrayList, ViewGroup viewGroup, ArrayList arrayList2) {
        this.a = qwc1Var;
        this.b = mxrVar;
        this.c = arrayList;
        this.d = viewGroup;
        this.e = arrayList2;
    }

    public final void a(int i) {
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 3 : 4;
            } else {
                i2 = 2;
            }
        }
        this.a.invoke(new jod1(i2));
    }

    public final void c(int i) {
        g23 g23Var = (g23) this.b.d;
        if (g23Var != null) {
            g23Var.r((ito) this.c.get(i), this.d);
        }
        int i2 = 0;
        for (Object obj : this.e) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            ((ubd1) obj).m(i2 == i);
            i2 = i3;
        }
    }
}

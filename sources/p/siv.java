package p;

import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class siv extends udk1 {
    public final /* synthetic */ qwc1 a;
    public final /* synthetic */ l811 b;
    public final /* synthetic */ lvc1 c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ViewGroup e;
    public final /* synthetic */ fai0 f;
    public final /* synthetic */ teb g;

    public siv(qwc1 qwc1Var, l811 l811Var, lvc1 lvc1Var, ArrayList arrayList, ViewGroup viewGroup, fai0 fai0Var, teb tebVar) {
        this.a = qwc1Var;
        this.b = l811Var;
        this.c = lvc1Var;
        this.d = arrayList;
        this.e = viewGroup;
        this.f = fai0Var;
        this.g = tebVar;
    }

    public final void a(int i) {
        int i2;
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                i2 = i != 2 ? 3 : 4;
            }
        } else {
            i2 = 1;
        }
        this.a.invoke(new jod1(i2));
        l811 l811Var = this.b;
        if (i == 0) {
            tl7.f((tl7) this.d.get(((ViewPager2) this.c.d).getCurrentItem()), 0, (Float) null, this.e.getResources().getDisplayMetrics().density, 4);
            l811Var.a = false;
        } else {
            if (i != 1) {
                return;
            }
            l811Var.a = true;
        }
    }

    public final void c(int i) {
        List list = (List) this.f.e();
        ito itoVar = list != null ? (ito) o7h.t0(i, list) : null;
        if (itoVar != null) {
            boolean z = this.b.a;
            teb tebVar = this.g;
            if (z) {
                tebVar.f = itoVar.b;
                tebVar.g = null;
            }
            g23 g23Var = (g23) tebVar.h;
            if (g23Var != null) {
                g23Var.r(itoVar, this.e);
            }
            int i2 = 0;
            for (Object obj : this.d) {
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
}

package p;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gj51 extends z511 implements b711 {
    public int e;
    public final ArrayList d = new ArrayList();
    public final SparseArray f = new SparseArray();

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(bml bmlVar, int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        dj51 dj51Var = new dj51(this, bmlVar);
        dj51Var.c = this.e;
        dj51Var.b = size;
        dj51Var.d = i;
        arrayList.add(dj51Var);
        int i2 = this.e + 1;
        this.e = i2;
        k(i2, 1);
    }

    public final dj51 B(int i) {
        ArrayList arrayList = this.d;
        int i2 = 0;
        Object obj = arrayList.get(0);
        while (true) {
            dj51 dj51Var = (dj51) obj;
            int i3 = dj51Var.c;
            dj51Var.a.getClass();
            if (i < i3 + 1 && dj51Var.e) {
                return dj51Var;
            }
            i2++;
            obj = arrayList.get(i2);
        }
    }

    public final void C() {
        int i = 0;
        for (dj51 dj51Var : this.d) {
            if (dj51Var.e) {
                dj51Var.c = i;
                dj51Var.a.getClass();
                i++;
            }
        }
        this.e = i;
    }

    public final void D(boolean z, int... iArr) {
        dj51 dj51Var;
        int length = iArr.length;
        boolean z2 = false;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            n57.h("Its not allowed to do actions using the SECTION_ID_NONE id", i2 != Integer.MIN_VALUE);
            Iterator it = this.d.iterator();
            do {
                if (!it.hasNext()) {
                    dj51Var = null;
                    break;
                }
                dj51Var = (dj51) it.next();
            } while (dj51Var.d != i2);
            if (dj51Var != null && dj51Var.e != z) {
                dj51Var.e = z;
                z2 = true;
            }
        }
        if (z2) {
            C();
            h();
        }
    }

    public final void E(int i, int i2) {
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                this.e += i2;
                return;
            }
            if (((dj51) arrayList.get(i)).e) {
                ((dj51) arrayList.get(i)).c += i2;
            }
            i++;
        }
    }

    public final void F(int i) {
        dj51 dj51Var;
        n57.h("Its not allowed to do actions using the SECTION_ID_NONE id", i != Integer.MIN_VALUE);
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                dj51Var = null;
                break;
            }
            dj51Var = (dj51) it.next();
        } while (dj51Var.d != i);
        if (dj51Var == null) {
            return;
        }
        boolean z = dj51Var.e;
        dj51Var.a.getClass();
        dj51Var.e = true;
        if (!z) {
            C();
            h();
        }
    }

    public final int a(int i) {
        dj51 dj51VarB = B(i);
        int i2 = i - dj51VarB.c;
        b711 b711Var = dj51VarB.a;
        b711Var.getClass();
        int i3 = i2 == 0 ? 1 : 0;
        return ((b711Var instanceof b711) && i3 == 0) ? b711Var.a(i2) : i3 ^ 1;
    }

    public final int e() {
        return this.e;
    }

    public final long f(int i) {
        dj51 dj51VarB = B(i);
        return ((long) dj51VarB.hashCode()) ^ dj51VarB.a.f(i - dj51VarB.c);
    }

    public final int g(int i) {
        dj51 dj51VarB = B(i);
        int iHashCode = ((View) dj51VarB.a.g).hashCode();
        this.f.put(iHashCode, new ej51(dj51VarB.b, iHashCode));
        return iHashCode;
    }

    public final void m(RecyclerView recyclerView) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((dj51) it.next()).a.getClass();
        }
    }

    public final void n(int i, w611 w611Var) {
        ((fj51) w611Var).U0.a.setEnabled(B(i).a.e);
    }

    public final void o(w611 w611Var, int i, List list) {
        dj51 dj51VarB = B(i);
        dj51VarB.a.n(i - dj51VarB.c, ((fj51) w611Var).U0);
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        ej51 ej51Var = (ej51) this.f.get(i);
        return new fj51(((dj51) this.d.get(ej51Var.a)).a.c(ej51Var.b, viewGroup));
    }

    public final void r(RecyclerView recyclerView) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((dj51) it.next()).a.getClass();
        }
    }

    public final void t(w611 w611Var) {
        ((dj51) this.d.get(((ej51) this.f.get(((w611) ((fj51) w611Var)).f)).a)).a.getClass();
    }

    public final void u(w611 w611Var) {
        ((dj51) this.d.get(((ej51) this.f.get(((w611) ((fj51) w611Var)).f)).a)).a.getClass();
    }

    public final void v(w611 w611Var) {
        ((dj51) this.d.get(((ej51) this.f.get(((w611) ((fj51) w611Var)).f)).a)).a.getClass();
    }

    public final void w(b611 b611Var) {
        boolean z;
        if (!((z511) this).a.a()) {
            Iterator it = this.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (!((z511) ((dj51) it.next()).a).b) {
                    z = false;
                    break;
                }
            }
            x(z);
        }
        super.w(b611Var);
    }
}

package p;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vb91 {
    public static final m g = new m(27);
    public static final m h = new m(28);
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;

    public vb91(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.a = new ArrayList();
        this.b = os00.INVALID_ID;
        this.c = os00.INVALID_ID;
        this.d = 0;
        this.e = i;
    }

    public void a(float f, int i) {
        ub91 ub91Var;
        ub91[] ub91VarArr = (ub91[]) this.f;
        int i2 = this.b;
        ArrayList arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, g);
            this.b = 1;
        }
        int i3 = this.e;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.e = i4;
            ub91Var = ub91VarArr[i4];
        } else {
            ub91Var = new ub91();
        }
        int i5 = this.c;
        this.c = i5 + 1;
        ub91Var.a = i5;
        ub91Var.b = i;
        ub91Var.c = f;
        arrayList.add(ub91Var);
        this.d += i;
        while (true) {
            int i6 = this.d;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            ub91 ub91Var2 = (ub91) arrayList.get(0);
            int i8 = ub91Var2.b;
            if (i8 <= i7) {
                this.d -= i8;
                arrayList.remove(0);
                int i9 = this.e;
                if (i9 < 5) {
                    this.e = i9 + 1;
                    ub91VarArr[i9] = ub91Var2;
                }
            } else {
                ub91Var2.b = i8 - i7;
                this.d -= i7;
            }
        }
    }

    public void b() {
        View view = (View) l1d.i(1, this.a);
        jab1 jab1Var = (jab1) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.f).S0.d(view);
        jab1Var.getClass();
    }

    public void c() {
        this.a.clear();
        this.b = os00.INVALID_ID;
        this.c = os00.INVALID_ID;
        this.d = 0;
    }

    public int d() {
        boolean z = ((StaggeredGridLayoutManager) this.f).X0;
        ArrayList arrayList = this.a;
        return z ? f(arrayList.size() - 1, -1, false, true) : f(0, arrayList.size(), false, true);
    }

    public int e() {
        boolean z = ((StaggeredGridLayoutManager) this.f).X0;
        ArrayList arrayList = this.a;
        return z ? f(0, arrayList.size(), false, true) : f(arrayList.size() - 1, -1, false, true);
    }

    public int f(int i, int i2, boolean z, boolean z2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        int iM = staggeredGridLayoutManager.S0.m();
        int i3 = staggeredGridLayoutManager.S0.i();
        int i4 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.a.get(i);
            int iG = staggeredGridLayoutManager.S0.g(view);
            int iD = staggeredGridLayoutManager.S0.d(view);
            boolean z3 = false;
            boolean z4 = !z2 ? iG >= i3 : iG > i3;
            if (!z2 ? iD > iM : iD >= iM) {
                z3 = true;
            }
            if (z4 && z3) {
                if (z) {
                    return a.V(view);
                }
                if (iG < iM || iD > i3) {
                    return a.V(view);
                }
            }
            i += i4;
        }
        return -1;
    }

    public int g(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        b();
        return this.c;
    }

    public View h(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        View view = null;
        ArrayList arrayList = this.a;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.X0 && a.V(view2) >= i) || ((!staggeredGridLayoutManager.X0 && a.V(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.X0 && a.V(view3) <= i) || ((!staggeredGridLayoutManager.X0 && a.V(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public float i() {
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i != 0) {
            Collections.sort(arrayList, h);
            this.b = 0;
        }
        float f = 0.5f * this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ub91 ub91Var = (ub91) arrayList.get(i3);
            i2 += ub91Var.b;
            if (i2 >= f) {
                return ub91Var.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((ub91) l1d.i(1, arrayList)).c;
    }

    public int j(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        jab1 jab1Var = (jab1) view.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.f).S0.g(view);
        jab1Var.getClass();
        return this.b;
    }

    public vb91() {
        this.f = new ub91[5];
        this.a = new ArrayList();
        this.b = -1;
    }
}

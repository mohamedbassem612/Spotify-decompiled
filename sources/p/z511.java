package p;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class z511 {
    public final a611 a = new a611();
    public boolean b = false;
    public int c = 1;

    public final void b(int i, w611 w611Var) {
        z511 z511Var = w611Var.S0;
        View view = w611Var.a;
        boolean z = z511Var == null;
        if (z) {
            w611Var.c = i;
            if (this.b) {
                w611Var.e = f(i);
            }
            w611Var.t = (w611Var.t & (-520)) | 1;
            int i2 = pif1.a;
            Trace.beginSection("RV OnBindView");
        }
        w611Var.S0 = this;
        if (RecyclerView.b2) {
            if (view.getParent() == null) {
                WeakHashMap weakHashMap = b8k1.a;
                if (view.isAttachedToWindow() != w611Var.x()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + w611Var.x() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + w611Var);
                }
            }
            if (view.getParent() == null) {
                WeakHashMap weakHashMap2 = b8k1.a;
                if (view.isAttachedToWindow()) {
                    bhn0.A(w611Var, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                    return;
                }
            }
        }
        o(w611Var, i, w611Var.p());
        if (z) {
            ArrayList arrayList = w611Var.X;
            if (arrayList != null) {
                arrayList.clear();
            }
            w611Var.t &= -1025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof g611) {
                ((g611) layoutParams).c = true;
            }
            int i3 = pif1.a;
            Trace.endSection();
        }
    }

    public final w611 c(int i, ViewGroup viewGroup) {
        try {
            int i2 = pif1.a;
            Trace.beginSection("RV CreateView");
            w611 w611VarP = p(i, viewGroup);
            if (w611VarP.a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            w611VarP.f = i;
            Trace.endSection();
            return w611VarP;
        } catch (Throwable th) {
            int i3 = pif1.a;
            Trace.endSection();
            throw th;
        }
    }

    public int d(z511 z511Var, w611 w611Var, int i) {
        if (z511Var == this) {
            return i;
        }
        return -1;
    }

    public int e() {
        return ix1.h.size();
    }

    public long f(int i) {
        return -1L;
    }

    public int g(int i) {
        return 0;
    }

    public final void h() {
        this.a.b();
    }

    public final void i(int i) {
        this.a.d(i, 1, null);
    }

    public final void j(int i, int i2) {
        this.a.c(i, i2);
    }

    public final void k(int i, int i2) {
        this.a.e(i, i2);
    }

    public final void l(int i, int i2) {
        this.a.f(i, i2);
    }

    public /* bridge */ /* synthetic */ void n(int i, w611 w611Var) {
    }

    public void o(w611 w611Var, int i, List list) {
        n(i, w611Var);
    }

    public w611 p(int i, ViewGroup viewGroup) {
        Space space = new Space(viewGroup.getContext());
        space.setLayoutParams(new ViewGroup.LayoutParams(0, 1));
        return new o04(space);
    }

    public boolean s(w611 w611Var) {
        return false;
    }

    public void w(b611 b611Var) {
        this.a.registerObserver(b611Var);
    }

    public final void x(boolean z) {
        if (this.a.a()) {
            eg.m("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            this.b = z;
        }
    }

    public final void y(int i) {
        this.c = i;
        this.a.g();
    }

    public void z(b611 b611Var) {
        this.a.unregisterObserver(b611Var);
    }

    public void m(RecyclerView recyclerView) {
    }

    public void r(RecyclerView recyclerView) {
    }

    public void t(w611 w611Var) {
    }

    public void u(w611 w611Var) {
    }

    public void v(w611 w611Var) {
    }
}

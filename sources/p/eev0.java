package p;

import android.os.Looper;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class eev0 extends b611 {
    public List a;
    public hev0 b;
    public final /* synthetic */ emc0 c;
    public final /* synthetic */ fev0 d;

    public eev0(emc0 emc0Var, fev0 fev0Var) {
        this.c = emc0Var;
        this.d = fev0Var;
        List list = emc0Var.d.f;
        this.a = list;
        this.b = cev0.H(x9p1.n(list));
    }

    public final void a() {
        h();
    }

    public final void c(int i, int i2, Object obj) {
        h();
    }

    public final void d(int i, int i2) {
        h();
    }

    public final void e(int i, int i2) {
        h();
    }

    public final void f(int i, int i2) {
        h();
    }

    public final void h() {
        e611 itemAnimator;
        List list = this.c.d.f;
        if (list == this.a) {
            return;
        }
        this.a = list;
        hev0 hev0VarH = cev0.H(x9p1.n(list));
        kn90 kn90Var = this.d.b;
        hev0 hev0Var = this.b;
        RecyclerView recyclerView = kn90Var.a;
        if (!u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            eg.m("Check failed.");
            return;
        }
        if (!hev0Var.equals(hev0VarH) && !((Boolean) dev0.a.invoke(hev0Var, hev0VarH)).booleanValue() && recyclerView.V0 && kn90Var.b == null && (itemAnimator = recyclerView.getItemAnimator()) != null) {
            kn90Var.b = itemAnimator;
            recyclerView.setItemAnimator((e611) null);
            ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(kn90Var);
            kn90Var.c = viewTreeObserver;
            recyclerView.addOnAttachStateChangeListener(kn90Var);
        }
        this.b = hev0VarH;
    }
}

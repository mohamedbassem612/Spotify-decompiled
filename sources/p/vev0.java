package p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vev0 implements View.OnAttachStateChangeListener, h611, o5s {
    public final View a;
    public final iac0 b;
    public RecyclerView c;
    public final LinkedHashMap d = new LinkedHashMap();

    public vev0(View view, iac0 iac0Var) {
        this.a = view;
        this.b = iac0Var;
        view.addOnAttachStateChangeListener(this);
        iac0Var.getLifecycle().a(this);
        if (view.isAttachedToWindow()) {
            b();
        }
    }

    public final void a(View view) {
        fev0 fev0Var;
        RecyclerView recyclerViewFindViewById = view.findViewById(2131428355);
        if (recyclerViewFindViewById == null || (fev0Var = (fev0) this.d.remove(recyclerViewFindViewById)) == null) {
            return;
        }
        fev0Var.e();
        fev0Var.a.removeOnAttachStateChangeListener(fev0Var);
    }

    public final void b() {
        ViewPager2 viewPager2FindViewById;
        if (this.c == null && (viewPager2FindViewById = this.a.findViewById(2131428388)) != null) {
            RecyclerView childAt = viewPager2FindViewById.getChildAt(0);
            childAt.k(this);
            int childCount = childAt.getChildCount();
            for (int i = 0; i < childCount; i++) {
                c(childAt.getChildAt(i));
            }
            this.c = childAt;
        }
    }

    public final void c(View view) {
        RecyclerView recyclerViewFindViewById = view.findViewById(2131428355);
        if (recyclerViewFindViewById != null) {
            LinkedHashMap linkedHashMap = this.d;
            Object fev0Var = linkedHashMap.get(recyclerViewFindViewById);
            if (fev0Var == null) {
                fev0Var = new fev0(recyclerViewFindViewById);
                linkedHashMap.put(recyclerViewFindViewById, fev0Var);
            }
        }
    }

    public final void d() {
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.o0(this);
        }
        this.c = null;
        LinkedHashMap linkedHashMap = this.d;
        for (fev0 fev0Var : linkedHashMap.values()) {
            fev0Var.e();
            fev0Var.a.removeOnAttachStateChangeListener(fev0Var);
        }
        linkedHashMap.clear();
    }

    public final void onDestroy(iac0 iac0Var) {
        d();
        this.a.removeOnAttachStateChangeListener(this);
        this.b.getLifecycle().d(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        d();
    }
}

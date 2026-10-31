package p;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h5t0 implements isw, o5s {
    public final isw a;
    public final iu30 b;
    public final iu30 c;
    public Rect d;
    public Rect e;
    public int f;
    public boolean g;

    public h5t0(isw iswVar, iu30 iu30Var, iu30 iu30Var2) {
        this.a = iswVar;
        this.b = iu30Var;
        this.c = iu30Var2;
        View view = iswVar.getView();
        rwq0.s(view, new ukm0(this, view, (byte) 23));
        view.addOnAttachStateChangeListener(new c9s(this, new g5t0(this), (byte) 7));
    }

    public static RecyclerView b(View view) {
        RecyclerView parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            RecyclerView recyclerView = view2 instanceof RecyclerView ? (RecyclerView) view2 : null;
            androidx.recyclerview.widget.a layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null && linearLayoutManager.Q0 == 1) {
                return (RecyclerView) view2;
            }
        }
        if (view2 != null) {
            return b(view2);
        }
        return null;
    }

    public static boolean c(Rect rect, Rect rect2) {
        if (rect2 == null || rect == null) {
            return false;
        }
        Rect rect3 = new Rect(rect);
        return rect3.intersect(rect2) && rect3.height() > 0;
    }

    public final void a(Object obj, ysw yswVar) {
        this.a.a(obj, yswVar);
    }

    public final View getView() {
        return this.a.getView();
    }

    public final void onPause(iac0 iac0Var) {
        Object objInvoke;
        if (!this.g || (objInvoke = this.b.invoke(Boolean.FALSE)) == null) {
            return;
        }
        this.c.invoke(objInvoke);
    }

    public final void onResume(iac0 iac0Var) {
        Object objInvoke;
        boolean zC = c(this.e, this.d);
        if (!this.g || (objInvoke = this.b.invoke(Boolean.valueOf(zC))) == null) {
            return;
        }
        this.c.invoke(objInvoke);
    }
}

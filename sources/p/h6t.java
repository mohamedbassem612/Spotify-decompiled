package p;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h6t {
    public boolean a;
    public final ArrayList b = new ArrayList();
    public final y22 c = new y22(this, (byte) 9);
    public View d;

    public final void a(View view) {
        if (u890.j(this.d, view)) {
            return;
        }
        View view2 = this.d;
        y22 y22Var = this.c;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(y22Var);
        }
        boolean z = this.a;
        ArrayList<View.OnAttachStateChangeListener> arrayList = this.b;
        if (z) {
            for (View.OnAttachStateChangeListener onAttachStateChangeListener : arrayList) {
                View view3 = this.d;
                view3.getClass();
                onAttachStateChangeListener.onViewDetachedFromWindow(view3);
            }
            this.a = false;
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(y22Var);
            if (view.isAttachedToWindow()) {
                this.a = true;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((View.OnAttachStateChangeListener) it.next()).onViewAttachedToWindow(view);
                }
            }
        }
        this.d = view;
    }
}

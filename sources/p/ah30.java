package p;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ah30 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public ah30(View view, View view2) {
        this.b = view;
        this.c = view2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                si30 si30Var = (si30) obj2;
                zf30 zf30Var = si30Var.c;
                si30Var.k();
                sgc1.A((ViewGroup) zf30Var.j1.getParent(), ((bh30) obj).a).i();
                break;
            default:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = b8k1.a;
                ((View) obj).requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
    }

    public ah30(bh30 bh30Var, si30 si30Var) {
        this.c = bh30Var;
        this.b = si30Var;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}

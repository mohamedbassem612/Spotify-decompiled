package p;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ri30 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ ri30(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                View view2 = this.b;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = b8k1.a;
                view2.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((o6) this.b).l();
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}

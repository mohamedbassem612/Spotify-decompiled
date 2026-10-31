package p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yxg0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ViewParent parent = view.getParent();
                while (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.setClipChildren(false);
                    parent = viewGroup.getParent();
                }
                break;
            case 1:
                for (ComposeView parent2 = view.getParent(); parent2 instanceof View; parent2 = ((View) parent2).getParent()) {
                    if (parent2 instanceof ComposeView) {
                        parent2.setOnHoverListener(ubz0.b);
                    }
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = b8k1.a;
                view.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}

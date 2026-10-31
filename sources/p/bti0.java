package p;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bti0 extends FrameLayout implements kzg {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public bti0(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // p.kzg
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // p.kzg
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}

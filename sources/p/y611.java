package p;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class y611 extends rf {
    public final RecyclerView a;
    public final x611 b;

    public y611(RecyclerView recyclerView) {
        this.a = recyclerView;
        x611 x611VarA = a();
        if (x611VarA != null) {
            this.b = x611VarA;
        } else {
            this.b = new x611(this);
        }
    }

    public rf a() {
        return this.b;
    }

    @Override // p.rf
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.a.X()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().j0(accessibilityEvent);
        }
    }

    @Override // p.rf
    public void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        super.onInitializeAccessibilityNodeInfo(view, kgVar);
        RecyclerView recyclerView = this.a;
        if (recyclerView.X() || recyclerView.getLayoutManager() == null) {
            return;
        }
        a layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.k0(recyclerView2.c, recyclerView2.H1, kgVar);
    }

    @Override // p.rf
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.a;
        if (recyclerView.X() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        a layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        return layoutManager.z0(recyclerView2.c, recyclerView2.H1, i, bundle);
    }
}

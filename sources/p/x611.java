package p;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class x611 extends rf {
    public final y611 a;
    public final WeakHashMap b = new WeakHashMap();

    public x611(y611 y611Var) {
        this.a = y611Var;
    }

    public final rf a(View view) {
        return (rf) this.b.remove(view);
    }

    public final void b(View view) {
        rf rfVar;
        qf qfVarE = b8k1.e(view);
        if (qfVarE == null) {
            rfVar = null;
        } else {
            rfVar = qfVarE instanceof qf ? qfVarE.a : new rf(qfVarE);
        }
        if (rfVar == null || rfVar == this) {
            return;
        }
        this.b.put(view, rfVar);
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        rf rfVar = (rf) this.b.get(view);
        return rfVar != null ? rfVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final ng getAccessibilityNodeProvider(View view) {
        rf rfVar = (rf) this.b.get(view);
        return rfVar != null ? rfVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        rf rfVar = (rf) this.b.get(view);
        if (rfVar != null) {
            rfVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        y611 y611Var = this.a;
        RecyclerView recyclerView = y611Var.a;
        RecyclerView recyclerView2 = y611Var.a;
        if (recyclerView.X() || recyclerView2.getLayoutManager() == null) {
            super.onInitializeAccessibilityNodeInfo(view, kgVar);
            return;
        }
        recyclerView2.getLayoutManager().l0(view, kgVar);
        rf rfVar = (rf) this.b.get(view);
        if (rfVar != null) {
            rfVar.onInitializeAccessibilityNodeInfo(view, kgVar);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, kgVar);
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        rf rfVar = (rf) this.b.get(view);
        if (rfVar != null) {
            rfVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        rf rfVar = (rf) this.b.get(viewGroup);
        return rfVar != null ? rfVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        y611 y611Var = this.a;
        RecyclerView recyclerView = y611Var.a;
        RecyclerView recyclerView2 = y611Var.a;
        if (recyclerView.X() || recyclerView2.getLayoutManager() == null) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        rf rfVar = (rf) this.b.get(view);
        if (rfVar != null) {
            if (rfVar.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
        } else if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        n611 n611Var = recyclerView2.getLayoutManager().b.c;
        return false;
    }

    public final void sendAccessibilityEvent(View view, int i) {
        rf rfVar = (rf) this.b.get(view);
        if (rfVar != null) {
            rfVar.sendAccessibilityEvent(view, i);
        } else {
            super.sendAccessibilityEvent(view, i);
        }
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        rf rfVar = (rf) this.b.get(view);
        if (rfVar != null) {
            rfVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}

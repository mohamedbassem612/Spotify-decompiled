package p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jqc0 extends y611 {
    public final void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        super.onInitializeAccessibilityNodeInfo(view, kgVar);
        if (view instanceof RecyclerView) {
            z511 adapter = ((RecyclerView) view).getAdapter();
            kgVar.m(x5j1.h(adapter != null ? adapter.e() : 0, 1, 0, false));
        }
    }
}

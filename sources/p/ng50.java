package p;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.spotify.allboarding.allboardingimpl.utils.GridRecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ng50 extends y611 {
    public final /* synthetic */ GridRecyclerView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng50(GridRecyclerView gridRecyclerView) {
        super(gridRecyclerView);
        this.c = gridRecyclerView;
    }

    public final rf a() {
        return new mg50(this, this.c);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        super.onInitializeAccessibilityNodeInfo(view, kgVar);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = kgVar.a.getCollectionInfo();
        x5j1 x5j1Var = collectionInfo != null ? new x5j1(collectionInfo, (byte) 1) : null;
        if (x5j1Var != null) {
            AccessibilityNodeInfo.CollectionInfo collectionInfo2 = (AccessibilityNodeInfo.CollectionInfo) x5j1Var.b;
            int rowCount = collectionInfo2.getRowCount();
            int i = GridRecyclerView.n2;
            kgVar.m(x5j1.h(rowCount, this.c.C0(0), collectionInfo2.getSelectionMode(), collectionInfo2.isHierarchical()));
        }
    }
}

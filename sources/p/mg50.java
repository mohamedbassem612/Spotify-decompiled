package p;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.spotify.allboarding.allboardingimpl.utils.GridRecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mg50 extends x611 {
    public final /* synthetic */ GridRecyclerView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg50(ng50 ng50Var, GridRecyclerView gridRecyclerView) {
        super(ng50Var);
        this.c = gridRecyclerView;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        super.onInitializeAccessibilityNodeInfo(view, kgVar);
        AccessibilityNodeInfo accessibilityNodeInfo = kgVar.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        jg jgVar = collectionItemInfo != null ? new jg(collectionItemInfo) : null;
        if (jgVar != null) {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) jgVar.a;
            int rowIndex = collectionItemInfo2.getRowIndex();
            int rowSpan = collectionItemInfo2.getRowSpan();
            int columnIndex = collectionItemInfo2.getColumnIndex();
            int i = GridRecyclerView.n2;
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(rowIndex, rowSpan, (this.c.C0(0) * columnIndex) / 30, collectionItemInfo2.getColumnSpan(), kgVar.h()));
        }
    }
}

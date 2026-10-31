package app.p000rive.semantics;

import android.graphics.Rect;
import kotlin.Metadata;
import p.kg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lapp/rive/semantics/SemanticNodeData;", "parent", "Lapp/rive/semantics/AndroidAccessibilityBounds;", "toAndroidAccessibilityBounds", "(Lapp/rive/semantics/SemanticNodeData;Lapp/rive/semantics/SemanticNodeData;)Lapp/rive/semantics/AndroidAccessibilityBounds;", "Lp/kg;", "bounds", "Lp/rih1;", "applySemanticNodeBounds", "(Lp/kg;Lapp/rive/semantics/AndroidAccessibilityBounds;)V", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidSemanticNodeBoundsKt {
    public static final void applySemanticNodeBounds(kg kgVar, AndroidAccessibilityBounds androidAccessibilityBounds) {
        kgVar.a.setBoundsInParent(new Rect(androidAccessibilityBounds.getLeft(), androidAccessibilityBounds.getTop(), androidAccessibilityBounds.getRight(), androidAccessibilityBounds.getBottom()));
    }

    public static final AndroidAccessibilityBounds toAndroidAccessibilityBounds(SemanticNodeData semanticNodeData, SemanticNodeData semanticNodeData2) {
        float fMin = Math.min(semanticNodeData.getMinX(), semanticNodeData.getMaxX());
        float fMin2 = Math.min(semanticNodeData.getMinY(), semanticNodeData.getMaxY());
        float fMax = Math.max(semanticNodeData.getMinX(), semanticNodeData.getMaxX());
        float fMax2 = Math.max(semanticNodeData.getMinY(), semanticNodeData.getMaxY());
        int iFloor = semanticNodeData2 != null ? (int) Math.floor(Math.min(semanticNodeData2.getMinX(), semanticNodeData2.getMaxX())) : 0;
        int iFloor2 = semanticNodeData2 != null ? (int) Math.floor(Math.min(semanticNodeData2.getMinY(), semanticNodeData2.getMaxY())) : 0;
        return new AndroidAccessibilityBounds(((int) Math.floor(fMin)) - iFloor, ((int) Math.floor(fMin2)) - iFloor2, ((int) Math.ceil(fMax)) - iFloor, ((int) Math.ceil(fMax2)) - iFloor2);
    }
}

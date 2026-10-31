package app.p000rive.semantics;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p.kg;
import p.q7h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a3\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lp/kg;", "Landroid/view/View;", "host", "", "riveNodeId", "Lapp/rive/semantics/ProjectedSemanticHierarchy;", "hierarchy", "Lapp/rive/semantics/AndroidVirtualNodeIdRegistry;", "registry", "", "applySemanticNodeHierarchy", "(Lp/kg;Landroid/view/View;ILapp/rive/semantics/ProjectedSemanticHierarchy;Lapp/rive/semantics/AndroidVirtualNodeIdRegistry;)Z", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidSemanticNodeHierarchyKt {
    public static final boolean applySemanticNodeHierarchy(kg kgVar, View view, int i, ProjectedSemanticHierarchy projectedSemanticHierarchy, AndroidVirtualNodeIdRegistry androidVirtualNodeIdRegistry) {
        Integer numVirtualIdForRiveNode;
        AccessibilityNodeInfo accessibilityNodeInfo = kgVar.a;
        if (!projectedSemanticHierarchy.contains(i) || androidVirtualNodeIdRegistry.virtualIdForRiveNode(i) == null) {
            return false;
        }
        Integer numParentOf = projectedSemanticHierarchy.parentOf(i);
        if (numParentOf != null) {
            numVirtualIdForRiveNode = androidVirtualNodeIdRegistry.virtualIdForRiveNode(numParentOf.intValue());
            if (numVirtualIdForRiveNode == null) {
                return false;
            }
        } else {
            numVirtualIdForRiveNode = null;
        }
        List<Integer> listChildrenOf = projectedSemanticHierarchy.childrenOf(i);
        ArrayList arrayList = new ArrayList(q7h.U(listChildrenOf, 10));
        Iterator<T> it = listChildrenOf.iterator();
        while (it.hasNext()) {
            Integer numVirtualIdForRiveNode2 = androidVirtualNodeIdRegistry.virtualIdForRiveNode(((Number) it.next()).intValue());
            if (numVirtualIdForRiveNode2 == null) {
                return false;
            }
            arrayList.add(numVirtualIdForRiveNode2);
        }
        if (numVirtualIdForRiveNode != null) {
            int iIntValue = numVirtualIdForRiveNode.intValue();
            kgVar.b = iIntValue;
            accessibilityNodeInfo.setParent(view, iIntValue);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            accessibilityNodeInfo.addChild(view, ((Number) it2.next()).intValue());
        }
        return true;
    }
}

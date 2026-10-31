package app.p000rive.semantics;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p.cy30;
import p.f4i1;
import p.u890;
import p.xcg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001Bc\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\n¢\u0006\u0002\u0010\fJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nHÆ\u0003J\u001b\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\nHÆ\u0003Jx\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0004HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006%"}, d2 = {"Lapp/rive/semantics/ProjectedSemanticHierarchyData;", "", "roots", "", "", "activeNodeIds", "activeModalNodeId", "hasDisjointActiveModals", "", "parentByNodeId", "", "childrenByNodeId", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;ZLjava/util/Map;Ljava/util/Map;)V", "getActiveModalNodeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getActiveNodeIds", "()Ljava/util/List;", "getChildrenByNodeId", "()Ljava/util/Map;", "getHasDisjointActiveModals", "()Z", "getParentByNodeId", "getRoots", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;ZLjava/util/Map;Ljava/util/Map;)Lapp/rive/semantics/ProjectedSemanticHierarchyData;", "equals", "other", "hashCode", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final /* data */ class ProjectedSemanticHierarchyData {
    private final Integer activeModalNodeId;
    private final List<Integer> activeNodeIds;
    private final Map<Integer, List<Integer>> childrenByNodeId;
    private final boolean hasDisjointActiveModals;
    private final Map<Integer, Integer> parentByNodeId;
    private final List<Integer> roots;

    /* JADX WARN: Multi-variable type inference failed */
    public ProjectedSemanticHierarchyData(List<Integer> list, List<Integer> list2, Integer num, boolean z, Map<Integer, Integer> map, Map<Integer, ? extends List<Integer>> map2) {
        this.roots = list;
        this.activeNodeIds = list2;
        this.activeModalNodeId = num;
        this.hasDisjointActiveModals = z;
        this.parentByNodeId = map;
        this.childrenByNodeId = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProjectedSemanticHierarchyData copy$default(ProjectedSemanticHierarchyData projectedSemanticHierarchyData, List list, List list2, Integer num, boolean z, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = projectedSemanticHierarchyData.roots;
        }
        if ((i & 2) != 0) {
            list2 = projectedSemanticHierarchyData.activeNodeIds;
        }
        if ((i & 4) != 0) {
            num = projectedSemanticHierarchyData.activeModalNodeId;
        }
        if ((i & 8) != 0) {
            z = projectedSemanticHierarchyData.hasDisjointActiveModals;
        }
        if ((i & 16) != 0) {
            map = projectedSemanticHierarchyData.parentByNodeId;
        }
        if ((i & 32) != 0) {
            map2 = projectedSemanticHierarchyData.childrenByNodeId;
        }
        Map map3 = map;
        Map map4 = map2;
        return projectedSemanticHierarchyData.copy(list, list2, num, z, map3, map4);
    }

    public final List<Integer> component1() {
        return this.roots;
    }

    public final List<Integer> component2() {
        return this.activeNodeIds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getActiveModalNodeId() {
        return this.activeModalNodeId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHasDisjointActiveModals() {
        return this.hasDisjointActiveModals;
    }

    public final Map<Integer, Integer> component5() {
        return this.parentByNodeId;
    }

    public final Map<Integer, List<Integer>> component6() {
        return this.childrenByNodeId;
    }

    public final ProjectedSemanticHierarchyData copy(List<Integer> roots, List<Integer> activeNodeIds, Integer activeModalNodeId, boolean hasDisjointActiveModals, Map<Integer, Integer> parentByNodeId, Map<Integer, ? extends List<Integer>> childrenByNodeId) {
        return new ProjectedSemanticHierarchyData(roots, activeNodeIds, activeModalNodeId, hasDisjointActiveModals, parentByNodeId, childrenByNodeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectedSemanticHierarchyData)) {
            return false;
        }
        ProjectedSemanticHierarchyData projectedSemanticHierarchyData = (ProjectedSemanticHierarchyData) other;
        return u890.j(this.roots, projectedSemanticHierarchyData.roots) && u890.j(this.activeNodeIds, projectedSemanticHierarchyData.activeNodeIds) && u890.j(this.activeModalNodeId, projectedSemanticHierarchyData.activeModalNodeId) && this.hasDisjointActiveModals == projectedSemanticHierarchyData.hasDisjointActiveModals && u890.j(this.parentByNodeId, projectedSemanticHierarchyData.parentByNodeId) && u890.j(this.childrenByNodeId, projectedSemanticHierarchyData.childrenByNodeId);
    }

    public final Integer getActiveModalNodeId() {
        return this.activeModalNodeId;
    }

    public final List<Integer> getActiveNodeIds() {
        return this.activeNodeIds;
    }

    public final Map<Integer, List<Integer>> getChildrenByNodeId() {
        return this.childrenByNodeId;
    }

    public final boolean getHasDisjointActiveModals() {
        return this.hasDisjointActiveModals;
    }

    public final Map<Integer, Integer> getParentByNodeId() {
        return this.parentByNodeId;
    }

    public final List<Integer> getRoots() {
        return this.roots;
    }

    public int hashCode() {
        int iB = f4i1.b(this.roots.hashCode() * 31, 31, this.activeNodeIds);
        Integer num = this.activeModalNodeId;
        return this.childrenByNodeId.hashCode() + cy30.e(xcg1.g((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.hasDisjointActiveModals), 31, this.parentByNodeId);
    }

    public String toString() {
        return "ProjectedSemanticHierarchyData(roots=" + this.roots + ", activeNodeIds=" + this.activeNodeIds + ", activeModalNodeId=" + this.activeModalNodeId + ", hasDisjointActiveModals=" + this.hasDisjointActiveModals + ", parentByNodeId=" + this.parentByNodeId + ", childrenByNodeId=" + this.childrenByNodeId + ")";
    }
}

package app.p000rive.semantics;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0014\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dBe\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\n¢\u0006\u0002\u0010\fJ\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0004J\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lapp/rive/semantics/ProjectedSemanticHierarchy;", "", "roots", "", "", "activeNodeIds", "activeModalNodeId", "hasDisjointActiveModals", "", "parentByNodeId", "", "childrenByNodeId", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;ZLjava/util/Map;Ljava/util/Map;)V", "getActiveModalNodeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getActiveNodeIds", "()Ljava/util/List;", "getHasDisjointActiveModals", "()Z", "getRoots", "size", "getSize", "()I", "childrenOf", "nodeId", "contains", "parentOf", "(I)Ljava/lang/Integer;", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ProjectedSemanticHierarchy {
    private final Integer activeModalNodeId;
    private final List<Integer> activeNodeIds;
    private final Map<Integer, List<Integer>> childrenByNodeId;
    private final boolean hasDisjointActiveModals;
    private final Map<Integer, Integer> parentByNodeId;
    private final List<Integer> roots;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/semantics/ProjectedSemanticHierarchy$Companion;", "", "()V", "from", "Lapp/rive/semantics/ProjectedSemanticHierarchy;", "tree", "Lapp/rive/semantics/SemanticTreeModel;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProjectedSemanticHierarchy from(SemanticTreeModel tree) {
            ProjectedSemanticHierarchyData projectedSemanticHierarchyDataBuild = new ProjectedSemanticHierarchyBuilder(tree).build();
            return new ProjectedSemanticHierarchy(projectedSemanticHierarchyDataBuild.getRoots(), projectedSemanticHierarchyDataBuild.getActiveNodeIds(), projectedSemanticHierarchyDataBuild.getActiveModalNodeId(), projectedSemanticHierarchyDataBuild.getHasDisjointActiveModals(), projectedSemanticHierarchyDataBuild.getParentByNodeId(), projectedSemanticHierarchyDataBuild.getChildrenByNodeId(), null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ProjectedSemanticHierarchy(List<Integer> list, List<Integer> list2, Integer num, boolean z, Map<Integer, Integer> map, Map<Integer, ? extends List<Integer>> map2) {
        this.roots = list;
        this.activeNodeIds = list2;
        this.activeModalNodeId = num;
        this.hasDisjointActiveModals = z;
        this.parentByNodeId = map;
        this.childrenByNodeId = map2;
    }

    public final List<Integer> childrenOf(int nodeId) {
        List<Integer> list = this.childrenByNodeId.get(Integer.valueOf(nodeId));
        return list == null ? z6x.a : list;
    }

    public final boolean contains(int nodeId) {
        return this.parentByNodeId.containsKey(Integer.valueOf(nodeId));
    }

    public final Integer getActiveModalNodeId() {
        return this.activeModalNodeId;
    }

    public final List<Integer> getActiveNodeIds() {
        return this.activeNodeIds;
    }

    public final boolean getHasDisjointActiveModals() {
        return this.hasDisjointActiveModals;
    }

    public final List<Integer> getRoots() {
        return this.roots;
    }

    public final int getSize() {
        return this.activeNodeIds.size();
    }

    public final Integer parentOf(int nodeId) {
        return this.parentByNodeId.get(Integer.valueOf(nodeId));
    }

    public /* synthetic */ ProjectedSemanticHierarchy(List list, List list2, Integer num, boolean z, Map map, Map map2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, num, z, map, map2);
    }
}

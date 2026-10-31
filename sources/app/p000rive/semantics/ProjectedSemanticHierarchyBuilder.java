package app.p000rive.semantics;

import app.p000rive.RiveLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.dm61;
import p.hab0;
import p.o7h;
import p.sqg0;
import p.w7x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\b\u0003\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R4\u0010\u001a\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0018j\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lapp/rive/semantics/ProjectedSemanticHierarchyBuilder;", "", "Lapp/rive/semantics/SemanticTreeModel;", "tree", "<init>", "(Lapp/rive/semantics/SemanticTreeModel;)V", "Lapp/rive/semantics/ModalSelection;", "findActiveModal", "()Lapp/rive/semantics/ModalSelection;", "", "nodeId", "projectedParentId", "", "into", "Lp/rih1;", "projectNode", "(ILjava/lang/Integer;Ljava/util/List;)V", "exportNode", "Lapp/rive/semantics/ProjectedSemanticHierarchyData;", "build", "()Lapp/rive/semantics/ProjectedSemanticHierarchyData;", "Lapp/rive/semantics/SemanticTreeModel;", "activeNodeIds", "Ljava/util/List;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "parentByNodeId", "Ljava/util/LinkedHashMap;", "", "", "childrenByNodeId", "Ljava/util/Map;", "", "visitedNodeIds", "Ljava/util/Set;", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ProjectedSemanticHierarchyBuilder {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "Rive/Semantics";
    private final SemanticTreeModel tree;
    private final List<Integer> activeNodeIds = new ArrayList();
    private final LinkedHashMap<Integer, Integer> parentByNodeId = new LinkedHashMap<>();
    private final Map<Integer, List<Integer>> childrenByNodeId = new LinkedHashMap();
    private final Set<Integer> visitedNodeIds = new LinkedHashSet();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lapp/rive/semantics/ProjectedSemanticHierarchyBuilder$Companion;", "", "()V", "TAG", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SemanticNodeProjection.values().length];
            try {
                iArr[SemanticNodeProjection.PruneSubtree.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SemanticNodeProjection.PromoteChildren.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SemanticNodeProjection.ExportContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SemanticNodeProjection.ExportLeaf.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: app.rive.semantics.ProjectedSemanticHierarchyBuilder$build$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ ModalSelection $modalSelection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ModalSelection modalSelection) {
            super(0);
            this.$modalSelection = modalSelection;
        }

        public final String invoke() {
            return "Multiple disjoint Rive semantic modals are active; using authored modal " + this.$modalSelection.getNodeId() + ".";
        }
    }

    public ProjectedSemanticHierarchyBuilder(SemanticTreeModel semanticTreeModel) {
        this.tree = semanticTreeModel;
    }

    private final void exportNode(int nodeId, Integer projectedParentId, List<Integer> into) {
        into.add(Integer.valueOf(nodeId));
        this.activeNodeIds.add(Integer.valueOf(nodeId));
        this.parentByNodeId.put(Integer.valueOf(nodeId), projectedParentId);
    }

    private final ModalSelection findActiveModal() {
        ArrayList<ModalCandidate> arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Integer> it = this.tree.getRoots().iterator();
        while (it.hasNext()) {
            findActiveModal$visit(linkedHashSet, this, arrayList, it.next().intValue(), 0, w7x.a);
        }
        boolean z = false;
        if (arrayList.isEmpty()) {
            return new ModalSelection(null, false);
        }
        Object objQ0 = o7h.q0(arrayList);
        for (ModalCandidate modalCandidate : o7h.k0(arrayList, 1)) {
            if (modalCandidate.getDepth() > ((ModalCandidate) objQ0).getDepth()) {
                objQ0 = modalCandidate;
            }
        }
        if (!arrayList.isEmpty()) {
            for (ModalCandidate modalCandidate2 : arrayList) {
                ModalCandidate modalCandidate3 = (ModalCandidate) objQ0;
                if (modalCandidate2.getNodeId() != modalCandidate3.getNodeId() && !modalCandidate3.getAncestorNodeIds().contains(Integer.valueOf(modalCandidate2.getNodeId())) && !modalCandidate2.getAncestorNodeIds().contains(Integer.valueOf(modalCandidate3.getNodeId()))) {
                    z = true;
                    break;
                }
            }
        }
        return new ModalSelection(Integer.valueOf(((ModalCandidate) objQ0).getNodeId()), z);
    }

    private static final void findActiveModal$visit(Set<Integer> set, ProjectedSemanticHierarchyBuilder projectedSemanticHierarchyBuilder, List<ModalCandidate> list, int i, int i2, Set<Integer> set2) {
        SemanticNodeData semanticNodeDataNodeById;
        if (set.add(Integer.valueOf(i)) && (semanticNodeDataNodeById = projectedSemanticHierarchyBuilder.tree.nodeById(i)) != null) {
            SemanticRole semanticRoleFromValue = SemanticRole.INSTANCE.fromValue(semanticNodeDataNodeById.getRole());
            SemanticNodeState semanticNodeStateMapSemanticNodeState = SemanticNodeClassificationKt.mapSemanticNodeState(semanticNodeDataNodeById.getTraitFlags(), semanticNodeDataNodeById.getStateFlags());
            SemanticNodeProjection semanticNodeProjectionClassifySemanticNodeProjection = SemanticNodeClassificationKt.classifySemanticNodeProjection(semanticRoleFromValue, SemanticNodeClassificationKt.mapSemanticNodeContent(semanticRoleFromValue, semanticNodeDataNodeById.getLabel(), semanticNodeDataNodeById.getValue(), semanticNodeDataNodeById.getHint(), semanticNodeStateMapSemanticNodeState), semanticNodeStateMapSemanticNodeState, semanticNodeDataNodeById.getMinX(), semanticNodeDataNodeById.getMinY(), semanticNodeDataNodeById.getMaxX(), semanticNodeDataNodeById.getMaxY());
            if (semanticNodeProjectionClassifySemanticNodeProjection == SemanticNodeProjection.PruneSubtree) {
                return;
            }
            if (semanticNodeProjectionClassifySemanticNodeProjection == SemanticNodeProjection.ExportContainer && SemanticNodeClassificationKt.isActiveModal(semanticRoleFromValue, semanticNodeStateMapSemanticNodeState)) {
                list.add(new ModalCandidate(i, i2, set2));
            }
            if (semanticNodeProjectionClassifySemanticNodeProjection == SemanticNodeProjection.ExportLeaf) {
                return;
            }
            LinkedHashSet linkedHashSetX0 = dm61.x0(Integer.valueOf(i), set2);
            Iterator<Integer> it = semanticNodeDataNodeById.getChildren().iterator();
            while (it.hasNext()) {
                findActiveModal$visit(set, projectedSemanticHierarchyBuilder, list, it.next().intValue(), i2 + 1, linkedHashSetX0);
            }
        }
    }

    private final void projectNode(int nodeId, Integer projectedParentId, List<Integer> into) {
        SemanticNodeData semanticNodeDataNodeById;
        if (this.visitedNodeIds.add(Integer.valueOf(nodeId)) && (semanticNodeDataNodeById = this.tree.nodeById(nodeId)) != null) {
            SemanticRole semanticRoleFromValue = SemanticRole.INSTANCE.fromValue(semanticNodeDataNodeById.getRole());
            SemanticNodeState semanticNodeStateMapSemanticNodeState = SemanticNodeClassificationKt.mapSemanticNodeState(semanticNodeDataNodeById.getTraitFlags(), semanticNodeDataNodeById.getStateFlags());
            int i = WhenMappings.$EnumSwitchMapping$0[SemanticNodeClassificationKt.classifySemanticNodeProjection(semanticRoleFromValue, SemanticNodeClassificationKt.mapSemanticNodeContent(semanticRoleFromValue, semanticNodeDataNodeById.getLabel(), semanticNodeDataNodeById.getValue(), semanticNodeDataNodeById.getHint(), semanticNodeStateMapSemanticNodeState), semanticNodeStateMapSemanticNodeState, semanticNodeDataNodeById.getMinX(), semanticNodeDataNodeById.getMinY(), semanticNodeDataNodeById.getMaxX(), semanticNodeDataNodeById.getMaxY()).ordinal()];
            if (i == 2) {
                Iterator<Integer> it = semanticNodeDataNodeById.getChildren().iterator();
                while (it.hasNext()) {
                    projectNode(it.next().intValue(), projectedParentId, into);
                }
            } else if (i != 3) {
                if (i != 4) {
                    return;
                }
                exportNode(nodeId, projectedParentId, into);
            } else {
                exportNode(nodeId, projectedParentId, into);
                ArrayList arrayList = new ArrayList();
                Iterator<Integer> it2 = semanticNodeDataNodeById.getChildren().iterator();
                while (it2.hasNext()) {
                    projectNode(it2.next().intValue(), Integer.valueOf(nodeId), arrayList);
                }
                this.childrenByNodeId.put(Integer.valueOf(nodeId), ProjectedSemanticHierarchyKt.toUnmodifiableList(arrayList));
            }
        }
    }

    public final ProjectedSemanticHierarchyData build() {
        ModalSelection modalSelectionFindActiveModal = findActiveModal();
        if (modalSelectionFindActiveModal.getHasDisjointCandidates()) {
            RiveLog.INSTANCE.getLogger().w(TAG, new AnonymousClass1(modalSelectionFindActiveModal));
        }
        ArrayList arrayList = new ArrayList();
        Integer nodeId = modalSelectionFindActiveModal.getNodeId();
        if (nodeId != null) {
            projectNode(nodeId.intValue(), null, arrayList);
        } else {
            Iterator<Integer> it = this.tree.getRoots().iterator();
            while (it.hasNext()) {
                projectNode(it.next().intValue(), null, arrayList);
            }
        }
        return new ProjectedSemanticHierarchyData(ProjectedSemanticHierarchyKt.toUnmodifiableList(arrayList), ProjectedSemanticHierarchyKt.toUnmodifiableList(this.activeNodeIds), nodeId, modalSelectionFindActiveModal.getHasDisjointCandidates(), sqg0.U(this.parentByNodeId), sqg0.U(this.childrenByNodeId));
    }
}

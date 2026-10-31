package app.p000rive.semantics;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bhn0;
import p.f4i1;
import p.hab0;
import p.iu30;
import p.kg;
import p.lyc;
import p.ng;
import p.os00;
import p.rih1;
import p.tv30;
import p.u890;
import p.vu30;
import p.xkg0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010\u0016J\u0017\u0010'\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010%J!\u0010)\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u00072\u0006\u0010(\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001dH\u0002¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.0-2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b/\u00100J$\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u001012\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0082\b¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u0004\u0018\u00010.2\u0006\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\t2\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0002¢\u0006\u0004\b9\u0010:J\u0013\u0010;\u001a\u00020\u001d*\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u0004\u0018\u00010\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\t¢\u0006\u0004\b?\u0010\u0016J\r\u0010@\u001a\u00020\u001d¢\u0006\u0004\b@\u0010,J\r\u0010A\u001a\u00020\t¢\u0006\u0004\bA\u0010\u0016J\u001f\u0010E\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020BH\u0014¢\u0006\u0004\bE\u0010FJ\u001d\u0010I\u001a\u00020\t2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00070GH\u0014¢\u0006\u0004\bI\u0010JJ\u001f\u0010N\u001a\u00020\t2\u0006\u0010K\u001a\u00020\u00072\u0006\u0010M\u001a\u00020LH\u0014¢\u0006\u0004\bN\u0010OJ)\u0010S\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u00072\b\u0010R\u001a\u0004\u0018\u00010QH\u0014¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020U2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010XR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010YR&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010ZR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010[R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010[R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\\R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010]R\u0016\u0010^\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\"\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.0-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010l\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010kR\u0016\u0010m\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010kR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006q"}, d2 = {"Lapp/rive/semantics/RiveExploreByTouchHelper;", "Lp/os00;", "Landroid/view/View;", "host", "Lapp/rive/semantics/SemanticTreeModel;", "tree", "Lkotlin/Function2;", "", "Lapp/rive/semantics/SemanticActionType;", "Lp/rih1;", "onSemanticAction", "Lkotlin/Function1;", "Lapp/rive/semantics/SemanticAccessibilityFocusTransition;", "onAccessibilityFocusChanged", "onSemanticFocusRequested", "Lkotlin/Function0;", "onSemanticFocusCleared", "Lapp/rive/semantics/AndroidVirtualNodeIdRegistry;", "idRegistry", "<init>", "(Landroid/view/View;Lapp/rive/semantics/SemanticTreeModel;Lp/vu30;Lp/iu30;Lp/iu30;Lkotlin/jvm/functions/Function0;Lapp/rive/semantics/AndroidVirtualNodeIdRegistry;)V", "synchronizeChangedTree", "()V", "synchronizeBeforeAccessibilityOperation", "Lapp/rive/semantics/ProjectedSemanticHierarchy;", "projectedHierarchy", "modalFocusTarget", "(Lapp/rive/semantics/ProjectedSemanticHierarchy;)Ljava/lang/Integer;", "riveNodeId", "", "requestAccessibilityFocus", "(Ljava/lang/Integer;)Z", "modalNodeId", "", "modalPaneTitle", "(Ljava/lang/Integer;)Ljava/lang/String;", "announceModalAppeared", "(I)V", "announceModalDisappeared", "announceModalTitleChanged", "contentChangeType", "sendModalPaneEvent", "(Ljava/lang/Integer;I)V", "clearAccessibilityFocus", "()Z", "", "Lapp/rive/semantics/SemanticNodeData;", "snapshotProjectedNodes", "(Lapp/rive/semantics/ProjectedSemanticHierarchy;)Ljava/util/Map;", "T", "block", "withProjectedSnapshotPopulation", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "nodeDataForPopulation", "(I)Lapp/rive/semantics/SemanticNodeData;", "previousVirtualNodeId", "currentVirtualNodeId", "handleAccessibilityFocusChanged", "(II)V", "canRequestSemanticFocus", "(I)Z", "toActiveRiveNodeIdOrNull", "(I)Ljava/lang/Integer;", "onInstalled", "synchronizeWithTree", "dispose", "", "x", "y", "getVirtualViewAt", "(FF)I", "", "virtualViewIds", "getVisibleVirtualViews", "(Ljava/util/List;)V", "virtualViewId", "Lp/kg;", "node", "onPopulateNodeForVirtualView", "(ILp/kg;)V", "action", "Landroid/os/Bundle;", "arguments", "onPerformActionForVirtualView", "(IILandroid/os/Bundle;)Z", "Lp/ng;", "getAccessibilityNodeProvider", "(Landroid/view/View;)Lp/ng;", "Landroid/view/View;", "Lapp/rive/semantics/SemanticTreeModel;", "Lp/vu30;", "Lp/iu30;", "Lkotlin/jvm/functions/Function0;", "Lapp/rive/semantics/AndroidVirtualNodeIdRegistry;", "hierarchy", "Lapp/rive/semantics/ProjectedSemanticHierarchy;", "projectedNodeSnapshots", "Ljava/util/Map;", "projectedTreeVersion", "I", "filteringProvider", "Lp/ng;", "preModalAccessibilityFocusedNodeId", "Ljava/lang/Integer;", "activeModalPaneTitle", "Ljava/lang/String;", "isInstalled", "Z", "isSynchronizingWithTree", "isPopulatingProjectedSnapshot", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveExploreByTouchHelper extends os00 {
    public static final int $stable = 8;
    private final AccessibilityManager accessibilityManager;
    private String activeModalPaneTitle;
    private ng filteringProvider;
    private ProjectedSemanticHierarchy hierarchy;
    private final View host;
    private final AndroidVirtualNodeIdRegistry idRegistry;
    private boolean isInstalled;
    private boolean isPopulatingProjectedSnapshot;
    private boolean isSynchronizingWithTree;
    private final iu30 onAccessibilityFocusChanged;
    private final vu30 onSemanticAction;
    private final Function0 onSemanticFocusCleared;
    private final iu30 onSemanticFocusRequested;
    private Integer preModalAccessibilityFocusedNodeId;
    private Map<Integer, SemanticNodeData> projectedNodeSnapshots;
    private int projectedTreeVersion;
    private final SemanticTreeModel tree;

    /* JADX INFO: renamed from: app.rive.semantics.RiveExploreByTouchHelper$getAccessibilityNodeProvider$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C01173 extends tv30 implements Function0 {
        public C01173(Object obj) {
            super(0, obj, RiveExploreByTouchHelper.class, "getAccessibilityFocusedVirtualViewId", "getAccessibilityFocusedVirtualViewId()I", 0);
        }

        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Integer m582invoke() {
            return Integer.valueOf(((RiveExploreByTouchHelper) ((lyc) this).receiver).getAccessibilityFocusedVirtualViewId());
        }
    }

    /* JADX INFO: renamed from: app.rive.semantics.RiveExploreByTouchHelper$getAccessibilityNodeProvider$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass4 extends tv30 implements Function0 {
        public AnonymousClass4(Object obj) {
            super(0, obj, RiveExploreByTouchHelper.class, "getKeyboardFocusedVirtualViewId", "getKeyboardFocusedVirtualViewId()I", 0);
        }

        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Integer m583invoke() {
            return Integer.valueOf(((RiveExploreByTouchHelper) ((lyc) this).receiver).getKeyboardFocusedVirtualViewId());
        }
    }

    public RiveExploreByTouchHelper(View view, SemanticTreeModel semanticTreeModel, vu30 vu30Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, AndroidVirtualNodeIdRegistry androidVirtualNodeIdRegistry) {
        super(view);
        this.host = view;
        this.tree = semanticTreeModel;
        this.onSemanticAction = vu30Var;
        this.onAccessibilityFocusChanged = iu30Var;
        this.onSemanticFocusRequested = iu30Var2;
        this.onSemanticFocusCleared = function0;
        this.idRegistry = androidVirtualNodeIdRegistry;
        ProjectedSemanticHierarchy projectedSemanticHierarchyFrom = ProjectedSemanticHierarchy.INSTANCE.from(semanticTreeModel);
        this.hierarchy = projectedSemanticHierarchyFrom;
        this.projectedNodeSnapshots = snapshotProjectedNodes(projectedSemanticHierarchyFrom);
        this.projectedTreeVersion = semanticTreeModel.getVersion();
        this.activeModalPaneTitle = modalPaneTitle(this.hierarchy.getActiveModalNodeId());
        this.accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        androidVirtualNodeIdRegistry.reconcile(this.hierarchy);
    }

    private final void announceModalAppeared(int modalNodeId) {
        sendModalPaneEvent(Integer.valueOf(modalNodeId), 16);
    }

    private final void announceModalDisappeared() {
        sendModalPaneEvent(this.hierarchy.getActiveModalNodeId(), 32);
    }

    private final void announceModalTitleChanged(int modalNodeId) {
        sendModalPaneEvent(Integer.valueOf(modalNodeId), 8);
    }

    private final boolean canRequestSemanticFocus(int i) {
        SemanticNodeData semanticNodeDataNodeById = this.tree.nodeById(i);
        if (semanticNodeDataNodeById == null) {
            return false;
        }
        return SemanticNodeClassificationKt.mapSemanticNodeActions(SemanticRole.INSTANCE.fromValue(semanticNodeDataNodeById.getRole()), SemanticNodeClassificationKt.mapSemanticNodeState(semanticNodeDataNodeById.getTraitFlags(), semanticNodeDataNodeById.getStateFlags())).getCanRequestFocus();
    }

    private final boolean clearAccessibilityFocus() {
        int accessibilityFocusedVirtualViewId = getAccessibilityFocusedVirtualViewId();
        if (accessibilityFocusedVirtualViewId == Integer.MIN_VALUE) {
            return false;
        }
        boolean z = this.isPopulatingProjectedSnapshot;
        this.isPopulatingProjectedSnapshot = true;
        try {
            return getAccessibilityNodeProvider(this.host).performAction(accessibilityFocusedVirtualViewId, SemanticState.Focused, null);
        } finally {
            this.isPopulatingProjectedSnapshot = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAccessibilityFocusChanged(int previousVirtualNodeId, int currentVirtualNodeId) {
        SemanticAccessibilityFocusTransition semanticAccessibilityFocusTransition = new SemanticAccessibilityFocusTransition(toActiveRiveNodeIdOrNull(previousVirtualNodeId), toActiveRiveNodeIdOrNull(currentVirtualNodeId));
        Integer currentNodeId = semanticAccessibilityFocusTransition.getCurrentNodeId();
        if (currentNodeId != null && canRequestSemanticFocus(currentNodeId.intValue())) {
            this.onSemanticFocusRequested.invoke(currentNodeId);
        } else if (currentNodeId == null) {
            this.onSemanticFocusCleared.invoke();
        }
        this.onAccessibilityFocusChanged.invoke(semanticAccessibilityFocusTransition);
    }

    private final Integer modalFocusTarget(ProjectedSemanticHierarchy projectedHierarchy) {
        Integer activeModalNodeId = projectedHierarchy.getActiveModalNodeId();
        Integer num = null;
        Object obj = null;
        if (activeModalNodeId != null) {
            int iIntValue = activeModalNodeId.intValue();
            for (Object obj2 : projectedHierarchy.getActiveNodeIds()) {
                if (((Number) obj2).intValue() != iIntValue) {
                    obj = obj2;
                    break;
                }
            }
            num = (Integer) obj;
            if (num == null) {
                return activeModalNodeId;
            }
        }
        return num;
    }

    private final String modalPaneTitle(Integer modalNodeId) {
        SemanticNodeData semanticNodeDataNodeById;
        if (modalNodeId == null || (semanticNodeDataNodeById = this.tree.nodeById(modalNodeId.intValue())) == null) {
            return null;
        }
        String label = semanticNodeDataNodeById.getLabel();
        if (label.length() <= 0) {
            label = null;
        }
        if (label == null) {
            label = semanticNodeDataNodeById.getValue();
            if (label.length() <= 0) {
                label = null;
            }
            if (label == null) {
                String hint = semanticNodeDataNodeById.getHint();
                if (hint.length() > 0) {
                    return hint;
                }
                return null;
            }
        }
        return label;
    }

    private final SemanticNodeData nodeDataForPopulation(int riveNodeId) {
        SemanticNodeData semanticNodeDataNodeById = this.tree.nodeById(riveNodeId);
        if (semanticNodeDataNodeById != null) {
            return semanticNodeDataNodeById;
        }
        if (this.isPopulatingProjectedSnapshot) {
            return this.projectedNodeSnapshots.get(Integer.valueOf(riveNodeId));
        }
        return null;
    }

    private final boolean requestAccessibilityFocus(Integer riveNodeId) {
        Integer numVirtualIdForRiveNode;
        if (riveNodeId == null || (numVirtualIdForRiveNode = this.idRegistry.virtualIdForRiveNode(riveNodeId.intValue())) == null) {
            return false;
        }
        return getAccessibilityNodeProvider(this.host).performAction(numVirtualIdForRiveNode.intValue(), 64, null);
    }

    private final void sendModalPaneEvent(Integer modalNodeId, int contentChangeType) {
        ViewParent parent;
        if (this.accessibilityManager.isEnabled() && (parent = this.host.getParent()) != null) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(32);
            accessibilityEventObtain.setContentChangeTypes(contentChangeType);
            accessibilityEventObtain.setClassName(this.host.getClass().getName());
            accessibilityEventObtain.setPackageName(this.host.getContext().getPackageName());
            accessibilityEventObtain.setEnabled(this.host.isEnabled());
            String str = this.activeModalPaneTitle;
            if (str != null) {
                accessibilityEventObtain.getText().add(str);
                accessibilityEventObtain.setContentDescription(str);
            }
            Integer numVirtualIdForRiveNode = modalNodeId != null ? this.idRegistry.virtualIdForRiveNode(modalNodeId.intValue()) : null;
            View view = this.host;
            if (numVirtualIdForRiveNode == null) {
                accessibilityEventObtain.setSource(view);
            } else {
                accessibilityEventObtain.setSource(view, numVirtualIdForRiveNode.intValue());
            }
            parent.requestSendAccessibilityEvent(this.host, accessibilityEventObtain);
        }
    }

    private final Map<Integer, SemanticNodeData> snapshotProjectedNodes(ProjectedSemanticHierarchy projectedHierarchy) {
        xkg0 xkg0Var = new xkg0();
        Iterator<Integer> it = projectedHierarchy.getActiveNodeIds().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            SemanticNodeData semanticNodeDataNodeById = this.tree.nodeById(iIntValue);
            if (semanticNodeDataNodeById != null) {
            }
        }
        return xkg0Var.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void synchronizeBeforeAccessibilityOperation() {
        if (synchronizeWithTree()) {
            invalidateRoot();
        }
    }

    private final void synchronizeChangedTree() {
        boolean zRequestAccessibilityFocus;
        ProjectedSemanticHierarchy projectedSemanticHierarchyFrom = ProjectedSemanticHierarchy.INSTANCE.from(this.tree);
        Map<Integer, SemanticNodeData> mapSnapshotProjectedNodes = snapshotProjectedNodes(projectedSemanticHierarchyFrom);
        Integer activeModalNodeId = this.hierarchy.getActiveModalNodeId();
        Integer activeModalNodeId2 = projectedSemanticHierarchyFrom.getActiveModalNodeId();
        String strModalPaneTitle = modalPaneTitle(activeModalNodeId2);
        Integer numRiveNodeIdForVirtualNode = this.idRegistry.riveNodeIdForVirtualNode(getAccessibilityFocusedVirtualViewId());
        boolean zJ = u890.j(activeModalNodeId, activeModalNodeId2);
        if (activeModalNodeId == null && activeModalNodeId2 != null) {
            this.preModalAccessibilityFocusedNodeId = numRiveNodeIdForVirtualNode;
        }
        Integer numModalFocusTarget = activeModalNodeId2 != null ? modalFocusTarget(projectedSemanticHierarchyFrom) : null;
        if (zJ || numModalFocusTarget == null) {
            zRequestAccessibilityFocus = false;
        } else {
            boolean z = this.isPopulatingProjectedSnapshot;
            this.isPopulatingProjectedSnapshot = true;
            try {
                zRequestAccessibilityFocus = requestAccessibilityFocus(numModalFocusTarget);
                this.isPopulatingProjectedSnapshot = z;
            } catch (Throwable th) {
                this.isPopulatingProjectedSnapshot = z;
                throw th;
            }
        }
        if (numRiveNodeIdForVirtualNode != null && !projectedSemanticHierarchyFrom.contains(numRiveNodeIdForVirtualNode.intValue()) && !zRequestAccessibilityFocus) {
            clearAccessibilityFocus();
        }
        if (!zJ && activeModalNodeId != null) {
            announceModalDisappeared();
        }
        this.idRegistry.reconcile(projectedSemanticHierarchyFrom);
        this.hierarchy = projectedSemanticHierarchyFrom;
        this.projectedNodeSnapshots = mapSnapshotProjectedNodes;
        this.projectedTreeVersion = this.tree.getVersion();
        boolean zJ2 = u890.j(this.activeModalPaneTitle, strModalPaneTitle);
        this.activeModalPaneTitle = strModalPaneTitle;
        if (activeModalNodeId2 != null && !zJ) {
            if (!zRequestAccessibilityFocus) {
                requestAccessibilityFocus(numModalFocusTarget);
            }
            announceModalAppeared(activeModalNodeId2.intValue());
        } else {
            if (activeModalNodeId == null || activeModalNodeId2 != null) {
                if (activeModalNodeId2 == null || zJ2) {
                    return;
                }
                announceModalTitleChanged(activeModalNodeId2.intValue());
                return;
            }
            Integer num = this.preModalAccessibilityFocusedNodeId;
            this.preModalAccessibilityFocusedNodeId = null;
            if (num == null || !this.hierarchy.contains(num.intValue())) {
                return;
            }
            requestAccessibilityFocus(num);
        }
    }

    private final Integer toActiveRiveNodeIdOrNull(int i) {
        if (i == Integer.MIN_VALUE) {
            return null;
        }
        return this.idRegistry.riveNodeIdForVirtualNode(i);
    }

    private final <T> T withProjectedSnapshotPopulation(Function0 block) {
        boolean z = this.isPopulatingProjectedSnapshot;
        this.isPopulatingProjectedSnapshot = true;
        try {
            return (T) block.invoke();
        } finally {
            this.isPopulatingProjectedSnapshot = z;
        }
    }

    public final void dispose() {
        if (this.isInstalled && this.hierarchy.getActiveModalNodeId() != null) {
            announceModalDisappeared();
        }
        this.isInstalled = false;
        clearAccessibilityFocus();
        this.preModalAccessibilityFocusedNodeId = null;
        this.idRegistry.clear();
    }

    @Override // p.os00
    public ng getAccessibilityNodeProvider(View host) {
        ng ngVar = this.filteringProvider;
        if (ngVar != null) {
            return ngVar;
        }
        ActiveSemanticNodeProvider activeSemanticNodeProvider = new ActiveSemanticNodeProvider(super.getAccessibilityNodeProvider(host), new C01162(), new C01173(this), new AnonymousClass4(this), new AnonymousClass5(this), new AnonymousClass6());
        this.filteringProvider = activeSemanticNodeProvider;
        return activeSemanticNodeProvider;
    }

    @Override // p.os00
    public int getVirtualViewAt(float x, float y) {
        Integer numHitTest;
        synchronizeBeforeAccessibilityOperation();
        if (x >= 0.0f && y >= 0.0f && x < this.host.getWidth() && y < this.host.getHeight() && (numHitTest = ProjectedSemanticHierarchyHitTestKt.hitTest(this.hierarchy, this.tree, x, y)) != null) {
            Integer numVirtualIdForRiveNode = this.idRegistry.virtualIdForRiveNode(numHitTest.intValue());
            if (numVirtualIdForRiveNode != null) {
                return numVirtualIdForRiveNode.intValue();
            }
        }
        return os00.INVALID_ID;
    }

    @Override // p.os00
    public void getVisibleVirtualViews(List<Integer> virtualViewIds) {
        Iterator<Integer> it = this.hierarchy.getRoots().iterator();
        while (it.hasNext()) {
            Integer numVirtualIdForRiveNode = this.idRegistry.virtualIdForRiveNode(it.next().intValue());
            if (numVirtualIdForRiveNode != null) {
                virtualViewIds.add(Integer.valueOf(numVirtualIdForRiveNode.intValue()));
            }
        }
    }

    public final void onInstalled() {
        if (this.isInstalled) {
            return;
        }
        this.isInstalled = true;
        Integer activeModalNodeId = this.hierarchy.getActiveModalNodeId();
        if (activeModalNodeId != null) {
            announceModalAppeared(activeModalNodeId.intValue());
            requestAccessibilityFocus(modalFocusTarget(this.hierarchy));
        }
    }

    @Override // p.os00
    public boolean onPerformActionForVirtualView(int virtualViewId, int action, Bundle arguments) {
        Object next;
        Integer numRiveNodeIdForVirtualNode = this.idRegistry.riveNodeIdForVirtualNode(virtualViewId);
        if (numRiveNodeIdForVirtualNode == null) {
            return false;
        }
        SemanticNodeData semanticNodeDataNodeById = this.tree.nodeById(numRiveNodeIdForVirtualNode.intValue());
        if (semanticNodeDataNodeById == null) {
            return false;
        }
        Iterator<T> it = SemanticNodeClassificationKt.mapSemanticNodeActions(SemanticRole.INSTANCE.fromValue(semanticNodeDataNodeById.getRole()), SemanticNodeClassificationKt.mapSemanticNodeState(semanticNodeDataNodeById.getTraitFlags(), semanticNodeDataNodeById.getStateFlags())).getSemanticActions().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (AndroidSemanticNodeMappingKt.toAndroidAccessibilityActionId((SemanticActionType) next) != action);
        SemanticActionType semanticActionType = (SemanticActionType) next;
        if (semanticActionType == null) {
            return false;
        }
        this.onSemanticAction.invoke(numRiveNodeIdForVirtualNode, semanticActionType);
        return true;
    }

    @Override // p.os00
    public void onPopulateNodeForVirtualView(int virtualViewId, kg node) {
        AccessibilityNodeInfo accessibilityNodeInfo = node.a;
        Integer numRiveNodeIdForVirtualNode = this.idRegistry.riveNodeIdForVirtualNode(virtualViewId);
        if (numRiveNodeIdForVirtualNode == null) {
            bhn0.f(f4i1.c(virtualViewId, "Cannot populate inactive virtual accessibility node "));
            return;
        }
        int iIntValue = numRiveNodeIdForVirtualNode.intValue();
        SemanticNodeData semanticNodeDataNodeDataForPopulation = nodeDataForPopulation(iIntValue);
        if (semanticNodeDataNodeDataForPopulation == null) {
            bhn0.f(f4i1.c(iIntValue, "Cannot populate missing Rive semantic node "));
            return;
        }
        SemanticRole semanticRoleFromValue = SemanticRole.INSTANCE.fromValue(semanticNodeDataNodeDataForPopulation.getRole());
        SemanticNodeState semanticNodeStateMapSemanticNodeState = SemanticNodeClassificationKt.mapSemanticNodeState(semanticNodeDataNodeDataForPopulation.getTraitFlags(), semanticNodeDataNodeDataForPopulation.getStateFlags());
        SemanticNodeContent semanticNodeContentMapSemanticNodeContent = SemanticNodeClassificationKt.mapSemanticNodeContent(semanticRoleFromValue, semanticNodeDataNodeDataForPopulation.getLabel(), semanticNodeDataNodeDataForPopulation.getValue(), semanticNodeDataNodeDataForPopulation.getHint(), semanticNodeStateMapSemanticNodeState);
        if (!AndroidSemanticNodeHierarchyKt.applySemanticNodeHierarchy(node, this.host, iIntValue, this.hierarchy, this.idRegistry)) {
            bhn0.f(f4i1.c(iIntValue, "Cannot populate inconsistent Rive semantic node "));
            return;
        }
        AndroidSemanticNodeMappingKt.applySemanticNodeRole(node, semanticRoleFromValue);
        AndroidSemanticNodeMappingKt.applySemanticNodeHeading(node, semanticNodeDataNodeDataForPopulation.getHeadingLevel());
        AndroidSemanticNodeMappingKt.applySemanticNodeState(node, semanticNodeStateMapSemanticNodeState);
        AndroidSemanticNodeMappingKt.applySemanticNodeActions(node, SemanticNodeClassificationKt.mapSemanticNodeActions(semanticRoleFromValue, semanticNodeStateMapSemanticNodeState));
        AndroidSemanticNodeMappingKt.applySemanticNodeContent(node, semanticNodeContentMapSemanticNodeContent);
        Integer activeModalNodeId = this.hierarchy.getActiveModalNodeId();
        if (activeModalNodeId != null && iIntValue == activeModalNodeId.intValue()) {
            node.r(this.activeModalPaneTitle);
        }
        Integer numParentOf = this.hierarchy.parentOf(iIntValue);
        AndroidSemanticNodeBoundsKt.applySemanticNodeBounds(node, AndroidSemanticNodeBoundsKt.toAndroidAccessibilityBounds(semanticNodeDataNodeDataForPopulation, numParentOf != null ? nodeDataForPopulation(numParentOf.intValue()) : null));
        if (node.g() == null && accessibilityNodeInfo.getContentDescription() == null) {
            node.o("");
        }
        accessibilityNodeInfo.setFocusable(false);
    }

    public final boolean synchronizeWithTree() {
        if (this.isSynchronizingWithTree || this.projectedTreeVersion == this.tree.getVersion()) {
            return false;
        }
        this.isSynchronizingWithTree = true;
        try {
            synchronizeChangedTree();
            return true;
        } finally {
            this.isSynchronizingWithTree = false;
        }
    }

    /* JADX INFO: renamed from: app.rive.semantics.RiveExploreByTouchHelper$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass3 extends hab0 implements Function0 {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m581invoke();
            return rih1.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m581invoke() {
        }
    }

    /* JADX INFO: renamed from: app.rive.semantics.RiveExploreByTouchHelper$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lapp/rive/semantics/SemanticAccessibilityFocusTransition;", "it", "Lp/rih1;", "invoke", "(Lapp/rive/semantics/SemanticAccessibilityFocusTransition;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements iu30 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticAccessibilityFocusTransition) obj);
            return rih1.a;
        }

        public final void invoke(SemanticAccessibilityFocusTransition semanticAccessibilityFocusTransition) {
        }
    }

    /* JADX INFO: renamed from: app.rive.semantics.RiveExploreByTouchHelper$getAccessibilityNodeProvider$5, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass5 extends tv30 implements Function0 {
        public AnonymousClass5(Object obj) {
            super(0, obj, RiveExploreByTouchHelper.class, "synchronizeBeforeAccessibilityOperation", "synchronizeBeforeAccessibilityOperation()V", 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m584invoke() {
            ((RiveExploreByTouchHelper) ((lyc) this).receiver).synchronizeBeforeAccessibilityOperation();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m584invoke();
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.semantics.RiveExploreByTouchHelper$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lp/rih1;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends hab0 implements iu30 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return rih1.a;
        }

        public final void invoke(int i) {
        }
    }

    /* JADX INFO: renamed from: app.rive.semantics.RiveExploreByTouchHelper$getAccessibilityNodeProvider$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "previousVirtualNodeId", "currentVirtualNodeId", "Lp/rih1;", "invoke", "(II)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass6 extends hab0 implements vu30 {
        public AnonymousClass6() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
            return rih1.a;
        }

        public final void invoke(int i, int i2) {
            RiveExploreByTouchHelper.this.handleAccessibilityFocusChanged(i, i2);
        }
    }

    /* JADX INFO: renamed from: app.rive.semantics.RiveExploreByTouchHelper$getAccessibilityNodeProvider$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "virtualNodeId", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01162 extends hab0 implements iu30 {
        public C01162() {
            super(1);
        }

        public final Boolean invoke(int i) {
            return Boolean.valueOf(RiveExploreByTouchHelper.this.idRegistry.riveNodeIdForVirtualNode(i) != null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    public /* synthetic */ RiveExploreByTouchHelper(View view, SemanticTreeModel semanticTreeModel, vu30 vu30Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, AndroidVirtualNodeIdRegistry androidVirtualNodeIdRegistry, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, semanticTreeModel, vu30Var, (i & 8) != 0 ? AnonymousClass1.INSTANCE : iu30Var, (i & 16) != 0 ? AnonymousClass2.INSTANCE : iu30Var2, (i & 32) != 0 ? AnonymousClass3.INSTANCE : function0, (i & 64) != 0 ? new AndroidVirtualNodeIdRegistry(null, 1, null) : androidVirtualNodeIdRegistry);
    }
}

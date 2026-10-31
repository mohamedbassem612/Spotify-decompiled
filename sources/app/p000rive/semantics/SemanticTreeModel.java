package app.p000rive.semantics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p.bpb1;
import p.gio1;
import p.sqg0;
import p.u890;
import p.wen0;
import p.yoi1;
import p.z6x;
import p.zob1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b!\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0011\u00103\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b4\u00102R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078G¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lapp/rive/semantics/SemanticTreeModel;", "", "<init>", "()V", "", "", "ids", "", "immutableIds", "(Ljava/util/Collection;)Ljava/util/List;", "parentId", "childIds", "(I)Ljava/util/List;", "children", "Lp/rih1;", "replaceChildIds", "(ILjava/util/Collection;)V", "id", "", "detach", "(I)Z", "siblingIndex", "relocate", "(III)Z", "removeSubtree", "(I)V", "Lapp/rive/semantics/SemanticNodeData;", "nodeById", "(I)Lapp/rive/semantics/SemanticNodeData;", "clear$kotlin_release", "clear", "Lapp/rive/semantics/SemanticsDiff;", "diff", "applyDiff$kotlin_release", "(Lapp/rive/semantics/SemanticsDiff;)V", "applyDiff", "", "nodesById", "Ljava/util/Map;", "rootIds", "Ljava/util/List;", "Lp/wen0;", "_versionFlow", "Lp/wen0;", "Lp/zob1;", "versionFlow", "Lp/zob1;", "getVersionFlow", "()Lp/zob1;", "getVersion", "()I", "version", "getNodeCount", "nodeCount", "getRoots", "()Ljava/util/List;", "roots", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SemanticTreeModel {
    public static final int $stable = 8;
    private final wen0 _versionFlow;
    private final Map<Integer, SemanticNodeData> nodesById = new LinkedHashMap();
    private List<Integer> rootIds = z6x.a;
    private final zob1 versionFlow;

    public SemanticTreeModel() {
        bpb1 bpb1VarB = gio1.b(0);
        this._versionFlow = bpb1VarB;
        this.versionFlow = bpb1VarB;
    }

    private final List<Integer> childIds(int parentId) {
        if (parentId < 0) {
            return this.rootIds;
        }
        SemanticNodeData semanticNodeData = this.nodesById.get(Integer.valueOf(parentId));
        List<Integer> children = semanticNodeData != null ? semanticNodeData.getChildren() : null;
        return children == null ? z6x.a : children;
    }

    private final boolean detach(int id) {
        SemanticNodeData semanticNodeData = this.nodesById.get(Integer.valueOf(id));
        if (semanticNodeData == null) {
            return false;
        }
        List<Integer> listChildIds = childIds(semanticNodeData.getParentId());
        if (!listChildIds.contains(Integer.valueOf(id))) {
            return false;
        }
        int parentId = semanticNodeData.getParentId();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listChildIds) {
            if (((Number) obj).intValue() != id) {
                arrayList.add(obj);
            }
        }
        replaceChildIds(parentId, arrayList);
        return true;
    }

    private final List<Integer> immutableIds(Collection<Integer> ids) {
        return ids.isEmpty() ? z6x.a : Collections.unmodifiableList(new ArrayList(ids));
    }

    private final boolean relocate(int id, int parentId, int siblingIndex) {
        SemanticNodeData semanticNodeData = this.nodesById.get(Integer.valueOf(id));
        if (semanticNodeData == null) {
            return false;
        }
        int i = (parentId < 0 || !this.nodesById.containsKey(Integer.valueOf(parentId))) ? -1 : parentId;
        int parentId2 = semanticNodeData.getParentId();
        if (parentId2 != i) {
            detach(id);
        }
        List<Integer> listChildIds = childIds(i);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listChildIds) {
            if (((Number) obj).intValue() != id) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(yoi1.p(siblingIndex, 0, arrayList2.size()), Integer.valueOf(id));
        boolean zJ = u890.j(listChildIds, arrayList2);
        if (!zJ) {
            replaceChildIds(i, arrayList2);
        }
        boolean z = parentId2 != i;
        if (z) {
            Integer numValueOf = Integer.valueOf(id);
            Map<Integer, SemanticNodeData> map = this.nodesById;
            SemanticNodeData semanticNodeData2 = (SemanticNodeData) sqg0.G(Integer.valueOf(id), map);
            map.put(numValueOf, semanticNodeData2.copy((16381 & 1) != 0 ? semanticNodeData2.id : 0, (16381 & 2) != 0 ? semanticNodeData2.parentId : i, (16381 & 4) != 0 ? semanticNodeData2.role : 0, (16381 & 8) != 0 ? semanticNodeData2.label : null, (16381 & 16) != 0 ? semanticNodeData2.value : null, (16381 & 32) != 0 ? semanticNodeData2.hint : null, (16381 & 64) != 0 ? semanticNodeData2.stateFlags : 0, (16381 & SemanticState.Focused) != 0 ? semanticNodeData2.traitFlags : 0, (16381 & SemanticState.Hidden) != 0 ? semanticNodeData2.headingLevel : 0, (16381 & 512) != 0 ? semanticNodeData2.minX : 0.0f, (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData2.minY : 0.0f, (16381 & SemanticState.Modal) != 0 ? semanticNodeData2.maxX : 0.0f, (16381 & SemanticState.Obscured) != 0 ? semanticNodeData2.maxY : 0.0f, (16381 & SemanticState.Multiline) != 0 ? semanticNodeData2.children : null));
        }
        return (z || !zJ) ? true : 0;
    }

    private final void removeSubtree(int id) {
        SemanticNodeData semanticNodeData = this.nodesById.get(Integer.valueOf(id));
        if (semanticNodeData == null) {
            return;
        }
        Iterator<Integer> it = semanticNodeData.getChildren().iterator();
        while (it.hasNext()) {
            removeSubtree(it.next().intValue());
        }
        detach(id);
        this.nodesById.remove(Integer.valueOf(id));
    }

    private final void replaceChildIds(int parentId, Collection<Integer> children) {
        List<Integer> listImmutableIds = immutableIds(children);
        if (parentId < 0) {
            this.rootIds = listImmutableIds;
            return;
        }
        SemanticNodeData semanticNodeData = this.nodesById.get(Integer.valueOf(parentId));
        if (semanticNodeData == null) {
            return;
        }
        this.nodesById.put(Integer.valueOf(parentId), semanticNodeData.copy((16381 & 1) != 0 ? semanticNodeData.id : 0, (16381 & 2) != 0 ? semanticNodeData.parentId : 0, (16381 & 4) != 0 ? semanticNodeData.role : 0, (16381 & 8) != 0 ? semanticNodeData.label : null, (16381 & 16) != 0 ? semanticNodeData.value : null, (16381 & 32) != 0 ? semanticNodeData.hint : null, (16381 & 64) != 0 ? semanticNodeData.stateFlags : 0, (16381 & SemanticState.Focused) != 0 ? semanticNodeData.traitFlags : 0, (16381 & SemanticState.Hidden) != 0 ? semanticNodeData.headingLevel : 0, (16381 & 512) != 0 ? semanticNodeData.minX : 0.0f, (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData.minY : 0.0f, (16381 & SemanticState.Modal) != 0 ? semanticNodeData.maxX : 0.0f, (16381 & SemanticState.Obscured) != 0 ? semanticNodeData.maxY : 0.0f, (16381 & SemanticState.Multiline) != 0 ? semanticNodeData.children : listImmutableIds));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f5  */
    public final void applyDiff$kotlin_release(SemanticsDiff diff) {
        if (diff.isEmpty()) {
            return;
        }
        boolean z = false;
        for (int i : diff.getRemoved()) {
            if (this.nodesById.containsKey(Integer.valueOf(i))) {
                removeSubtree(i);
                z = true;
            }
        }
        for (SemanticsDiffNode semanticsDiffNode : diff.getAdded()) {
            SemanticNodeData semanticNodeData = this.nodesById.get(Integer.valueOf(semanticsDiffNode.getId()));
            if (semanticNodeData == null) {
                this.nodesById.put(Integer.valueOf(semanticsDiffNode.getId()), new SemanticNodeData(semanticsDiffNode.getId(), -1, semanticsDiffNode.getRole(), semanticsDiffNode.getLabel(), semanticsDiffNode.getValue(), semanticsDiffNode.getHint(), semanticsDiffNode.getStateFlags(), semanticsDiffNode.getTraitFlags(), semanticsDiffNode.getHeadingLevel(), semanticsDiffNode.getMinX(), semanticsDiffNode.getMinY(), semanticsDiffNode.getMaxX(), semanticsDiffNode.getMaxY(), null, SemanticState.Multiline, null));
            } else {
                SemanticNodeData semanticNodeDataCopy = semanticNodeData.copy((16381 & 1) != 0 ? semanticNodeData.id : 0, (16381 & 2) != 0 ? semanticNodeData.parentId : 0, (16381 & 4) != 0 ? semanticNodeData.role : semanticsDiffNode.getRole(), (16381 & 8) != 0 ? semanticNodeData.label : semanticsDiffNode.getLabel(), (16381 & 16) != 0 ? semanticNodeData.value : semanticsDiffNode.getValue(), (16381 & 32) != 0 ? semanticNodeData.hint : semanticsDiffNode.getHint(), (16381 & 64) != 0 ? semanticNodeData.stateFlags : semanticsDiffNode.getStateFlags(), (16381 & SemanticState.Focused) != 0 ? semanticNodeData.traitFlags : semanticsDiffNode.getTraitFlags(), (16381 & SemanticState.Hidden) != 0 ? semanticNodeData.headingLevel : semanticsDiffNode.getHeadingLevel(), (16381 & 512) != 0 ? semanticNodeData.minX : semanticsDiffNode.getMinX(), (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData.minY : semanticsDiffNode.getMinY(), (16381 & SemanticState.Modal) != 0 ? semanticNodeData.maxX : semanticsDiffNode.getMaxX(), (16381 & SemanticState.Obscured) != 0 ? semanticNodeData.maxY : semanticsDiffNode.getMaxY(), (16381 & SemanticState.Multiline) != 0 ? semanticNodeData.children : null);
                if (!semanticNodeData.equals(semanticNodeDataCopy)) {
                    this.nodesById.put(Integer.valueOf(semanticsDiffNode.getId()), semanticNodeDataCopy);
                }
                if (!relocate(semanticsDiffNode.getId(), semanticsDiffNode.getParentId(), semanticsDiffNode.getSiblingIndex()) || z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            z = true;
            if (relocate(semanticsDiffNode.getId(), semanticsDiffNode.getParentId(), semanticsDiffNode.getSiblingIndex())) {
                z = true;
            } else {
                z = true;
            }
        }
        for (SemanticsDiffNode semanticsDiffNode2 : diff.getMoved()) {
            SemanticNodeData semanticNodeData2 = this.nodesById.get(Integer.valueOf(semanticsDiffNode2.getId()));
            if (semanticNodeData2 != null) {
                SemanticNodeData semanticNodeDataCopy2 = semanticNodeData2.copy((16381 & 1) != 0 ? semanticNodeData2.id : 0, (16381 & 2) != 0 ? semanticNodeData2.parentId : 0, (16381 & 4) != 0 ? semanticNodeData2.role : 0, (16381 & 8) != 0 ? semanticNodeData2.label : null, (16381 & 16) != 0 ? semanticNodeData2.value : null, (16381 & 32) != 0 ? semanticNodeData2.hint : null, (16381 & 64) != 0 ? semanticNodeData2.stateFlags : 0, (16381 & SemanticState.Focused) != 0 ? semanticNodeData2.traitFlags : 0, (16381 & SemanticState.Hidden) != 0 ? semanticNodeData2.headingLevel : 0, (16381 & 512) != 0 ? semanticNodeData2.minX : semanticsDiffNode2.getMinX(), (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData2.minY : semanticsDiffNode2.getMinY(), (16381 & SemanticState.Modal) != 0 ? semanticNodeData2.maxX : semanticsDiffNode2.getMaxX(), (16381 & SemanticState.Obscured) != 0 ? semanticNodeData2.maxY : semanticsDiffNode2.getMaxY(), (16381 & SemanticState.Multiline) != 0 ? semanticNodeData2.children : null);
                if (!semanticNodeData2.equals(semanticNodeDataCopy2)) {
                    this.nodesById.put(Integer.valueOf(semanticsDiffNode2.getId()), semanticNodeDataCopy2);
                }
                relocate(semanticsDiffNode2.getId(), semanticsDiffNode2.getParentId(), semanticsDiffNode2.getSiblingIndex());
                z = true;
            }
        }
        for (SemanticsChildrenUpdate semanticsChildrenUpdate : diff.getChildrenUpdated()) {
            if (semanticsChildrenUpdate.getParentId() < 0) {
                int[] childIds = semanticsChildrenUpdate.getChildIds();
                Collection<Integer> arrayList = new ArrayList<>();
                for (int i2 : childIds) {
                    if (this.nodesById.containsKey(Integer.valueOf(i2))) {
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                if (!u890.j(this.rootIds, arrayList)) {
                    replaceChildIds(-1, arrayList);
                    Iterator<Integer> it = this.rootIds.iterator();
                    while (it.hasNext()) {
                        int iIntValue = it.next().intValue();
                        SemanticNodeData semanticNodeData3 = this.nodesById.get(Integer.valueOf(iIntValue));
                        if (semanticNodeData3 != null && semanticNodeData3.getParentId() >= 0) {
                            this.nodesById.put(Integer.valueOf(iIntValue), semanticNodeData3.copy((16381 & 1) != 0 ? semanticNodeData3.id : 0, (16381 & 2) != 0 ? semanticNodeData3.parentId : -1, (16381 & 4) != 0 ? semanticNodeData3.role : 0, (16381 & 8) != 0 ? semanticNodeData3.label : null, (16381 & 16) != 0 ? semanticNodeData3.value : null, (16381 & 32) != 0 ? semanticNodeData3.hint : null, (16381 & 64) != 0 ? semanticNodeData3.stateFlags : 0, (16381 & SemanticState.Focused) != 0 ? semanticNodeData3.traitFlags : 0, (16381 & SemanticState.Hidden) != 0 ? semanticNodeData3.headingLevel : 0, (16381 & 512) != 0 ? semanticNodeData3.minX : 0.0f, (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData3.minY : 0.0f, (16381 & SemanticState.Modal) != 0 ? semanticNodeData3.maxX : 0.0f, (16381 & SemanticState.Obscured) != 0 ? semanticNodeData3.maxY : 0.0f, (16381 & SemanticState.Multiline) != 0 ? semanticNodeData3.children : null));
                        }
                    }
                    z = true;
                }
            } else {
                SemanticNodeData semanticNodeData4 = this.nodesById.get(Integer.valueOf(semanticsChildrenUpdate.getParentId()));
                if (semanticNodeData4 != null) {
                    int[] childIds2 = semanticsChildrenUpdate.getChildIds();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 : childIds2) {
                        if (this.nodesById.containsKey(Integer.valueOf(i3))) {
                            arrayList2.add(Integer.valueOf(i3));
                        }
                    }
                    if (!u890.j(semanticNodeData4.getChildren(), arrayList2)) {
                        replaceChildIds(semanticsChildrenUpdate.getParentId(), arrayList2);
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            int iIntValue2 = ((Number) it2.next()).intValue();
                            SemanticNodeData semanticNodeData5 = this.nodesById.get(Integer.valueOf(iIntValue2));
                            if (semanticNodeData5 != null && semanticNodeData5.getParentId() != semanticsChildrenUpdate.getParentId()) {
                                this.nodesById.put(Integer.valueOf(iIntValue2), semanticNodeData5.copy((16381 & 1) != 0 ? semanticNodeData5.id : 0, (16381 & 2) != 0 ? semanticNodeData5.parentId : semanticsChildrenUpdate.getParentId(), (16381 & 4) != 0 ? semanticNodeData5.role : 0, (16381 & 8) != 0 ? semanticNodeData5.label : null, (16381 & 16) != 0 ? semanticNodeData5.value : null, (16381 & 32) != 0 ? semanticNodeData5.hint : null, (16381 & 64) != 0 ? semanticNodeData5.stateFlags : 0, (16381 & SemanticState.Focused) != 0 ? semanticNodeData5.traitFlags : 0, (16381 & SemanticState.Hidden) != 0 ? semanticNodeData5.headingLevel : 0, (16381 & 512) != 0 ? semanticNodeData5.minX : 0.0f, (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData5.minY : 0.0f, (16381 & SemanticState.Modal) != 0 ? semanticNodeData5.maxX : 0.0f, (16381 & SemanticState.Obscured) != 0 ? semanticNodeData5.maxY : 0.0f, (16381 & SemanticState.Multiline) != 0 ? semanticNodeData5.children : null));
                            }
                        }
                        z = true;
                    }
                }
            }
        }
        for (SemanticsDiffNode semanticsDiffNode3 : diff.getUpdatedSemantic()) {
            SemanticNodeData semanticNodeData6 = this.nodesById.get(Integer.valueOf(semanticsDiffNode3.getId()));
            if (semanticNodeData6 != null && (semanticNodeData6.getRole() != semanticsDiffNode3.getRole() || !u890.j(semanticNodeData6.getLabel(), semanticsDiffNode3.getLabel()) || !u890.j(semanticNodeData6.getValue(), semanticsDiffNode3.getValue()) || !u890.j(semanticNodeData6.getHint(), semanticsDiffNode3.getHint()) || semanticNodeData6.getStateFlags() != semanticsDiffNode3.getStateFlags() || semanticNodeData6.getTraitFlags() != semanticsDiffNode3.getTraitFlags() || semanticNodeData6.getHeadingLevel() != semanticsDiffNode3.getHeadingLevel())) {
                this.nodesById.put(Integer.valueOf(semanticsDiffNode3.getId()), semanticNodeData6.copy((16381 & 1) != 0 ? semanticNodeData6.id : 0, (16381 & 2) != 0 ? semanticNodeData6.parentId : 0, (16381 & 4) != 0 ? semanticNodeData6.role : semanticsDiffNode3.getRole(), (16381 & 8) != 0 ? semanticNodeData6.label : semanticsDiffNode3.getLabel(), (16381 & 16) != 0 ? semanticNodeData6.value : semanticsDiffNode3.getValue(), (16381 & 32) != 0 ? semanticNodeData6.hint : semanticsDiffNode3.getHint(), (16381 & 64) != 0 ? semanticNodeData6.stateFlags : semanticsDiffNode3.getStateFlags(), (16381 & SemanticState.Focused) != 0 ? semanticNodeData6.traitFlags : semanticsDiffNode3.getTraitFlags(), (16381 & SemanticState.Hidden) != 0 ? semanticNodeData6.headingLevel : semanticsDiffNode3.getHeadingLevel(), (16381 & 512) != 0 ? semanticNodeData6.minX : 0.0f, (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData6.minY : 0.0f, (16381 & SemanticState.Modal) != 0 ? semanticNodeData6.maxX : 0.0f, (16381 & SemanticState.Obscured) != 0 ? semanticNodeData6.maxY : 0.0f, (16381 & SemanticState.Multiline) != 0 ? semanticNodeData6.children : null));
                z = true;
            }
        }
        for (SemanticsBoundsUpdate semanticsBoundsUpdate : diff.getUpdatedGeometry()) {
            SemanticNodeData semanticNodeData7 = this.nodesById.get(Integer.valueOf(semanticsBoundsUpdate.getId()));
            if (semanticNodeData7 != null && (semanticNodeData7.getMinX() != semanticsBoundsUpdate.getMinX() || semanticNodeData7.getMinY() != semanticsBoundsUpdate.getMinY() || semanticNodeData7.getMaxX() != semanticsBoundsUpdate.getMaxX() || semanticNodeData7.getMaxY() != semanticsBoundsUpdate.getMaxY())) {
                this.nodesById.put(Integer.valueOf(semanticsBoundsUpdate.getId()), semanticNodeData7.copy((16381 & 1) != 0 ? semanticNodeData7.id : 0, (16381 & 2) != 0 ? semanticNodeData7.parentId : 0, (16381 & 4) != 0 ? semanticNodeData7.role : 0, (16381 & 8) != 0 ? semanticNodeData7.label : null, (16381 & 16) != 0 ? semanticNodeData7.value : null, (16381 & 32) != 0 ? semanticNodeData7.hint : null, (16381 & 64) != 0 ? semanticNodeData7.stateFlags : 0, (16381 & SemanticState.Focused) != 0 ? semanticNodeData7.traitFlags : 0, (16381 & SemanticState.Hidden) != 0 ? semanticNodeData7.headingLevel : 0, (16381 & 512) != 0 ? semanticNodeData7.minX : semanticsBoundsUpdate.getMinX(), (16381 & SemanticState.ReadOnly) != 0 ? semanticNodeData7.minY : semanticsBoundsUpdate.getMinY(), (16381 & SemanticState.Modal) != 0 ? semanticNodeData7.maxX : semanticsBoundsUpdate.getMaxX(), (16381 & SemanticState.Obscured) != 0 ? semanticNodeData7.maxY : semanticsBoundsUpdate.getMaxY(), (16381 & SemanticState.Multiline) != 0 ? semanticNodeData7.children : null));
                z = true;
            }
        }
        if (z) {
            bpb1 bpb1Var = this._versionFlow;
            bpb1Var.m((Object) null, Integer.valueOf(((Number) bpb1Var.getValue()).intValue() + 1));
        }
    }

    public final void clear$kotlin_release() {
        if (this.nodesById.isEmpty() && this.rootIds.isEmpty()) {
            return;
        }
        this.nodesById.clear();
        this.rootIds = z6x.a;
        bpb1 bpb1Var = this._versionFlow;
        bpb1Var.m((Object) null, Integer.valueOf(((Number) bpb1Var.getValue()).intValue() + 1));
    }

    public final int getNodeCount() {
        return this.nodesById.size();
    }

    public final List<Integer> getRoots() {
        return this.rootIds;
    }

    public final int getVersion() {
        return ((Number) this._versionFlow.getValue()).intValue();
    }

    public final zob1 getVersionFlow() {
        return this.versionFlow;
    }

    public final SemanticNodeData nodeById(int id) {
        return this.nodesById.get(Integer.valueOf(id));
    }
}

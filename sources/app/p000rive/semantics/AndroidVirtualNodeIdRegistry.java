package app.p000rive.semantics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.o7h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lapp/rive/semantics/AndroidVirtualNodeIdRegistry;", "", "Lapp/rive/semantics/AndroidVirtualNodeIdAllocator;", "allocator", "<init>", "(Lapp/rive/semantics/AndroidVirtualNodeIdAllocator;)V", "Lapp/rive/semantics/ProjectedSemanticHierarchy;", "hierarchy", "Lp/rih1;", "reconcile", "(Lapp/rive/semantics/ProjectedSemanticHierarchy;)V", "", "", "activeRiveNodeIds", "(Ljava/util/Collection;)V", "riveNodeId", "virtualIdForRiveNode", "(I)Ljava/lang/Integer;", "virtualNodeId", "riveNodeIdForVirtualNode", "clear", "()V", "Lapp/rive/semantics/AndroidVirtualNodeIdAllocator;", "", "virtualIdsByRiveId", "Ljava/util/Map;", "riveIdsByVirtualId", "getSize", "()I", "size", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidVirtualNodeIdRegistry {
    public static final int $stable = 8;
    private final AndroidVirtualNodeIdAllocator allocator;
    private final Map<Integer, Integer> riveIdsByVirtualId;
    private final Map<Integer, Integer> virtualIdsByRiveId;

    public AndroidVirtualNodeIdRegistry(AndroidVirtualNodeIdAllocator androidVirtualNodeIdAllocator) {
        this.allocator = androidVirtualNodeIdAllocator;
        this.virtualIdsByRiveId = new LinkedHashMap();
        this.riveIdsByVirtualId = new LinkedHashMap();
    }

    public final void clear() {
        this.virtualIdsByRiveId.clear();
        this.riveIdsByVirtualId.clear();
    }

    public final int getSize() {
        return this.virtualIdsByRiveId.size();
    }

    public final void reconcile(Collection<Integer> activeRiveNodeIds) {
        Set setP1 = o7h.p1(activeRiveNodeIds);
        Set<Integer> setKeySet = this.virtualIdsByRiveId.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (!setP1.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer numRemove = this.virtualIdsByRiveId.remove(Integer.valueOf(((Number) it.next()).intValue()));
            if (numRemove != null) {
                this.riveIdsByVirtualId.remove(numRemove);
            }
        }
        Iterator<Integer> it2 = activeRiveNodeIds.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (!this.virtualIdsByRiveId.containsKey(Integer.valueOf(iIntValue))) {
                int iAllocate = this.allocator.allocate();
                this.virtualIdsByRiveId.put(Integer.valueOf(iIntValue), Integer.valueOf(iAllocate));
                this.riveIdsByVirtualId.put(Integer.valueOf(iAllocate), Integer.valueOf(iIntValue));
            }
        }
    }

    public final Integer riveNodeIdForVirtualNode(int virtualNodeId) {
        return this.riveIdsByVirtualId.get(Integer.valueOf(virtualNodeId));
    }

    public final Integer virtualIdForRiveNode(int riveNodeId) {
        return this.virtualIdsByRiveId.get(Integer.valueOf(riveNodeId));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AndroidVirtualNodeIdRegistry() {
        AndroidVirtualNodeIdAllocator androidVirtualNodeIdAllocator = null;
        this(androidVirtualNodeIdAllocator, 1, androidVirtualNodeIdAllocator);
    }

    public /* synthetic */ AndroidVirtualNodeIdRegistry(AndroidVirtualNodeIdAllocator androidVirtualNodeIdAllocator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AndroidVirtualNodeIdAllocator() : androidVirtualNodeIdAllocator);
    }

    public final void reconcile(ProjectedSemanticHierarchy hierarchy) {
        reconcile(hierarchy.getActiveNodeIds());
    }
}

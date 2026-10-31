package p;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class v7 extends q7 implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ gwm0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(gwm0 gwm0Var, SortedMap sortedMap) {
        super(gwm0Var, sortedMap, (byte) 0);
        this.g = gwm0Var;
    }

    public SortedSet b() {
        return new w7(this.g, d());
    }

    @Override // p.q7, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new v7(this.g, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new v7(this.g, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new v7(this.g, d().tailMap(obj));
    }
}

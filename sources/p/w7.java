package p;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class w7 extends r7 implements SortedSet {
    public final /* synthetic */ gwm0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(gwm0 gwm0Var, SortedMap sortedMap) {
        super(gwm0Var, sortedMap);
        this.d = gwm0Var;
    }

    public SortedMap b() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new w7(this.d, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new w7(this.d, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new w7(this.d, b().tailMap(obj));
    }
}

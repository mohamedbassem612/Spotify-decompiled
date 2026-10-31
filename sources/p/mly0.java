package p;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mly0 extends m7 {
    public final Map b;
    public final Map c;
    public final LinkedHashSet d;
    public final LinkedHashMap e = new LinkedHashMap();

    public mly0(Map map, Map map2) {
        this.b = map;
        this.c = map2;
        this.d = dm61.y0(map2.keySet(), map.keySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Set a() {
        LinkedHashSet<Class> linkedHashSet = this.d;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashSet.size());
        for (Class cls : linkedHashSet) {
            linkedHashSet2.add(new AbstractMap.SimpleImmutableEntry(cls, sqg0.G(cls, this)));
        }
        return linkedHashSet2;
    }

    public final Set b() {
        return this.d;
    }

    public final int c() {
        return this.d.size();
    }

    public final boolean containsKey(Object obj) {
        if (!(obj instanceof Class)) {
            return false;
        }
        Class cls = (Class) obj;
        return this.b.containsKey(cls) || this.c.containsKey(cls);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof ebr0) {
            return super.containsValue((ebr0) obj);
        }
        return false;
    }

    public final Object get(Object obj) {
        ebr0 ebr0Var;
        if (!(obj instanceof Class)) {
            return null;
        }
        Class cls = (Class) obj;
        kly0 kly0Var = (kly0) this.b.get(cls);
        if (kly0Var == null) {
            return (ebr0) this.c.get(cls);
        }
        synchronized (this.e) {
            ebr0Var = (ebr0) this.e.get(cls);
            if (ebr0Var == null) {
                ebr0Var = (ebr0) kly0Var.get();
                this.e.put(cls, ebr0Var);
            }
        }
        return ebr0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof Class) ? obj2 : (ebr0) super/*java.util.Map*/.getOrDefault((Class) obj, (ebr0) obj2);
    }
}

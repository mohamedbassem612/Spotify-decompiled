package p;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mng0 implements Map {
    public final nng0 a;
    public final LinkedHashMap b;

    public mng0(nng0 nng0Var, LinkedHashMap linkedHashMap) {
        this.a = nng0Var;
        this.b = linkedHashMap;
    }

    @Override // java.util.Map
    public final void clear() {
        this.a.c();
        this.b.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new lng0(this.a, this.b.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.b.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new lng0(this.a, this.b.keySet());
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.a.c();
        Charset charset = l290.a;
        obj.getClass();
        obj2.getClass();
        return this.b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.a.c();
        for (Object obj : map.keySet()) {
            Charset charset = l290.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        this.b.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        this.a.c();
        return this.b.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.b.size();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return new jng0(this.a, this.b.values());
    }
}

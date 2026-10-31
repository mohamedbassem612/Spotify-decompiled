package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class j380 implements Map, Serializable {
    public transient t380 a;
    public transient t380 b;
    public transient q280 c;

    public static h380 a() {
        return new h380(4);
    }

    public static h380 b(int i) {
        n3p1.j(i, "expectedSize");
        return new h380(i);
    }

    public static j380 c(Map map) {
        if ((map instanceof j380) && !(map instanceof SortedMap)) {
            j380 j380Var = (j380) map;
            if (!j380Var.h()) {
                return j380Var;
            }
        }
        Set setEntrySet = map.entrySet();
        h380 h380Var = new h380(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        h380Var.f(setEntrySet);
        return h380Var.b(true);
    }

    public static gg11 j(Serializable serializable, Object obj, Serializable serializable2, Object obj2, Serializable serializable3, Object obj3) {
        n3p1.i(serializable2, obj2);
        return gg11.p(3, new Object[]{serializable, obj, serializable2, obj2, serializable3, obj3}, null);
    }

    public static gg11 k(Serializable serializable, Object obj, Serializable serializable2, Object obj2, Serializable serializable3, Object obj3, Serializable serializable4, Object obj4, Serializable serializable5, Object obj5) {
        return gg11.p(5, new Object[]{serializable, obj, serializable2, obj2, serializable3, obj3, serializable4, obj4, serializable5, obj5}, null);
    }

    public static gg11 l(Object obj, Object obj2) {
        n3p1.i(obj, obj2);
        return gg11.p(1, new Object[]{obj, obj2}, null);
    }

    public static gg11 m(Object obj, Object obj2, Object obj3, Object obj4) {
        n3p1.i(obj, obj2);
        n3p1.i(obj3, obj4);
        return gg11.p(2, new Object[]{obj, obj2, obj3, obj4}, null);
    }

    public static gg11 n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        n3p1.i(obj, obj2);
        n3p1.i(obj3, obj4);
        n3p1.i(obj5, obj6);
        n3p1.i(obj7, obj8);
        return gg11.p(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract t380 d();

    public abstract t380 e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return mno1.l(obj, this);
    }

    public q280 f() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public t380 entrySet() {
        t380 t380Var = this.a;
        if (t380Var != null) {
            return t380Var;
        }
        t380 t380VarD = d();
        this.a = t380VarD;
        return t380VarD;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public boolean h() {
        return false;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zqo1.q(entrySet());
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public t380 keySet() {
        t380 t380Var = this.b;
        if (t380Var != null) {
            return t380Var;
        }
        t380 t380VarE = e();
        this.b = t380VarE;
        return t380VarE;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public q280 values() {
        q280 q280Var = this.c;
        if (q280Var != null) {
            return q280Var;
        }
        q280 q280VarF = f();
        this.c = q280VarF;
        return q280VarF;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return mno1.B(this);
    }

    public Object writeReplace() {
        return new i380(this);
    }
}

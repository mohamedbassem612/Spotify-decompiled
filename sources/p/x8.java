package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class x8 {
    public transient Collection a;
    public transient Set b;
    public transient Collection c;
    public transient Map d;

    public Map a() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map mapE = e();
        this.d = mapE;
        return mapE;
    }

    public void b() {
        throw new UnsupportedOperationException();
    }

    public final boolean c(Object obj, Object obj2) {
        Collection collection = (Collection) a().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean d(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Map e() {
        throw new AssertionError("should never be called");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x8) {
            return a().equals(((x8) obj).a());
        }
        return false;
    }

    public Collection f() {
        return this instanceof zt50 ? new w8(this, (byte) 0) : new v8((Object) this, (byte) 0);
    }

    public Set g() {
        throw new AssertionError("unreachable");
    }

    public Collection h() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection collectionF = f();
        this.a = collectionF;
        return collectionF;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public abstract Iterator i();

    public abstract Collection j(Object obj);

    public Set k() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setG = g();
        this.b = setG;
        return setG;
    }

    public boolean l(Object obj, Object obj2) {
        Collection collection = (Collection) a().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public abstract int m();

    public final String toString() {
        return a().toString();
    }
}

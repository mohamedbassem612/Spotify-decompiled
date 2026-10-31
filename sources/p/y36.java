package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y36 extends jv81 implements Map {
    public e2p1 d;
    public t36 e;
    public v36 f;

    @Override // java.util.Map
    public final Set entrySet() {
        e2p1 e2p1Var = this.d;
        if (e2p1Var != null) {
            return e2p1Var;
        }
        e2p1 e2p1Var2 = new e2p1(this, (byte) 2);
        this.d = e2p1Var2;
        return e2p1Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        t36 t36Var = this.e;
        if (t36Var != null) {
            return t36Var;
        }
        t36 t36Var2 = new t36(this);
        this.e = t36Var2;
        return t36Var2;
    }

    public final boolean l(Collection collection) {
        int i = this.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(f(i2))) {
                g(i2);
            }
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        v36 v36Var = this.f;
        if (v36Var != null) {
            return v36Var;
        }
        v36 v36Var2 = new v36(this);
        this.f = v36Var2;
        return v36Var2;
    }
}

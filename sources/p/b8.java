package p;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class b8 extends x8 implements Serializable {
    public transient Map e;
    public transient int f;

    public b8(Map map) {
        dm5.m(map.isEmpty());
        this.e = map;
    }

    @Override // p.x8
    public final void b() {
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.e.clear();
        this.f = 0;
    }

    @Override // p.x8
    public Map e() {
        return new q7(this, this.e, (byte) 0);
    }

    @Override // p.x8
    public Set g() {
        return new r7(this, this.e);
    }

    @Override // p.x8
    public Collection h() {
        return super.h();
    }

    @Override // p.x8
    public final Iterator i() {
        return new n7(this, (byte) 1);
    }

    @Override // p.x8
    public Collection j(Object obj) {
        Collection collectionN = (Collection) this.e.get(obj);
        if (collectionN == null) {
            collectionN = n();
        }
        return q(obj, collectionN);
    }

    @Override // p.x8
    public final int m() {
        return this.f;
    }

    public abstract Collection n();

    public boolean o(Object obj, Object obj2) {
        Collection collection = (Collection) this.e.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f++;
            return true;
        }
        Collection collectionN = n();
        if (!collectionN.add(obj2)) {
            eg.f("New Collection violated the Collection spec");
            return false;
        }
        this.f++;
        this.e.put(obj, collectionN);
        return true;
    }

    public final void p(Map map) {
        this.e = map;
        this.f = 0;
        for (Collection collection : map.values()) {
            dm5.m(!collection.isEmpty());
            this.f = collection.size() + this.f;
        }
    }

    public Collection q(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new u7(this, obj, list, null) : new z7(this, obj, list, null);
    }
}

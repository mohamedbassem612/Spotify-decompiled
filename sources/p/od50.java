package p;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class od50 extends AbstractList {
    public static final AtomicInteger d = new AtomicInteger();
    public Handler a;
    public final ArrayList b;
    public final ArrayList c;

    public od50(md50... md50VarArr) {
        d.incrementAndGet();
        this.c = new ArrayList();
        this.b = new ArrayList(f46.H(md50VarArr));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        return this.b.add((md50) obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof md50) {
            return super.contains((md50) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (md50) this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof md50) {
            return super.indexOf((md50) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof md50) {
            return super.lastIndexOf((md50) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof md50) {
            return super.remove((md50) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return (md50) this.b.set(i, (md50) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.b.add(i, (md50) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return (md50) this.b.remove(i);
    }

    public od50(Collection collection) {
        d.incrementAndGet();
        this.c = new ArrayList();
        this.b = new ArrayList(collection);
    }
}

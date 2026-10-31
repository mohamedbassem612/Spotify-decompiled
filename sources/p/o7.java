package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o7 extends cm61 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ AbstractMap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7(AbstractMap abstractMap, byte b) {
        super((byte) 0);
        this.b = b;
        this.c = abstractMap;
    }

    public final boolean b(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map mapC = c();
        mapC.getClass();
        try {
            obj2 = mapC.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (zno1.k(obj2, entry.getValue())) {
            return obj2 != null || c().containsKey(key);
        }
        return false;
    }

    public final Map c() {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (q7) abstractMap;
            default:
                return (qqg0) abstractMap;
        }
    }

    @Override // p.cm61, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        c().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Set setEntrySet = ((q7) this.c).b.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return b(obj);
        }
    }

    public final boolean d(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return c().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return c().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new p7((q7) abstractMap);
            default:
                qqg0 qqg0Var = (qqg0) abstractMap;
                return new bo90(qqg0Var.a.entrySet().iterator(), new nqg0(qqg0Var.b));
        }
    }

    @Override // p.cm61, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object objRemove;
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                b8 b8Var = (b8) ((q7) this.c).e;
                Object key = entry.getKey();
                Map map = b8Var.e;
                map.getClass();
                try {
                    objRemove = map.remove(key);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    objRemove = null;
                }
                Collection collection = (Collection) objRemove;
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    b8Var.f -= size;
                }
                return true;
            default:
                return d(obj);
        }
    }

    @Override // p.cm61, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return zqo1.u(this, collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // p.cm61, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(mno1.k(collection.size()));
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return c().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return c().size();
    }
}

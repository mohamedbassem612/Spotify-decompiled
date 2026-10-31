package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ucn1 extends cm61 {
    public final /* synthetic */ byte b = 1;
    public final Map c;

    public ucn1(mkn1 mkn1Var, Map map) {
        super((byte) 2);
        map.getClass();
        this.c = map;
    }

    @Override // p.cm61, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((q7) this.c).clear();
                break;
            default:
                Iterator it = iterator();
                while (true) {
                    kng0 kng0Var = (kng0) it;
                    if (kng0Var.hasNext()) {
                        kng0Var.next();
                        kng0Var.remove();
                    }
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.b;
        Map map = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Set setEntrySet = ((q7) map).b.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return map.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.b) {
            case 1:
                return this.c.keySet().containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        switch (this.b) {
            case 1:
                return this == obj || this.c.keySet().equals(obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.b) {
            case 1:
                return this.c.keySet().hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        byte b = this.b;
        Map map = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((q7) map).isEmpty();
            default:
                return map.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.b;
        Map map = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new p7((q7) map, (byte) 0);
            default:
                return new kng0(this, map.entrySet().iterator());
        }
    }

    @Override // p.cm61, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        byte b = this.b;
        Map map = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                Object key = entry.getKey();
                rpn1 rpn1Var = ((mkn1) ((q7) map).e).c;
                rpn1Var.getClass();
                try {
                    objRemove = rpn1Var.remove(key);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    objRemove = null;
                }
                Collection collection = (Collection) objRemove;
                if (collection != null) {
                    collection.size();
                    collection.clear();
                }
                return true;
            default:
                Collection collection2 = (Collection) map.remove(obj);
                if (collection2 == null) {
                    return false;
                }
                int size = collection2.size();
                collection2.clear();
                return size > 0;
        }
    }

    @Override // p.cm61, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                try {
                    if (collection != null) {
                        return dgo1.x(this, collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    Iterator it = collection.iterator();
                    boolean zRemove = false;
                    while (it.hasNext()) {
                        zRemove |= remove(it.next());
                    }
                    return zRemove;
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // p.cm61, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        int iCeil;
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    int size = collection.size();
                    if (size >= 3) {
                        iCeil = size < 1073741824 ? (int) Math.ceil(((double) size) / 0.75d) : Integer.MAX_VALUE;
                    } else {
                        if (size < 0) {
                            hhg1.n(f4i1.c(size, "expectedSize cannot be negative but was: "));
                            return false;
                        }
                        iCeil = size + 1;
                    }
                    HashSet hashSet = new HashSet(iCeil);
                    for (Object obj : collection) {
                        if (contains(obj) && (obj instanceof Map.Entry)) {
                            hashSet.add(((Map.Entry) obj).getKey());
                        }
                    }
                    mkn1 mkn1Var = (mkn1) ((q7) this.c).e;
                    ucn1 ucn1Var = mkn1Var.a;
                    if (ucn1Var == null) {
                        ucn1Var = new ucn1(mkn1Var, mkn1Var.c);
                        mkn1Var.a = ucn1Var;
                    }
                    return ucn1Var.retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.b;
        Map map = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((q7) map).b.size();
            default:
                return map.size();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucn1(q7 q7Var) {
        super((byte) 2);
        this.c = q7Var;
    }
}

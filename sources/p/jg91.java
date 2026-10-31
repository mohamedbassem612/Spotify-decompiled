package p;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jg91 extends AbstractMap {
    public static final /* synthetic */ int g = 0;
    public final byte a;
    public List b = Collections.EMPTY_LIST;
    public Map c;
    public boolean d;
    public volatile rg91 e;
    public Map f;

    /* JADX WARN: Multi-variable type inference failed */
    public jg91(int i) {
        this.a = i;
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.b.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((pg91) this.b.get(i3)).a);
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((pg91) this.b.get(i4)).a);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((pg91) this.b.get(i3)).a);
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final void b() {
        if (this.d) {
            k220.c();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.c.isEmpty() ? gho1.b : this.c.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new rg91(this, (byte) 2);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg91)) {
            return super.equals(obj);
        }
        jg91 jg91Var = (jg91) obj;
        int size = size();
        if (size == jg91Var.size()) {
            int size2 = this.b.size();
            if (size2 != jg91Var.b.size()) {
                return ((AbstractSet) entrySet()).equals(jg91Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(jg91Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.c.equals(jg91Var.c);
            }
            return true;
        }
        return false;
    }

    public final Object f(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((pg91) this.b.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.b.isEmpty();
        byte b = this.a;
        if (zIsEmpty && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(b);
        }
        int i = -(iA + 1);
        if (i >= b) {
            return e().put(comparable, obj);
        }
        if (this.b.size() == b) {
            pg91 pg91Var = (pg91) this.b.remove(b - 1);
            e().put(pg91Var.a, pg91Var.getValue());
        }
        this.b.add(i, new pg91(this, comparable, obj));
        return null;
    }

    public final Object g(int i) {
        b();
        Object value = ((pg91) this.b.remove(i)).getValue();
        if (!this.c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            this.b.add(new pg91(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((pg91) this.b.get(iA)).getValue() : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.b.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((pg91) this.b.get(i)).hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        pze0.m(obj);
        return f(null, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return g(iA);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b.size();
    }
}

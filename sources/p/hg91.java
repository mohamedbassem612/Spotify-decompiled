package p;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hg91 extends AbstractMap {
    public static final /* synthetic */ int g = 0;
    public Object[] a;
    public int b;
    public Map c;
    public boolean d;
    public volatile rg91 e;
    public Map f;

    public static hg91 f() {
        hg91 hg91Var = new hg91();
        Map map = Collections.EMPTY_MAP;
        hg91Var.c = map;
        hg91Var.f = map;
        return hg91Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0030 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int i4 = this.b;
        int i5 = i4 - 1;
        if (i5 < 0) {
            i = 0;
            while (i <= i5) {
                i3 = (i + i5) / 2;
                iCompareTo = comparable.compareTo(((ng91) this.a[i3]).a);
                if (iCompareTo < 0) {
                    i5 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((ng91) this.a[i5]).a);
            if (iCompareTo2 > 0) {
                i2 = i4 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i = 0;
                while (i <= i5) {
                    i3 = (i + i5) / 2;
                    iCompareTo = comparable.compareTo(((ng91) this.a[i3]).a);
                    if (iCompareTo < 0) {
                        i5 = i3 - 1;
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

    public final ng91 c(int i) {
        if (i < this.b) {
            return (ng91) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
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

    public final Set d() {
        return this.c.isEmpty() ? Collections.EMPTY_SET : this.c.entrySet();
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
            this.e = new rg91(this, (byte) 0);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg91)) {
            return super.equals(obj);
        }
        hg91 hg91Var = (hg91) obj;
        int size = size();
        if (size == hg91Var.size()) {
            int i = this.b;
            if (i != hg91Var.b) {
                return entrySet().equals(hg91Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (c(i2).equals(hg91Var.c(i2))) {
                }
            }
            if (i != size) {
                return this.c.equals(hg91Var.c);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((ng91) this.a[iA]).setValue(obj);
        }
        b();
        Object[] objArr = this.a;
        if (objArr == null) {
            objArr = new Object[16];
            this.a = objArr;
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        int i2 = this.b;
        if (i2 == 16) {
            ng91 ng91Var = (ng91) objArr[15];
            this.b = i2 - 1;
            e().put(ng91Var.a, ng91Var.b);
        }
        Object[] objArr2 = this.a;
        System.arraycopy(objArr2, i, objArr2, i + 1, (objArr2.length - i) - 1);
        this.a[i] = new ng91(this, comparable, obj);
        this.b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((ng91) this.a[iA]).b : this.c.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object[] objArr = this.a;
        Object obj = ((ng91) objArr[i]).b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new ng91(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.a[i2].hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b;
    }
}

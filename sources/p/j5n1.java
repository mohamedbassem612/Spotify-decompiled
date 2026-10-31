package p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j5n1 extends e5n1 implements Set {
    public static final j5n1 X;
    public static final Object[] t;
    public transient i5n1 g;
    public final transient Object[] h;
    public final transient Object[] i;

    static {
        Object[] objArr = new Object[0];
        t = objArr;
        X = new j5n1(objArr, objArr);
    }

    public j5n1(Object[] objArr, Object[] objArr2) {
        super((byte) 0);
        this.h = objArr;
        this.i = objArr2;
    }

    @Override // p.e5n1
    public final int b(Object[] objArr) {
        System.arraycopy(this.h, 0, objArr, 0, 0);
        return 0;
    }

    @Override // p.e5n1
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // p.e5n1
    public final int d() {
        return 0;
    }

    @Override // p.e5n1
    public final Object[] e() {
        return this.h;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return set.size() == 0 && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i5n1 i5n1Var = this.g;
        if (i5n1Var == null) {
            f5n1 f5n1Var = h5n1.g;
            i5n1Var = i5n1.i;
            this.g = i5n1Var;
        }
        return i5n1Var.q(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}

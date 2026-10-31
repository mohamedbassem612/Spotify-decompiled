package p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class jtn1 extends srn1 implements Set {
    public transient dsn1 b;

    @Override // p.srn1
    public dsn1 e() {
        dsn1 dsn1Var = this.b;
        if (dsn1Var != null) {
            return dsn1Var;
        }
        dsn1 dsn1VarK = k();
        this.b = dsn1VarK;
        return dsn1VarK;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public dsn1 k() {
        Object[] array = toArray(srn1.a);
        vrn1 vrn1Var = dsn1.b;
        return dsn1.l(array.length, array);
    }
}

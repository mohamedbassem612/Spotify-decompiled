package p;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class l6 implements nma0 {
    public Object a() {
        return new HashSet();
    }

    public int b(Object obj) {
        return ((HashSet) obj).size();
    }

    public Iterator c(Object obj) {
        return ((Collection) obj).iterator();
    }

    public int d(Object obj) {
        return ((Collection) obj).size();
    }

    @Override // p.nma0
    public Object deserialize(dar darVar) {
        return e(darVar, null);
    }

    public final Object e(dar darVar, Object obj) {
        Object objG = obj != null ? g(obj) : a();
        int iB = b(objG);
        x1k x1kVarB = darVar.b(getDescriptor());
        x1kVarB.getClass();
        while (true) {
            int iP = x1kVarB.p(getDescriptor());
            if (iP == -1) {
                x1kVarB.a(getDescriptor());
                return h(objG);
            }
            f(x1kVarB, iP + iB, objG);
        }
    }

    public abstract void f(x1k x1kVar, int i, Object obj);

    public Object g(Object obj) {
        Set set = (Set) obj;
        HashSet hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet(set) : hashSet;
    }

    public Object h(Object obj) {
        return (HashSet) obj;
    }
}

package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u4d {
    public static final u4d b;
    public static final u4d c;
    public final LinkedHashSet a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new a3c0(0));
        b = new u4d(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new a3c0(1));
        c = new u4d(linkedHashSet2);
    }

    public u4d(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (a3c0 a3c0Var : this.a) {
            List<l3d> listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            a3c0Var.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (l3d l3dVar : listUnmodifiableList) {
                o0c.k("The camera info doesn't contain internal implementation.", l3dVar instanceof l3d);
                if (l3dVar.d() == a3c0Var.a) {
                    arrayList3.add(l3dVar);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Integer num = null;
        for (a3c0 a3c0Var : this.a) {
            if (a3c0Var instanceof a3c0) {
                Integer numValueOf = Integer.valueOf(a3c0Var.a);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    eg.m("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final n3d c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((n3d) it.next()).g());
        }
        ArrayList arrayListA = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            n3d n3dVar = (n3d) it2.next();
            if (arrayListA.contains(n3dVar.g())) {
                linkedHashSet2.add(n3dVar);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (n3d) it3.next();
        }
        hhg1.n("No available camera can be found");
        return null;
    }
}

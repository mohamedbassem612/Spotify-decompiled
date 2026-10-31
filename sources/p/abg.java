package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class abg {
    public final LinkedHashMap a;

    public abg(byte b) {
        switch (b) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void a(zag zagVar) {
        long[] jArr = zagVar.e;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.a;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(zagVar.e[0]), zagVar);
        }
    }

    public void b(trj0 trj0Var) {
        byte b = trj0Var.a;
        byte b2 = trj0Var.b;
        Integer numValueOf = Integer.valueOf(b);
        LinkedHashMap linkedHashMap = this.a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(b2))) {
            Objects.toString(treeMap2.get(Integer.valueOf(b2)));
            trj0Var.toString();
        }
        treeMap2.put(Integer.valueOf(b2), trj0Var);
    }

    public void c(trj0... trj0VarArr) {
        for (trj0 trj0Var : trj0VarArr) {
            b(trj0Var);
        }
    }

    public zag d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (zag zagVar : this.a.values()) {
            arrayList.add(zagVar.b);
            arrayList2.add(zagVar.c);
            arrayList3.add(zagVar.d);
            arrayList4.add(zagVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        int length = 0;
        for (int[] iArr2 : iArr) {
            length += iArr2.length;
        }
        int[] iArr3 = new int[length];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return new zag(iArr3, anm1.p((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), anm1.p((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), anm1.p((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }
}

package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface lqm0 {
    default int maxIntrinsicHeight(p890 p890Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new a3s((afh0) list2.get(i3), 2, 2));
            }
            arrayList2.add(arrayList3);
        }
        return mo604measure3p2s80s(new c990(p890Var, p890Var.getLayoutDirection()), arrayList2, jjl.b(0, i, 0, 0, 13)).getHeight();
    }

    default int maxIntrinsicWidth(p890 p890Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new a3s((afh0) list2.get(i3), 2, 1));
            }
            arrayList2.add(arrayList3);
        }
        return mo604measure3p2s80s(new c990(p890Var, p890Var.getLayoutDirection()), arrayList2, jjl.b(0, 0, 0, i, 7)).getWidth();
    }

    /* JADX INFO: renamed from: measure-3p2s80s */
    hfh0 mo604measure3p2s80s(ifh0 ifh0Var, List list, long j);

    default int minIntrinsicHeight(p890 p890Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new a3s((afh0) list2.get(i3), 1, 2));
            }
            arrayList2.add(arrayList3);
        }
        return mo604measure3p2s80s(new c990(p890Var, p890Var.getLayoutDirection()), arrayList2, jjl.b(0, i, 0, 0, 13)).getHeight();
    }

    default int minIntrinsicWidth(p890 p890Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new a3s((afh0) list2.get(i3), 1, 1));
            }
            arrayList2.add(arrayList3);
        }
        return mo604measure3p2s80s(new c990(p890Var, p890Var.getLayoutDirection()), arrayList2, jjl.b(0, 0, 0, i, 7)).getWidth();
    }
}

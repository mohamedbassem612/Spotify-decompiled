package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface gfh0 {
    default int maxIntrinsicHeight(p890 p890Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new a3s((afh0) list.get(i2), 2, 2));
        }
        return mo23measure3p2s80s(new c990(p890Var, p890Var.getLayoutDirection()), arrayList, jjl.b(0, i, 0, 0, 13)).getHeight();
    }

    default int maxIntrinsicWidth(p890 p890Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new a3s((afh0) list.get(i2), 2, 1));
        }
        return mo23measure3p2s80s(new c990(p890Var, p890Var.getLayoutDirection()), arrayList, jjl.b(0, 0, 0, i, 7)).getWidth();
    }

    /* JADX INFO: renamed from: measure-3p2s80s */
    hfh0 mo23measure3p2s80s(ifh0 ifh0Var, List list, long j);

    default int minIntrinsicHeight(p890 p890Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new a3s((afh0) list.get(i2), 1, 2));
        }
        return mo23measure3p2s80s(new c990(p890Var, p890Var.getLayoutDirection()), arrayList, jjl.b(0, i, 0, 0, 13)).getHeight();
    }

    default int minIntrinsicWidth(p890 p890Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new a3s((afh0) list.get(i2), 1, 1));
        }
        return mo23measure3p2s80s(new c990(p890Var, p890Var.getLayoutDirection()), arrayList, jjl.b(0, 0, 0, i, 7)).getWidth();
    }
}

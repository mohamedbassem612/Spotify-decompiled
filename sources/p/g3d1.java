package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g3d1 {
    public final ArrayList a = new ArrayList();

    public static void b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    b(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final void a(k29 k29Var) {
        this.a.add(k29Var);
    }

    public final List c(List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList<int[]> arrayList2 = new ArrayList();
        b(arrayList2, size2, new int[size2], 0);
        k29[] k29VarArr = new k29[list.size()];
        for (int[] iArr : arrayList2) {
            boolean z = true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (iArr[i] < list.size()) {
                    k29 k29Var = (k29) arrayList.get(i);
                    k29 k29Var2 = (k29) list.get(iArr[i]);
                    k29Var.getClass();
                    z &= k29Var2.b.a <= k29Var.b.a && k29Var2.a == k29Var.a;
                    if (!z) {
                        break;
                    }
                    k29VarArr[iArr[i]] = (k29) arrayList.get(i);
                }
            }
            if (z) {
                return Arrays.asList(k29VarArr);
            }
        }
        return null;
    }
}

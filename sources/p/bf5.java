package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class bf5 {
    public static final af5 a = new af5("");

    public static final List a(af5 af5Var, int i, int i2, z9 z9Var) {
        List list;
        if (i == i2 || (list = af5Var.a) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= af5Var.b.length()) {
            if (z9Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) z9Var.invoke(((ze5) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            ze5 ze5Var = (ze5) list.get(i3);
            if (z9Var != null ? ((Boolean) z9Var.invoke(ze5Var.a)).booleanValue() : true) {
                int i4 = ze5Var.b;
                int i5 = ze5Var.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new ze5(yoi1.p(ze5Var.b, i, i2) - i, yoi1.p(i5, i, i2) - i, (we5) ze5Var.a, ze5Var.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}

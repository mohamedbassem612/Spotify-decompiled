package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hwx0 {
    public static final df41 c = kyo1.t(xox0.Y, gbw0.X0);
    public final bw91 a;
    public final bw91 b;

    public hwx0(ArrayList arrayList, ArrayList arrayList2, int i) {
        int i2 = i & 1;
        ArrayList arrayList3 = z6x.a;
        arrayList = i2 != 0 ? arrayList3 : arrayList;
        arrayList2 = (i & 2) != 0 ? arrayList3 : arrayList2;
        gwx0 gwx0Var = gwx0.a;
        bw91 bw91Var = new bw91();
        bw91Var.addAll(arrayList);
        this.a = bw91Var;
        bw91 bw91Var2 = new bw91();
        bw91Var2.addAll(arrayList2);
        this.b = bw91Var2;
    }

    public final boolean a() {
        return !this.b.isEmpty();
    }

    public final boolean b() {
        return !this.a.isEmpty();
    }
}

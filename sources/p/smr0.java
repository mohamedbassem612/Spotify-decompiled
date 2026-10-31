package p;

import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class smr0 {
    public static final yqi1 e = new yqi1((byte) 1);
    public final List a;
    public final rmr0 d;
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final y36 b = new y36(0);

    public smr0(ArrayList arrayList, List list) {
        this.a = list;
        int size = list.size();
        int i = Integer.MIN_VALUE;
        rmr0 rmr0Var = null;
        for (int i2 = 0; i2 < size; i2++) {
            rmr0 rmr0Var2 = (rmr0) list.get(i2);
            int i3 = rmr0Var2.e;
            if (i3 > i) {
                rmr0Var = rmr0Var2;
                i = i3;
            }
        }
        this.d = rmr0Var;
    }

    public final int a(grd1 grd1Var, int i) {
        rmr0 rmr0VarB = b(grd1Var);
        return rmr0VarB != null ? rmr0VarB.d : i;
    }

    public final rmr0 b(grd1 grd1Var) {
        return (rmr0) this.b.get(grd1Var);
    }
}

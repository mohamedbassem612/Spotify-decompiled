package p;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fm80 implements gfh0 {
    public final /* synthetic */ int a;

    public fm80(int i) {
        this.a = i;
    }

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m610measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        int iI0 = ifh0Var.i0(16.0f);
        int iI1 = ifh0Var.i0(16.0f);
        int i = hjl.i(j);
        int i2 = this.a;
        int i3 = (i - ((i2 - 1) * iI0)) / i2;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            sf80.a("width must be >= 0");
        }
        long jH = jjl.h(i3, i3, 0, Alert.DURATION_SHOW_INDEFINITELY);
        int[] iArr = new int[i2];
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            q5t0 q5t0VarH = ((afh0) it.next()).H(jH);
            lr80 it2 = f46.l0(iArr).iterator();
            sr80 sr80Var = (sr80) it2;
            if (!sr80Var.c) {
                hhg1.k();
                return null;
            }
            lr80 lr80Var = it2;
            int iNextInt = lr80Var.nextInt();
            if (sr80Var.c) {
                int i4 = iArr[iNextInt];
                do {
                    int iNextInt2 = lr80Var.nextInt();
                    int i5 = iArr[iNextInt2];
                    if (i4 > i5) {
                        i4 = i5;
                        iNextInt = iNextInt2;
                    }
                } while (sr80Var.c);
            }
            int i6 = iArr[iNextInt];
            iArr[iNextInt] = q5t0VarH.b + i6 + iI1;
            arrayList.add(new yvg1(q5t0VarH, Integer.valueOf((i3 + iI0) * iNextInt), Integer.valueOf(i6)));
        }
        Integer numV0 = f46.v0(iArr);
        int iIntValue = (numV0 != null ? numV0.intValue() : 0) - iI1;
        return ifh0Var.S(hjl.i(j), iIntValue < 0 ? 0 : iIntValue, b7x.a, new ib5(arrayList, (byte) 19));
    }
}

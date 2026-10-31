package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yge1 {
    public final int a;
    public final ArrayList b;
    public final LinkedHashMap c;

    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:6:0x002d  */
    public yge1(zge1 zge1Var, List list, int i) {
        float f;
        Float fValueOf;
        float fFloatValue;
        ArrayList arrayList = zge1Var.c;
        int size = arrayList.size();
        int i2 = zge1Var.b;
        this.a = size * i2;
        ArrayList arrayList2 = zge1Var.d;
        ArrayList arrayList3 = zge1Var.e;
        int size2 = arrayList.size();
        p3h1 p3h1VarD0 = o7h.D0(arrayList);
        float f2 = 1.0f;
        if (p3h1VarD0 != null) {
            f = p3h1VarD0.a & 255;
            f = f < 1.0f ? 1.0f : f;
        }
        lr80 it = yoi1.Q(0, size2).iterator();
        sr80 sr80Var = (sr80) it;
        Float fValueOf2 = null;
        if (sr80Var.c) {
            lr80 lr80Var = it;
            int iNextInt = lr80Var.nextInt();
            float fMax = ((p3h1) ((iNextInt < 0 || iNextInt >= arrayList2.size()) ? new p3h1((byte) 0) : arrayList2.get(iNextInt))).a & 255;
            while (sr80Var.c) {
                int iNextInt2 = lr80Var.nextInt();
                fMax = Math.max(fMax, ((p3h1) ((iNextInt2 < 0 || iNextInt2 >= arrayList2.size()) ? new p3h1((byte) 0) : arrayList2.get(iNextInt2))).a & 255);
            }
            fValueOf = Float.valueOf(fMax);
        } else {
            fValueOf = null;
        }
        if (fValueOf != null) {
            fFloatValue = fValueOf.floatValue();
            fFloatValue = fFloatValue < 1.0f ? 1.0f : fFloatValue;
        }
        lr80 it2 = yoi1.Q(0, size2).iterator();
        sr80 sr80Var2 = (sr80) it2;
        if (sr80Var2.c) {
            lr80 lr80Var2 = it2;
            int iNextInt3 = lr80Var2.nextInt();
            float fMax2 = ((p3h1) ((iNextInt3 < 0 || iNextInt3 >= arrayList3.size()) ? new p3h1((byte) 0) : arrayList3.get(iNextInt3))).a & 255;
            while (sr80Var2.c) {
                int iNextInt4 = lr80Var2.nextInt();
                fMax2 = Math.max(fMax2, ((p3h1) ((iNextInt4 < 0 || iNextInt4 >= arrayList3.size()) ? new p3h1((byte) 0) : arrayList3.get(iNextInt4))).a & 255);
            }
            fValueOf2 = Float.valueOf(fMax2);
        }
        if (fValueOf2 != null) {
            float fFloatValue2 = fValueOf2.floatValue();
            if (fFloatValue2 >= 1.0f) {
                f2 = fFloatValue2;
            }
        }
        tr80 tr80VarQ = yoi1.Q(0, size2);
        ArrayList arrayList4 = new ArrayList(q7h.U(tr80VarQ, 10));
        lr80 it3 = tr80VarQ.iterator();
        while (((sr80) it3).c) {
            int iNextInt5 = it3.nextInt();
            arrayList4.add(new wge1((((p3h1) arrayList.get(iNextInt5)).a & 255) / f, (((p3h1) ((iNextInt5 < 0 || iNextInt5 >= arrayList2.size()) ? new p3h1((byte) 0) : arrayList2.get(iNextInt5))).a & 255) / fFloatValue, (((p3h1) ((iNextInt5 < 0 || iNextInt5 >= arrayList3.size()) ? new p3h1((byte) 0) : arrayList3.get(iNextInt5))).a & 255) / f2, false, false, iNextInt5 * i2));
        }
        ArrayList arrayList5 = new ArrayList(arrayList4);
        if (i != 0 && list != null) {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                hia hiaVar = (hia) it4.next();
                int iY = h7p1.y(hiaVar) / i2;
                if (iY >= 0 && iY < arrayList5.size()) {
                    if (h7p1.w(hiaVar)) {
                        arrayList5.set(iY, wge1.a((wge1) arrayList5.get(iY), 39));
                    } else if (!((wge1) arrayList5.get(iY)).e) {
                        arrayList5.set(iY, wge1.a((wge1) arrayList5.get(iY), 55));
                    }
                }
            }
        }
        this.b = arrayList5;
        this.c = sqg0.M(new mmr0[]{new mmr0(1, new xge1(this.a, arrayList5))});
    }
}

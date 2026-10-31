package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kcx implements gfh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ kcx(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m204measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        float f;
        long j2 = j;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        boolean z = true;
        boolean z2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                long jB = hjl.b(j2, 0, 0, 0, 0, 10);
                q5t0 q5t0VarH = ((afh0) list.get(0)).H(jB);
                int iMin = Math.min(hjl.i(jB), hjl.h(jB));
                q5t0 q5t0VarH2 = ((afh0) list.get(1)).H(jjl.b(0, iMin, 0, iMin, 5));
                int iMax = Math.max(hjl.k(j), Math.max(q5t0VarH.a, q5t0VarH2.a));
                int iMax2 = Math.max(hjl.j(j), Math.max(q5t0VarH.b, q5t0VarH2.b));
                return ifh0Var.S(iMax, iMax2, b7xVar, new jcx(q5t0VarH, z2 ? iMax - q5t0VarH.a : 0, q5t0VarH2, z2 ? 0 : iMax - q5t0VarH2.a, iMax2 - q5t0VarH2.b));
            case 1:
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((afh0) it.next()).H(j2));
                }
                Iterator it2 = arrayList.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    i += ((q5t0) it2.next()).a;
                }
                Iterator it3 = arrayList.iterator();
                if (!it3.hasNext()) {
                    hhg1.k();
                    return null;
                }
                int i2 = ((q5t0) it3.next()).b;
                while (it3.hasNext()) {
                    int i3 = ((q5t0) it3.next()).b;
                    if (i2 < i3) {
                        i2 = i3;
                    }
                }
                if (hjl.i(j2) >= i) {
                    return ifh0Var.S(hjl.i(j2), i2, b7xVar, new s2k(arrayList, i2, (byte) 3));
                }
                mmr0 mmr0Var = z2 ? new mmr0(1, arrayList.get(0)) : new mmr0(0, (Object) null);
                int iIntValue = ((Number) mmr0Var.a).intValue();
                q5t0 q5t0Var = (q5t0) mmr0Var.b;
                q5t0 q5t0Var2 = (q5t0) arrayList.get(iIntValue);
                q5t0 q5t0Var3 = (q5t0) arrayList.get(iIntValue + 2);
                return ifh0Var.S(hjl.i(j2), q5t0Var2.b + q5t0Var3.b, b7xVar, new djx(q5t0Var, q5t0Var2, q5t0Var3, (byte) 23));
            case 2:
                int iI0 = ifh0Var.i0(8.0f);
                int iI1 = ifh0Var.i0(16.0f);
                int iI2 = ifh0Var.i0(8.0f);
                int iI3 = ifh0Var.i0(16.0f);
                List list3 = list;
                ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((afh0) it4.next()).H(hjl.b(j, 0, 0, 0, 0, 10)));
                    j2 = j;
                    z = z;
                }
                long j3 = j2;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (((q5t0) obj).b > 0) {
                        arrayList3.add(obj);
                    }
                }
                Iterator it5 = arrayList3.iterator();
                int i4 = 0;
                while (it5.hasNext()) {
                    i4 += ((q5t0) it5.next()).b;
                }
                int size = arrayList3.size() - 1;
                if (size < 0) {
                    size = 0;
                }
                if (((z2 ? 1 : 0) * iI2) + (size * iI0) + i4 > hjl.h(j3)) {
                    arrayList3 = o7h.J0(arrayList3, o7h.q0(arrayList2));
                }
                int size2 = arrayList3.size() - 1;
                if (size2 < 0) {
                    size2 = 0;
                }
                int i5 = ((z2 ? 1 : 0) * iI3) + (size2 * iI1);
                int i6 = iI1 - iI0;
                int i7 = iI3 - iI2;
                int i8 = ((z2 ? 1 : 0) * i7) + (size2 * i6);
                if (i8 == 0) {
                    f = 0.0f;
                } else {
                    Iterator it6 = arrayList3.iterator();
                    int i9 = 0;
                    while (it6.hasNext()) {
                        i9 += ((q5t0) it6.next()).b;
                    }
                    int iH = (i9 + i5) - hjl.h(j3);
                    if (iH < 0) {
                        iH = 0;
                    }
                    f = iH / i8;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                }
                int i10 = (int) (iI1 - (i6 * f));
                int i11 = z2 ? (int) (iI3 - (f * i7)) : 0;
                int i12 = hjl.i(j3);
                Iterator it7 = arrayList3.iterator();
                int i13 = 0;
                while (it7.hasNext()) {
                    i13 += ((q5t0) it7.next()).b;
                }
                int size3 = arrayList3.size() - 1;
                return ifh0Var.S(i12, ((size3 >= 0 ? size3 : 0) * i10) + i13, Collections.singletonMap(htj0.a, Integer.valueOf(i11)), new ftj0(i10, j3, arrayList3));
            default:
                q5t0 q5t0VarH3 = ((afh0) list.get(0)).H(j2);
                int i14 = q5t0VarH3.a;
                int i15 = q5t0VarH3.b;
                if (((i14 >= 0 ? 1 : 0) & (i15 >= 0 ? 1 : 0)) == 0) {
                    sf80.a("width and height must be >= 0");
                }
                long jH = jjl.h(i14, i14, i15, i15);
                return ifh0Var.S(q5t0VarH3.a, q5t0VarH3.b, b7xVar, new m9i1(z2 ? ((afh0) list.get(2)).H(jH) : null, ((afh0) list.get(1)).H(jH), q5t0VarH3, ((afh0) list.get(z2 ? 3 : 2)).H(jH), (byte) 7));
        }
    }
}

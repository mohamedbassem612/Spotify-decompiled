package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ih6 implements gfh0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public ih6(float f, c380 c380Var, y9e1[] y9e1VarArr) {
        this.b = f;
        this.c = c380Var;
        this.d = y9e1VarArr;
    }

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m158measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        int i;
        int i2;
        Object obj;
        int iP;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Object obj2 = this.d;
        float f = this.b;
        char c = 2;
        Object obj3 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int i3 = hjl.i(j);
                float f2 = ((cvx) obj3).c;
                int iI0 = i3 - ifh0Var.i0(2.0f * f2);
                if (iI0 < 0) {
                    iI0 = 0;
                }
                int iI1 = ifh0Var.i0(8.0f);
                int iH = hjl.h(j) - ifh0Var.i0(72.0f);
                if (iH < 0) {
                    iH = 0;
                }
                int iI2 = ifh0Var.i0(f);
                int i4 = (iH - iI2) - (iI1 * 2);
                if (i4 < 0) {
                    i4 = 0;
                }
                q5t0 q5t0VarH = ((afh0) o7h.V0(list)).H(hjl.a(0, iI0, 0, i4));
                n811 n811Var = new n811();
                n811Var.a = ifh0Var.i0(f2);
                int iI3 = ifh0Var.i0(16.0f);
                int i5 = q5t0VarH.b + iI2;
                int i6 = n811Var.a;
                int i7 = ((i5 + i6) + iI3) - iH;
                if (i7 < 0) {
                    i7 = 0;
                }
                int iMin = Math.min(i7, i6 - iI1);
                n811Var.a = i6 - iMin;
                int iMin2 = ((((iH - q5t0VarH.b) - iI2) - n811Var.a) - (iI3 - Math.min(i7 - iMin, iI3 - iI1))) / 2;
                if (iMin2 < 0) {
                    iMin2 = 0;
                }
                return ifh0Var.S(i3, hjl.h(j), b7xVar, new hh6((iu30) obj2, iMin2, q5t0VarH, n811Var, i3));
            default:
                c380 c380Var = (c380) obj3;
                long jB = hjl.b(j, 0, 0, 0, 0, 10);
                ArrayList arrayListS1 = o7h.s1(list, 2, 2);
                ArrayList arrayList = new ArrayList(q7h.U(arrayListS1, 10));
                Iterator it = arrayListS1.iterator();
                while (it.hasNext()) {
                    arrayList.add(((afh0) ((List) it.next()).get(0)).H(jB));
                }
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    hhg1.k();
                    return null;
                }
                int i8 = ((q5t0) it2.next()).a;
                while (it2.hasNext()) {
                    int i9 = ((q5t0) it2.next()).a;
                    if (i8 < i9) {
                        i8 = i9;
                    }
                }
                int iI4 = ifh0Var.i0(f);
                if (hjl.e(j)) {
                    i = (hjl.i(j) - i8) - iI4;
                    if (i < 0) {
                        i = 0;
                    }
                } else {
                    i = Integer.MAX_VALUE;
                }
                long jB2 = hjl.b(jB, 0, i, 0, 0, 13);
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayListS1, 10));
                Iterator it3 = arrayListS1.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((afh0) ((List) it3.next()).get(1)).H(jB2));
                }
                int[] iArr = new int[c380Var.size()];
                int[] iArr2 = new int[c380Var.size()];
                int size = c380Var.size();
                int[] iArr3 = new int[size];
                int i10 = 0;
                while (i10 < size) {
                    q5t0 q5t0Var = (q5t0) arrayList2.get(i10);
                    char c2 = c;
                    y9e1 y9e1Var = ((y9e1[]) obj2)[i10];
                    int iU = q5t0Var.U(xl3.a);
                    Object obj4 = obj3;
                    if (y9e1Var != null) {
                        zrm0 zrm0Var = y9e1Var.b;
                        obj = obj2;
                        if (zrm0Var.f > 0) {
                            iP = yoi1.p(jch0.U(zrm0Var.b(0)) + (iU == Integer.MIN_VALUE ? 0 : iU - jch0.U(y9e1Var.d)), 0, q5t0Var.b);
                        }
                        int iMax = Math.max(((q5t0) arrayList.get(i10)).b, iP);
                        iArr[i10] = (iMax - ((q5t0) arrayList.get(i10)).b) / 2;
                        iArr2[i10] = (iMax - iP) / 2;
                        iArr3[i10] = Math.max(iArr[i10] + ((q5t0) arrayList.get(i10)).b, iArr2[i10] + q5t0Var.b);
                        i10++;
                        c = c2;
                        obj3 = obj4;
                        obj2 = obj;
                    } else {
                        obj = obj2;
                    }
                    int iU2 = q5t0Var.U(xl3.b);
                    if (iU == Integer.MIN_VALUE || iU2 == Integer.MIN_VALUE) {
                        iP = q5t0Var.b;
                    } else {
                        int i11 = q5t0Var.b;
                        iP = yoi1.p((iU + i11) - iU2, 0, i11);
                    }
                    int iMax2 = Math.max(((q5t0) arrayList.get(i10)).b, iP);
                    iArr[i10] = (iMax2 - ((q5t0) arrayList.get(i10)).b) / 2;
                    iArr2[i10] = (iMax2 - iP) / 2;
                    iArr3[i10] = Math.max(iArr[i10] + ((q5t0) arrayList.get(i10)).b, iArr2[i10] + q5t0Var.b);
                    i10++;
                    c = c2;
                    obj3 = obj4;
                    obj2 = obj;
                }
                Object obj5 = obj3;
                if (hjl.e(j)) {
                    i2 = hjl.i(j);
                } else {
                    int i12 = i8 + iI4;
                    Iterator it4 = arrayList2.iterator();
                    if (!it4.hasNext()) {
                        hhg1.k();
                        return null;
                    }
                    int i13 = ((q5t0) it4.next()).a;
                    while (it4.hasNext()) {
                        int i14 = ((q5t0) it4.next()).a;
                        if (i13 < i14) {
                            i13 = i14;
                        }
                    }
                    i2 = i12 + i13;
                }
                int i15 = 0;
                for (int i16 = 0; i16 < size; i16++) {
                    i15 += iArr3[i16];
                }
                return ifh0Var.S(i2, yoi1.p(i15, hjl.j(j), hjl.h(j)), b7xVar, new ovd((c380) obj5, arrayList, i8, iArr, arrayList2, iI4, iArr2, iArr3));
        }
    }

    public ih6(cvx cvxVar, float f, iu30 iu30Var) {
        this.c = cvxVar;
        this.b = f;
        this.d = iu30Var;
    }
}

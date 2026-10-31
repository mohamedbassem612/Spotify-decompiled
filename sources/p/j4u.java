package p;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j4u {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final kkn d;
    public final int e;
    public final int f;
    public final boolean g;

    public j4u(kkn kknVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        int i2;
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = kknVar;
        int iR = kknVar.r();
        this.e = iR;
        int iQ = kknVar.q();
        this.f = iQ;
        this.g = true;
        i4u i4uVar = arrayList.isEmpty() ? null : (i4u) arrayList.get(0);
        if (i4uVar == null || i4uVar.a != 0 || i4uVar.b != 0) {
            arrayList.add(0, new i4u(0, 0, 0));
        }
        arrayList.add(new i4u(iR, iQ, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i4u i4uVar2 = (i4u) it.next();
            for (int i3 = 0; i3 < i4uVar2.c; i3++) {
                int i4 = i4uVar2.a + i3;
                int i5 = i4uVar2.b + i3;
                int i6 = kknVar.i(i4, i5) ? 1 : 2;
                iArr[i4] = (i5 << 4) | i6;
                iArr2[i5] = (i4 << 4) | i6;
            }
        }
        if (this.g) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                i4u i4uVar3 = (i4u) it2.next();
                while (true) {
                    i = i4uVar3.a;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            for (int i9 = 0; i9 < size; i9++) {
                                i4u i4uVar4 = (i4u) arrayList.get(i9);
                                while (true) {
                                    i2 = i4uVar4.b;
                                    if (i8 < i2) {
                                        if (iArr2[i8] == 0 && kknVar.j(i7, i8)) {
                                            int i10 = kknVar.i(i7, i8) ? 8 : 4;
                                            iArr[i7] = (i8 << 4) | i10;
                                            iArr2[i8] = i10 | (i7 << 4);
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                i8 = i4uVar4.c + i2;
                            }
                        }
                        i7++;
                    }
                }
                i7 = i4uVar3.c + i;
            }
        }
    }

    public static k4u c(ArrayDeque arrayDeque, int i, boolean z) {
        k4u k4uVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                k4uVar = null;
                break;
            }
            k4uVar = (k4u) it.next();
            if (k4uVar.a == i && k4uVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            k4u k4uVar2 = (k4u) it.next();
            if (z) {
                k4uVar2.b--;
            } else {
                k4uVar2.b++;
            }
        }
        return k4uVar;
    }

    public final void a(o5d0 o5d0Var) {
        int[] iArr;
        kkn kknVar;
        int i;
        int i2;
        ArrayList arrayList;
        j4u j4uVar = this;
        sha shaVar = o5d0Var instanceof sha ? (sha) o5d0Var : new sha(o5d0Var);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = j4uVar.a;
        boolean z = true;
        int size = arrayList2.size() - 1;
        int i3 = j4uVar.e;
        int i4 = j4uVar.f;
        int i5 = i3;
        while (size >= 0) {
            i4u i4uVar = (i4u) arrayList2.get(size);
            int i6 = i4uVar.a;
            int i7 = i4uVar.c;
            int i8 = i6 + i7;
            int i9 = i4uVar.b;
            int i10 = i9 + i7;
            while (true) {
                iArr = j4uVar.b;
                kknVar = j4uVar.d;
                boolean z2 = z;
                i = 0;
                if (i5 <= i8) {
                    break;
                }
                i5--;
                int i11 = iArr[i5];
                if ((i11 & 12) != 0) {
                    arrayList = arrayList2;
                    int i12 = i11 >> 4;
                    k4u k4uVarC = c(arrayDeque, i12, false);
                    if (k4uVarC != null) {
                        int i13 = (i3 - k4uVarC.b) - 1;
                        shaVar.e(i5, i13);
                        if ((i11 & 4) != 0) {
                            shaVar.d(i13, z2 ? 1 : 0, kknVar.o(i5, i12));
                        }
                    } else {
                        arrayDeque.add(new k4u(i5, (i3 - i5) - (z2 ? 1 : 0), z2));
                    }
                } else {
                    arrayList = arrayList2;
                    shaVar.c(i5, z2 ? 1 : 0);
                    i3--;
                }
                arrayList2 = arrayList;
                z = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i4 > i10) {
                i4--;
                int i14 = j4uVar.c[i4];
                if ((i14 & 12) != 0) {
                    int i15 = i14 >> 4;
                    k4u k4uVarC2 = c(arrayDeque, i15, true);
                    if (k4uVarC2 == null) {
                        arrayDeque.add(new k4u(i4, i3 - i5, false));
                        i2 = 0;
                    } else {
                        i2 = 0;
                        shaVar.e((i3 - k4uVarC2.b) - 1, i5);
                        if ((i14 & 4) != 0) {
                            shaVar.d(i5, 1, kknVar.o(i15, i4));
                        }
                    }
                } else {
                    i2 = i;
                    shaVar.b(i5, 1);
                    i3++;
                }
                j4uVar = this;
                i = i2;
            }
            int i16 = i9;
            int i17 = i6;
            while (i < i7) {
                if ((iArr[i17] & 15) == 2) {
                    shaVar.d(i17, 1, kknVar.o(i17, i16));
                }
                i17++;
                i16++;
                i++;
            }
            size--;
            j4uVar = this;
            z = true;
            i4 = i9;
            i5 = i6;
            arrayList2 = arrayList3;
        }
        shaVar.a();
    }

    public final void b(z511 z511Var) {
        a(new x5j1(z511Var, (byte) 5));
    }
}

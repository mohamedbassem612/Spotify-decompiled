package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class di3 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ifh0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ di3(ArrayList arrayList, ifh0 ifh0Var, int i, ArrayList arrayList2) {
        this.d = arrayList;
        this.b = ifh0Var;
        this.c = i;
        this.e = arrayList2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj2 = this.e;
        ifh0 ifh0Var = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                p5t0 p5t0Var = (p5t0) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    List list = (List) arrayList.get(i2);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i3 = 0;
                    while (i3 < size2) {
                        iArr[i3] = ((q5t0) list.get(i3)).a + (i3 < p7h.L(list) ? ifh0Var.i0(8.0f) : 0);
                        i3++;
                    }
                    int[] iArr2 = new int[size2];
                    if (ifh0Var.getLayoutDirection() == flb0.a) {
                        int i4 = 0;
                        for (int i5 = 0; i5 < size2; i5++) {
                            i4 += iArr[i5];
                        }
                        int i6 = i - i4;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < size2) {
                            int i9 = iArr[i7];
                            iArr2[i8] = i6;
                            i6 += i9;
                            i7++;
                            i8++;
                        }
                    } else {
                        int i10 = 0;
                        for (int i11 = size2 - 1; -1 < i11; i11--) {
                            int i12 = iArr[i11];
                            iArr2[i11] = i10;
                            i10 += i12;
                        }
                    }
                    int size3 = list.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        p5t0.g(iArr2[i13], ((Number) arrayList2.get(i2)).intValue(), p5t0Var, (q5t0) list.get(i13));
                    }
                }
                break;
            default:
                hr60 hr60Var = (hr60) obj3;
                q5t0 q5t0Var = (q5t0) obj2;
                p5t0 p5t0Var2 = (p5t0) obj;
                int i14 = hr60Var.b;
                r6e1 r6e1Var = hr60Var.a;
                cgg1 cgg1Var = hr60Var.c;
                z9e1 z9e1Var = (z9e1) hr60Var.d.invoke();
                r6e1Var.a(qqq0.b, x3p1.s(p5t0Var2, i14, cgg1Var, z9e1Var != null ? z9e1Var.a : null, ifh0Var.getLayoutDirection() == flb0.b, q5t0Var.a), i, q5t0Var.a);
                p5t0Var2.k(q5t0Var, Math.round(-r6e1Var.a.s()), 0, 0.0f);
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ di3(hr60 hr60Var, ifh0 ifh0Var, q5t0 q5t0Var, int i) {
        this.d = hr60Var;
        this.b = ifh0Var;
        this.e = q5t0Var;
        this.c = i;
    }
}

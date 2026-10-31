package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class okq0 extends klq0 {
    public static final okq0 c = new okq0(1, 0, 2);

    @Override // p.klq0
    public final void a(a9a a9aVar, j06 j06Var, hf91 hf91Var, h72 h72Var, llq0 llq0Var) {
        int[] iArr;
        s340 s340Var;
        int iC;
        int iL = a9aVar.l(0);
        if (hf91Var.n != 0) {
            g0k.a("Cannot move a group while inserting");
        }
        if (iL < 0) {
            g0k.a("Parameter offset is out of bounds");
        }
        if (iL == 0) {
            return;
        }
        int i = hf91Var.t;
        int i2 = hf91Var.v;
        int i3 = hf91Var.u;
        int i4 = i;
        while (true) {
            iArr = hf91Var.b;
            if (iL <= 0) {
                break;
            }
            i4 += iArr[(hf91Var.q(i4) * 5) + 3];
            if (i4 > i3) {
                g0k.a("Parameter offset is out of bounds");
            }
            iL--;
        }
        int i5 = iArr[(hf91Var.q(i4) * 5) + 3];
        int iF = hf91Var.f(hf91Var.q(hf91Var.t), hf91Var.b);
        int iF2 = hf91Var.f(hf91Var.q(i4), hf91Var.b);
        int i6 = i4 + i5;
        int iF3 = hf91Var.f(hf91Var.q(i6), hf91Var.b);
        int i7 = iF3 - iF2;
        hf91Var.w(i7, Math.max(hf91Var.t - 1, 0));
        hf91Var.v(i5);
        int[] iArr2 = hf91Var.b;
        int iQ = hf91Var.q(i6) * 5;
        f46.P(hf91Var.q(i) * 5, iQ, (i5 * 5) + iQ, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = hf91Var.c;
            int iG = hf91Var.g(iF2 + i7);
            System.arraycopy(objArr, iG, objArr, iF, hf91Var.g(iF3 + i7) - iG);
        }
        int i8 = iF2 + i7;
        int i9 = i8 - iF;
        int i10 = hf91Var.k;
        int i11 = hf91Var.l;
        int length = hf91Var.c.length;
        int i12 = hf91Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iQ2 = hf91Var.q(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iQ2 * 5) + 4] = hf91.h(hf91.h(hf91Var.f(iQ2, iArr2) - i15, i12 < iQ2 ? 0 : i10, i11, length), hf91Var.k, hf91Var.l, hf91Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iO = hf91Var.o();
        int iB = bf91.b(hf91Var.d, i6, iO);
        ArrayList arrayList = new ArrayList();
        if (iB >= 0) {
            while (iB < hf91Var.d.size() && (iC = hf91Var.c((s340Var = (s340) hf91Var.d.get(iB)))) >= i6 && iC < i16) {
                arrayList.add(s340Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            s340 s340Var2 = (s340) arrayList.get(i18);
            int iC2 = hf91Var.c(s340Var2) + i17;
            if (iC2 >= hf91Var.g) {
                s340Var2.a = -(iO - iC2);
            } else {
                s340Var2.a = iC2;
            }
            hf91Var.d.add(bf91.b(hf91Var.d, iC2, iO), s340Var2);
        }
        if (hf91Var.J(i6, i5)) {
            g0k.a("Unexpectedly removed anchors");
        }
        hf91Var.l(i2, hf91Var.u, i);
        if (i7 > 0) {
            hf91Var.K(i8, i7, i6 - 1);
        }
    }
}

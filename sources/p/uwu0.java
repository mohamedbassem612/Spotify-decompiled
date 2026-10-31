package p;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uwu0 extends sqe1 {
    public static final /* synthetic */ int n = 0;
    public final int e;
    public final ef81 f;
    public final int g;
    public final int h;
    public final int[] i;
    public final int[] j;
    public final sqe1[] k;
    public final Object[] l;
    public final HashMap m;

    public uwu0(sqe1[] sqe1VarArr, Object[] objArr, ef81 ef81Var) {
        this.f = ef81Var;
        this.e = ef81Var.b.length;
        int length = sqe1VarArr.length;
        this.k = sqe1VarArr;
        this.i = new int[length];
        this.j = new int[length];
        this.l = objArr;
        this.m = new HashMap();
        int length2 = sqe1VarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            sqe1 sqe1Var = sqe1VarArr[i];
            this.k[i2] = sqe1Var;
            this.j[i2] = iO;
            this.i[i2] = iH;
            iO += sqe1Var.o();
            iH += this.k[i2].h();
            this.m.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.g = iO;
        this.h = iH;
    }

    @Override // p.sqe1
    public final int a(boolean z) {
        if (this.e != 0) {
            int iQ = 0;
            if (z) {
                int[] iArr = this.f.b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                sqe1[] sqe1VarArr = this.k;
                if (!sqe1VarArr[iQ].p()) {
                    return sqe1VarArr[iQ].a(z) + this.j[iQ];
                }
                iQ = q(iQ, z);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // p.sqe1
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.m.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.k[iIntValue].b(obj3)) != -1) {
                return this.i[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // p.sqe1
    public final int c(boolean z) {
        int iR;
        int i = this.e;
        if (i != 0) {
            if (z) {
                int[] iArr = this.f.b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i - 1;
            }
            do {
                sqe1[] sqe1VarArr = this.k;
                if (!sqe1VarArr[iR].p()) {
                    return sqe1VarArr[iR].c(z) + this.j[iR];
                }
                iR = r(iR, z);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // p.sqe1
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.j;
        int iE = zoi1.e(iArr, i + 1, false, false);
        int i3 = iArr[iE];
        sqe1[] sqe1VarArr = this.k;
        int iE2 = sqe1VarArr[iE].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iE2 != -1) {
            return i3 + iE2;
        }
        int iQ = q(iE, z);
        while (iQ != -1 && sqe1VarArr[iQ].p()) {
            iQ = q(iQ, z);
        }
        if (iQ != -1) {
            return sqe1VarArr[iQ].a(z) + iArr[iQ];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // p.sqe1
    public final dqe1 f(int i, dqe1 dqe1Var, boolean z) {
        int[] iArr = this.i;
        int iE = zoi1.e(iArr, i + 1, false, false);
        int i2 = this.j[iE];
        this.k[iE].f(i - iArr[iE], dqe1Var, z);
        dqe1Var.c += i2;
        if (z) {
            Object obj = this.l[iE];
            Object obj2 = dqe1Var.b;
            obj2.getClass();
            dqe1Var.b = Pair.create(obj, obj2);
        }
        return dqe1Var;
    }

    @Override // p.sqe1
    public final dqe1 g(Object obj, dqe1 dqe1Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.m.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.j[iIntValue];
        this.k[iIntValue].g(obj3, dqe1Var);
        dqe1Var.c += i;
        dqe1Var.b = obj;
        return dqe1Var;
    }

    @Override // p.sqe1
    public final int h() {
        return this.h;
    }

    @Override // p.sqe1
    public final int k(int i, int i2, boolean z) {
        int[] iArr = this.j;
        int iE = zoi1.e(iArr, i + 1, false, false);
        int i3 = iArr[iE];
        sqe1[] sqe1VarArr = this.k;
        int iK = sqe1VarArr[iE].k(i - i3, i2 != 2 ? i2 : 0, z);
        if (iK != -1) {
            return i3 + iK;
        }
        int iR = r(iE, z);
        while (iR != -1 && sqe1VarArr[iR].p()) {
            iR = r(iR, z);
        }
        if (iR != -1) {
            return sqe1VarArr[iR].c(z) + iArr[iR];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // p.sqe1
    public final Object l(int i) {
        int[] iArr = this.i;
        int iE = zoi1.e(iArr, i + 1, false, false);
        return Pair.create(this.l[iE], this.k[iE].l(i - iArr[iE]));
    }

    @Override // p.sqe1
    public final oqe1 n(int i, oqe1 oqe1Var, long j) {
        int[] iArr = this.j;
        int iE = zoi1.e(iArr, i + 1, false, false);
        int i2 = iArr[iE];
        int i3 = this.i[iE];
        this.k[iE].n(i - i2, oqe1Var, j);
        Object objCreate = this.l[iE];
        Object obj = oqe1.q;
        Object obj2 = oqe1Var.a;
        if (obj != obj2) {
            objCreate = Pair.create(objCreate, obj2);
        }
        oqe1Var.a = objCreate;
        oqe1Var.n += i3;
        oqe1Var.o += i3;
        return oqe1Var;
    }

    @Override // p.sqe1
    public final int o() {
        return this.g;
    }

    public final int q(int i, boolean z) {
        if (!z) {
            if (i < this.e - 1) {
                return i + 1;
            }
            return -1;
        }
        ef81 ef81Var = this.f;
        int i2 = ef81Var.c[i] + 1;
        int[] iArr = ef81Var.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        ef81 ef81Var = this.f;
        int i2 = ef81Var.c[i] - 1;
        if (i2 >= 0) {
            return ef81Var.b[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public uwu0(ArrayList arrayList, ef81 ef81Var) {
        sqe1[] sqe1VarArr = new sqe1[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            sqe1VarArr[i2] = ((x2i0) it.next()).a();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((x2i0) it2.next()).getUid();
            i++;
        }
        this(sqe1VarArr, objArr, ef81Var);
    }
}

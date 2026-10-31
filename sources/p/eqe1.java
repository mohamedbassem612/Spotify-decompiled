package p;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eqe1 extends sqe1 {
    public final bg11 e;
    public final bg11 f;
    public final int[] g;
    public final int[] h;
    public final j380 i;

    public eqe1(bg11 bg11Var, bg11 bg11Var2, int[] iArr) {
        bg11 bg11Var3 = bg11Var;
        int i = bg11Var3.d;
        int i2 = bg11Var3.d;
        int i3 = 1;
        dm5.m(i == iArr.length);
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.h[iArr[i4]] = i4;
        }
        v280 v280VarM = b380.m();
        int i5 = 0;
        while (i5 < i2) {
            oqe1 oqe1Var = (oqe1) bg11Var3.get(i5);
            if (i2 > i3 && Objects.equals(oqe1Var.a, oqe1.q)) {
                oqe1 oqe1Var2 = new oqe1();
                oqe1Var2.d(new Object(), oqe1Var.c, oqe1Var.d, oqe1Var.e, oqe1Var.f, oqe1Var.g, oqe1Var.h, oqe1Var.i, oqe1Var.j, oqe1Var.l, oqe1Var.m, oqe1Var.n, oqe1Var.o, oqe1Var.f108p);
                oqe1Var2.k = oqe1Var.k;
                oqe1Var2.b = oqe1Var.b;
                oqe1Var = oqe1Var2;
            }
            v280VarM.c(oqe1Var);
            i5++;
            bg11Var3 = bg11Var;
            i2 = i2;
            i3 = 1;
        }
        this.e = v280VarM.g();
        v280 v280VarM2 = b380.m();
        HashMap map = new HashMap(mno1.k(bg11Var2.d));
        for (int i6 = 0; i6 < bg11Var2.d; i6++) {
            dqe1 dqe1Var = (dqe1) bg11Var2.get(i6);
            if (dqe1Var.b == null) {
                dqe1 dqe1Var2 = new dqe1();
                dqe1Var2.i(dqe1Var.a, new Object(), dqe1Var.c, dqe1Var.d, dqe1Var.e, dqe1Var.g, dqe1Var.f);
                dqe1Var = dqe1Var2;
            }
            v280VarM2.c(dqe1Var);
            Object obj = dqe1Var.b;
            obj.getClass();
            if (!map.containsKey(obj)) {
                map.put(obj, Integer.valueOf(i6));
            }
        }
        this.f = v280VarM2.g();
        this.i = j380.c(map);
    }

    @Override // p.sqe1
    public final int a(boolean z) {
        if (p()) {
            return -1;
        }
        if (z) {
            return this.g[0];
        }
        return 0;
    }

    @Override // p.sqe1
    public final int b(Object obj) {
        Integer num = (Integer) this.i.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // p.sqe1
    public final int c(boolean z) {
        if (p()) {
            return -1;
        }
        bg11 bg11Var = this.e;
        if (!z) {
            return bg11Var.d - 1;
        }
        return this.g[bg11Var.d - 1];
    }

    @Override // p.sqe1
    public final int e(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == c(z)) {
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        }
        if (!z) {
            return i + 1;
        }
        return this.g[this.h[i] + 1];
    }

    @Override // p.sqe1
    public final dqe1 f(int i, dqe1 dqe1Var, boolean z) {
        dqe1 dqe1Var2 = (dqe1) this.f.get(i);
        dqe1Var.i(dqe1Var2.a, dqe1Var2.b, dqe1Var2.c, dqe1Var2.d, dqe1Var2.e, dqe1Var2.g, dqe1Var2.f);
        return dqe1Var;
    }

    @Override // p.sqe1
    public final int h() {
        return this.f.d;
    }

    @Override // p.sqe1
    public final int k(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == a(z)) {
            if (i2 == 2) {
                return c(z);
            }
            return -1;
        }
        if (!z) {
            return i - 1;
        }
        return this.g[this.h[i] - 1];
    }

    @Override // p.sqe1
    public final Object l(int i) {
        Object obj = ((dqe1) this.f.get(i)).b;
        obj.getClass();
        return obj;
    }

    @Override // p.sqe1
    public final oqe1 n(int i, oqe1 oqe1Var, long j) {
        oqe1 oqe1Var2 = (oqe1) this.e.get(i);
        oqe1Var.d(oqe1Var2.a, oqe1Var2.c, oqe1Var2.d, oqe1Var2.e, oqe1Var2.f, oqe1Var2.g, oqe1Var2.h, oqe1Var2.i, oqe1Var2.j, oqe1Var2.l, oqe1Var2.m, oqe1Var2.n, oqe1Var2.o, oqe1Var2.f108p);
        oqe1Var.k = oqe1Var2.k;
        return oqe1Var;
    }

    @Override // p.sqe1
    public final int o() {
        return this.e.d;
    }
}

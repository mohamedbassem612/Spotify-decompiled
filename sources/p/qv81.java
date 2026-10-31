package p;

import android.util.Pair;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qv81 extends sqe1 {
    public final b380 e;
    public final int[] f;
    public final int[] g;
    public final HashMap h;

    public qv81(List list) {
        int size = list.size();
        this.e = b380.p(list);
        this.f = new int[size];
        int i = 0;
        int i2 = 0;
        while (true) {
            int size2 = 1;
            if (i >= size) {
                break;
            }
            nv81 nv81Var = (nv81) list.get(i);
            this.f[i] = i2;
            if (!nv81Var.f104p.isEmpty()) {
                size2 = nv81Var.f104p.size();
            }
            i2 += size2;
            i++;
        }
        this.g = new int[i2];
        this.h = new HashMap();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            nv81 nv81Var2 = (nv81) list.get(i4);
            int i5 = 0;
            while (true) {
                if (i5 < (nv81Var2.f104p.isEmpty() ? 1 : nv81Var2.f104p.size())) {
                    this.h.put(nv81Var2.a(i5), Integer.valueOf(i3));
                    this.g[i3] = i4;
                    i3++;
                    i5++;
                }
            }
        }
    }

    @Override // p.sqe1
    public final int b(Object obj) {
        Integer num = (Integer) this.h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // p.sqe1
    public final dqe1 f(int i, dqe1 dqe1Var, boolean z) {
        int i2 = this.g[i];
        int i3 = i - this.f[i2];
        nv81 nv81Var = (nv81) this.e.get(i2);
        b380 b380Var = nv81Var.f104p;
        if (!b380Var.isEmpty()) {
            ((ov81) b380Var.get(i3)).getClass();
            dqe1Var.i(null, Pair.create(nv81Var.a, null), i2, 0L, nv81Var.q[i3], null, false);
            return dqe1Var;
        }
        Object obj = nv81Var.a;
        long j = nv81Var.n;
        dqe1Var.i(obj, obj, i2, nv81Var.m + j, -j, ev0.f, nv81Var.o);
        return dqe1Var;
    }

    @Override // p.sqe1
    public final dqe1 g(Object obj, dqe1 dqe1Var) {
        Integer num = (Integer) this.h.get(obj);
        num.getClass();
        f(num.intValue(), dqe1Var, true);
        return dqe1Var;
    }

    @Override // p.sqe1
    public final int h() {
        return this.g.length;
    }

    @Override // p.sqe1
    public final Object l(int i) {
        int i2 = this.g[i];
        return ((nv81) this.e.get(i2)).a(i - this.f[i2]);
    }

    @Override // p.sqe1
    public final oqe1 n(int i, oqe1 oqe1Var, long j) {
        nv81 nv81Var = (nv81) this.e.get(i);
        int i2 = this.f[i];
        b380 b380Var = nv81Var.f104p;
        oqe1Var.d(nv81Var.a, nv81Var.c, nv81Var.e, nv81Var.g, nv81Var.h, nv81Var.i, nv81Var.j, nv81Var.k, nv81Var.f, nv81Var.l, nv81Var.m, i2, (i2 + (b380Var.isEmpty() ? 1 : b380Var.size())) - 1, nv81Var.n);
        oqe1Var.k = nv81Var.o;
        return oqe1Var;
    }

    @Override // p.sqe1
    public final int o() {
        return this.e.size();
    }
}

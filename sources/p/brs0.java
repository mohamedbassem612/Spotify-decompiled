package p;

import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class brs0 extends c9 {
    public final Object[] a;
    public final Object[] b;
    public final int c;
    public final int d;

    public brs0(int i, int i2, Object[] objArr, Object[] objArr2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (b() > 32) {
            return;
        }
        hhg1.f(u890.A(Integer.valueOf(b()), "Trie-based persistent vector should have at least 33 elements, got "));
        throw null;
    }

    public final int b() {
        return this.c;
    }

    public final Object get(int i) {
        Object[] objArr;
        int i2 = this.c;
        wxo1.m(i, i2);
        if (((i2 - 1) & (-32)) <= i) {
            objArr = this.b;
        } else {
            Object[] objArr2 = this.a;
            for (int i3 = this.d; i3 > 0; i3 -= 5) {
                Object[] objArr3 = objArr2[ouo1.c0(i, i3)];
                if (objArr3 == null) {
                    bhn0.i("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    return null;
                }
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final ListIterator listIterator(int i) {
        wxo1.n(i, this.c);
        return new frs0(i, this.c, (this.d / 5) + 1, this.a, this.b);
    }
}

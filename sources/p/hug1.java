package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hug1 extends h7 {
    public int c;
    public Object[] d;
    public boolean e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public hug1(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
        Object[] objArr2 = new Object[i3];
        this.d = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.e = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = ((h7) this).a & 31;
        Object obj = this.d[this.c - 1];
        if (obj != null) {
            return ((Object[]) obj)[i];
        }
        bhn0.i("null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return null;
    }

    public final void b(int i, int i2) {
        int i3 = (this.c - i2) * 5;
        while (i2 < this.c) {
            Object[] objArr = this.d;
            Object obj = objArr[i2 - 1];
            if (obj == null) {
                bhn0.i("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                return;
            } else {
                objArr[i2] = ((Object[]) obj)[ouo1.c0(i, i3)];
                i3 -= 5;
                i2++;
            }
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (ouo1.c0(((h7) this).a, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(((h7) this).a, ((this.c - 1) - (i2 / 5)) + 1);
        }
    }

    public final Object next() {
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        Object objA = a();
        int i = ((h7) this).a + 1;
        ((h7) this).a = i;
        if (i == ((h7) this).b) {
            this.e = true;
            return objA;
        }
        c(0);
        return objA;
    }

    public final Object previous() {
        if (!hasPrevious()) {
            hhg1.k();
            return null;
        }
        ((h7) this).a--;
        if (this.e) {
            this.e = false;
            return a();
        }
        c(31);
        return a();
    }
}

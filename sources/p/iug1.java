package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iug1 extends i7 {
    public int c;
    public Object[] d;
    public boolean e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public iug1(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
        Object[] objArr2 = new Object[i3];
        this.d = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.e = r5;
        objArr2[0] = objArr;
        d(i - r5, 1);
    }

    public final Object c() {
        return ((Object[]) this.d[this.c - 1])[this.a & 31];
    }

    public final void d(int i, int i2) {
        int i3 = (this.c - i2) * 5;
        while (i2 < this.c) {
            Object[] objArr = this.d;
            objArr[i2] = ((Object[]) objArr[i2 - 1])[uwo1.o(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void e(int i) {
        int i2 = 0;
        while (uwo1.o(this.a, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            d(this.a, ((this.c - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        Object objC = c();
        int i = this.a + 1;
        this.a = i;
        if (i == this.b) {
            this.e = true;
            return objC;
        }
        e(0);
        return objC;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            hhg1.k();
            return null;
        }
        this.a--;
        if (this.e) {
            this.e = false;
            return c();
        }
        e(31);
        return c();
    }
}

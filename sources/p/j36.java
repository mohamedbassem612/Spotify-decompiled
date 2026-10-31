package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j36 implements CharSequence {
    public final char[] a;
    public int b;

    public j36(char[] cArr) {
        this.a = cArr;
        this.b = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int iMin = Math.min(i2, this.b);
        char[] cArr = this.a;
        eqr0.o(i, iMin, cArr.length);
        return new String(cArr, i, iMin - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.b;
        int iMin = Math.min(i, i);
        char[] cArr = this.a;
        eqr0.o(0, iMin, cArr.length);
        return new String(cArr, 0, iMin);
    }
}

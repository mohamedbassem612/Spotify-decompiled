package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f36 implements g36 {
    @Override // p.g36
    public final void b(wat watVar, int i, int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = iArr[i2];
            iArr2[i3] = i4;
            i4 += i5;
            i2++;
            i3++;
        }
    }

    public final String toString() {
        return "Arrangement#Top";
    }
}

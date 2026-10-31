package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hab1 {
    public final int[] a(int i, int i2) {
        int i3;
        int i4 = i - i2;
        int i5 = i4 / 2;
        int i6 = i4 % 2;
        int[] iArr = new int[2];
        int i7 = 0;
        while (i7 < 2) {
            if (i5 < 0) {
                i3 = 0;
            } else {
                i3 = (i7 < i6 ? 1 : 0) + i5;
            }
            iArr[i7] = i3;
            i7++;
        }
        return iArr;
    }

    public final boolean equals(Object obj) {
        return obj instanceof hab1;
    }

    public final int hashCode() {
        return -2;
    }
}

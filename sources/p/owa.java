package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class owa implements Cloneable {
    public int b = 0;
    public int[] a = new int[1];

    public final void a(boolean z) {
        d(this.b + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.b++;
    }

    public final void b(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            hhg1.n("Num bits must be between 0 and 32");
            return;
        }
        d(this.b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.a.clone();
        int i = this.b;
        owa owaVar = new owa();
        owaVar.a = iArr;
        owaVar.b = i;
        return owaVar;
    }

    public final void d(int i) {
        int[] iArr = this.a;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.a = iArr2;
        }
    }

    public final boolean e(int i) {
        return (this.a[i / 32] & (1 << (i & 31))) != 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof owa)) {
            return false;
        }
        owa owaVar = (owa) obj;
        return this.b == owaVar.b && Arrays.equals(this.a, owaVar.a);
    }

    public final int g() {
        return (this.b + 7) / 8;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + (this.b * 31);
    }

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(e(i2) ? 'X' : '.');
        }
        return sb.toString();
    }
}

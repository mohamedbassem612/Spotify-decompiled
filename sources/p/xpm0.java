package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xpm0 {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i2;
        this.b = kqn1.a[3 - i3];
        int i6 = kqn1.b[i5];
        this.d = i6;
        if (i2 == 2) {
            i6 /= 2;
            this.d = i6;
        } else if (i2 == 0) {
            i6 /= 4;
            this.d = i6;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    bhn0.q();
                    return false;
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.g = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? kqn1.c[i4 - 1] : kqn1.d[i4 - 1];
            this.f = i9;
            this.c = (((i9 * 12) / i6) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? kqn1.e[i4 - 1] : kqn1.f[i4 - 1];
                this.f = i10;
                this.c = ywx0.j(i10, 144, i6, i7);
            } else {
                int i11 = kqn1.g[i4 - 1];
                this.f = i11;
                this.c = ywx0.j(i3 == 1 ? 72 : 144, i11, i6, i7);
            }
        }
        this.e = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}

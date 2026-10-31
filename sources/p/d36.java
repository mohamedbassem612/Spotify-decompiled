package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d36 implements c36, g36 {
    public final float a;
    public final boolean b;
    public final e36 c;
    public final float d;

    public d36(float f, boolean z, e36 e36Var) {
        this.a = f;
        this.b = z;
        this.c = e36Var;
        this.d = f;
    }

    @Override // p.c36, p.g36
    public final float a() {
        return this.d;
    }

    @Override // p.g36
    public final void b(wat watVar, int i, int[] iArr, int[] iArr2) {
        e(watVar, i, iArr, flb0.a, iArr2);
    }

    @Override // p.c36
    public final void e(wat watVar, int i, int[] iArr, flb0 flb0Var, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iI0 = watVar.i0(this.a);
        boolean z = this.b && flb0Var == flb0.b;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iI0, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iI0, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        e36 e36Var = this.c;
        if (e36Var == null || i2 <= 0) {
            return;
        }
        int iA = e36Var.a(i2, flb0Var);
        if (z) {
            iA -= i2;
        }
        if (iA != 0) {
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + iA;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d36)) {
            return false;
        }
        d36 d36Var = (d36) obj;
        return p3v.c(this.a, d36Var.a) && this.b == d36Var.b && u890.j(this.c, d36Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(Float.hashCode(this.a) * 31, 31, this.b);
        e36 e36Var = this.c;
        return iG + (e36Var == null ? 0 : e36Var.hashCode());
    }

    public final String toString() {
        return (this.b ? "" : "Absolute") + "Arrangement#spacedAligned(" + p3v.d(this.a) + ", " + this.c + ")";
    }
}

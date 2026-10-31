package p;

import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yzr0 implements CharSequence {
    public CharSequence a;
    public t340 b;
    public int c;
    public int d;

    public final void a(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            tf80.a("start=" + i + " > end=" + i2);
        }
        if (i3 > i4) {
            tf80.a("textStart=" + i3 + " > textEnd=" + i4);
        }
        if (i < 0) {
            tf80.a("start must be non-negative, but was " + i);
        }
        if (i3 < 0) {
            tf80.a("textStart must be non-negative, but was " + i3);
        }
        t340 t340Var = this.b;
        int i5 = i4 - i3;
        if (t340Var == null) {
            int iMax = Math.max(255, i5 + SemanticState.Focused);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.a.length() - i2, 64);
            int i6 = i - iMin;
            tx9.u(this.a, cArr, 0, i6, i);
            int i7 = iMax - iMin2;
            int i8 = iMin2 + i2;
            tx9.u(this.a, cArr, i7, i2, i8);
            tx9.u(charSequence, cArr, iMin, i3, i4);
            t340 t340Var2 = new t340((byte) 1);
            t340Var2.b = iMax;
            t340Var2.c = cArr;
            t340Var2.d = iMin + i5;
            t340Var2.e = i7;
            this.b = t340Var2;
            this.c = i6;
            this.d = i8;
            return;
        }
        int i9 = this.c;
        int i10 = i - i9;
        int i11 = i2 - i9;
        if (i10 < 0 || i11 > t340Var.b - t340Var.a()) {
            this.a = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            a(i, i2, charSequence, i3, i4);
            return;
        }
        int i12 = i5 - (i11 - i10);
        if (i12 > t340Var.a()) {
            int iA = i12 - t340Var.a();
            int i13 = t340Var.b;
            do {
                i13 *= 2;
            } while (i13 - t340Var.b < iA);
            char[] cArr2 = new char[i13];
            f46.R(t340Var.c, cArr2, 0, 0, t340Var.d);
            int i14 = t340Var.b;
            int i15 = t340Var.e;
            int i16 = i14 - i15;
            int i17 = i13 - i16;
            f46.R(t340Var.c, cArr2, i17, i15, i16 + i15);
            t340Var.c = cArr2;
            t340Var.b = i13;
            t340Var.e = i17;
        }
        int i18 = t340Var.d;
        if (i10 < i18 && i11 <= i18) {
            int i19 = i18 - i11;
            char[] cArr3 = t340Var.c;
            f46.R(cArr3, cArr3, t340Var.e - i19, i11, i18);
            t340Var.d = i10;
            t340Var.e -= i19;
        } else if (i10 >= i18 || i11 < i18) {
            int iA2 = t340Var.a() + i10;
            int iA3 = t340Var.a() + i11;
            int i20 = t340Var.e;
            char[] cArr4 = t340Var.c;
            f46.R(cArr4, cArr4, t340Var.d, i20, iA2);
            i10 = t340Var.d + (iA2 - i20);
            t340Var.d = i10;
            t340Var.e = iA3;
        } else {
            t340Var.e = t340Var.a() + i11;
            t340Var.d = i10;
        }
        tx9.u(charSequence, t340Var.c, i10, i3, i4);
        t340Var.d += i5;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        t340 t340Var = this.b;
        if (t340Var == null) {
            return this.a.charAt(i);
        }
        if (i < this.c) {
            return this.a.charAt(i);
        }
        int iA = t340Var.b - t340Var.a();
        int i2 = this.c;
        if (i >= iA + i2) {
            return this.a.charAt(i - ((iA - this.d) + i2));
        }
        int i3 = i - i2;
        int i4 = t340Var.d;
        char[] cArr = t340Var.c;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + t340Var.e];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        t340 t340Var = this.b;
        CharSequence charSequence = this.a;
        if (t340Var == null) {
            return charSequence.length();
        }
        return (t340Var.b - t340Var.a()) + (charSequence.length() - (this.d - this.c));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        t340 t340Var = this.b;
        if (t340Var == null) {
            return this.a.toString();
        }
        StringBuilder sb = new StringBuilder((this.a.length() + ((t340Var.b - t340Var.a()) + this.c)) - this.d);
        sb.append(this.a, 0, this.c);
        sb.append(t340Var.c, 0, t340Var.d);
        char[] cArr = t340Var.c;
        int i = t340Var.e;
        sb.append(cArr, i, t340Var.b - i);
        CharSequence charSequence = this.a;
        sb.append(charSequence, this.d, charSequence.length());
        return sb.toString();
    }
}

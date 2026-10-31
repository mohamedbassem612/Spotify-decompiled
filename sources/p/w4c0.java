package p;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.p000rive.semantics.SemanticState;
import com.google.android.recaptcha.internal.zzakh;
import com.spotify.yourlibrary.uiusecases.filterrow.chips.LibraryChipBackgroundView;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w4c0 implements u4c0 {
    public static final ejb f = new ejb((byte) 18);
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public w4c0(ConstraintLayout constraintLayout) {
        this.a = (byte) 0;
        this.d = constraintLayout;
        constraintLayout.getResources().getDimensionPixelSize(2131166199);
        constraintLayout.getResources().getDimensionPixelSize(2131166200);
        this.b = constraintLayout.getResources().getDimensionPixelSize(2131166205);
        constraintLayout.getResources().getDimensionPixelSize(2131166201);
        this.e = new o860(constraintLayout);
        new LinkedHashMap();
        int dimensionPixelSize = constraintLayout.getResources().getDimensionPixelSize(2131166204);
        WeakHashMap weakHashMap = b8k1.a;
        this.c = constraintLayout.getPaddingStart() != dimensionPixelSize ? dimensionPixelSize : 0;
    }

    public static int f(int i, int i2) {
        return h(i2) + m(i);
    }

    public static int g(int i, int i2) {
        return h(i2) + m(i);
    }

    public static int h(int i) {
        if (i >= 0) {
            return k(i);
        }
        return 10;
    }

    public static int i(int i, t8 t8Var) {
        return j(t8Var) + m(i);
    }

    public static int j(t8 t8Var) {
        int iA = t8Var.a();
        return k(iA) + iA;
    }

    public static int k(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int l(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int m(int i) {
        return k(i << 3);
    }

    public static w4c0 y(OutputStream outputStream, int i) {
        return new w4c0(outputStream, new byte[i]);
    }

    public Object A(long j, boolean z) {
        Object objD = null;
        long j2 = Long.MAX_VALUE;
        while (this.c > 0) {
            long j3 = j - ((long[]) this.d)[this.b];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objD = D();
            j2 = j3;
        }
        return objD;
    }

    public synchronized Object B() {
        return this.c == 0 ? null : D();
    }

    public synchronized Object C(long j) {
        return A(j, true);
    }

    public Object D() {
        dm5.y(this.c > 0);
        Object[] objArr = (Object[]) this.e;
        int i = this.b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.b = (i + 1) % objArr.length;
        this.c--;
        return obj;
    }

    public int E(int i) {
        d(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (u(iPreceding) && q(iPreceding) && !t(iPreceding)) ? E(iPreceding) : iPreceding;
    }

    public void F() throws IOException {
        ((OutputStream) this.e).write((byte[]) this.d, 0, this.c);
        this.c = 0;
    }

    public void G(int i, int i2, String str) {
        if (i > i2) {
            rf80.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            rf80.a("start must be non-negative, but was " + i);
        }
        t340 t340Var = (t340) this.e;
        if (t340Var == null) {
            int iMax = Math.max(255, str.length() + SemanticState.Focused);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            int i3 = i - iMin;
            ((String) this.d).getChars(i3, i, cArr, 0);
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            ((String) this.d).getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            t340 t340Var2 = new t340((byte) 0);
            t340Var2.b = iMax;
            t340Var2.c = cArr;
            t340Var2.d = length;
            t340Var2.e = i4;
            this.e = t340Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > t340Var.b - t340Var.a()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            G(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > t340Var.a()) {
            int iA = length2 - t340Var.a();
            int i9 = t340Var.b;
            do {
                i9 *= 2;
            } while (i9 - t340Var.b < iA);
            char[] cArr2 = new char[i9];
            f46.R(t340Var.c, cArr2, 0, 0, t340Var.d);
            int i10 = t340Var.b;
            int i11 = t340Var.e;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            f46.R(t340Var.c, cArr2, i13, i11, i12 + i11);
            t340Var.c = cArr2;
            t340Var.b = i9;
            t340Var.e = i13;
        }
        int i14 = t340Var.d;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = t340Var.c;
            f46.R(cArr3, cArr3, t340Var.e - i15, i8, i14);
            t340Var.d = i7;
            t340Var.e -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iA2 = t340Var.a() + i7;
            int iA3 = t340Var.a() + i8;
            int i16 = t340Var.e;
            char[] cArr4 = t340Var.c;
            f46.R(cArr4, cArr4, t340Var.d, i16, iA2);
            i7 = t340Var.d + (iA2 - i16);
            t340Var.d = i7;
            t340Var.e = iA3;
        } else {
            t340Var.e = t340Var.a() + i8;
            t340Var.d = i7;
        }
        str.getChars(0, str.length(), t340Var.c, i7);
        t340Var.d = str.length() + t340Var.d;
    }

    public void H(String str) {
        String strP = asj0.p(str);
        dm5.o(strP == null || asj0.k(strP), "Not an audio MIME type: %s", strP);
        this.d = strP;
    }

    public void I(int i) {
        this.b = i;
    }

    public void J(int i) {
        this.c = i;
    }

    public void K(TextDirectionHeuristic textDirectionHeuristic) {
        this.e = textDirectionHeuristic;
    }

    public void L(String str) {
        String strP = asj0.p(str);
        dm5.o(strP == null || asj0.o(strP), "Not a video MIME type: %s", strP);
        this.e = strP;
    }

    public synchronized int M() {
        return this.c;
    }

    public void N(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        x(i4, i5, i3, 1);
        int i6 = i2 - 1;
        x(i4, i6, i3, 2);
        int i7 = i - 1;
        x(i7, i5, i3, 3);
        x(i7, i6, i3, 4);
        x(i7, i2, i3, 5);
        x(i, i5, i3, 6);
        x(i, i6, i3, 7);
        x(i, i2, i3, 8);
    }

    public void O(int i, int i2) throws IOException {
        a0(i, 0);
        Q(i2);
    }

    public void P(int i, int i2) throws IOException {
        a0(i, 0);
        Q(i2);
    }

    public void Q(int i) throws IOException {
        if (i >= 0) {
            Y(i);
        } else {
            Z(i);
        }
    }

    public void R(int i, t8 t8Var) throws IOException {
        a0(i, 2);
        S(t8Var);
    }

    public void S(t8 t8Var) throws IOException {
        Y(t8Var.a());
        t8Var.d(this);
    }

    public void T(int i) throws IOException {
        byte b = (byte) i;
        if (this.c == this.b) {
            F();
        }
        byte[] bArr = (byte[]) this.d;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr[i2] = b;
    }

    public void U(qhc qhcVar) throws IOException {
        int size = qhcVar.size();
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        byte[] bArr = (byte[]) this.d;
        if (i3 >= size) {
            qhcVar.d(0, bArr, i2, size);
            this.c += size;
            return;
        }
        qhcVar.d(0, bArr, i2, i3);
        int i4 = size - i3;
        this.c = i;
        F();
        if (i4 <= i) {
            qhcVar.d(i3, bArr, 0, i4);
            this.c = i4;
            return;
        }
        OutputStream outputStream = (OutputStream) this.e;
        if (i3 < 0) {
            q58.g(30, i3, "Source offset < 0: ");
            return;
        }
        if (i4 < 0) {
            q58.g(23, i4, "Length < 0: ");
            return;
        }
        int i5 = i3 + i4;
        if (i5 > qhcVar.size()) {
            q58.g(39, i5, "Source end offset exceeded: ");
        } else if (i4 > 0) {
            qhcVar.r(outputStream, i3, i4);
        }
    }

    public void V(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        byte[] bArr2 = (byte[]) this.d;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i2, length);
            this.c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i2, i3);
        int i4 = length - i3;
        this.c = i;
        F();
        if (i4 > i) {
            ((OutputStream) this.e).write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.c = i4;
        }
    }

    public void W(int i) throws IOException {
        T(i & 255);
        T((i >> 8) & 255);
        T((i >> 16) & 255);
        T((i >> 24) & 255);
    }

    public void X(long j) throws IOException {
        T(((int) j) & 255);
        T(((int) (j >> 8)) & 255);
        T(((int) (j >> 16)) & 255);
        T(((int) (j >> 24)) & 255);
        T(((int) (j >> 32)) & 255);
        T(((int) (j >> 40)) & 255);
        T(((int) (j >> 48)) & 255);
        T(((int) (j >> 56)) & 255);
    }

    public void Y(int i) throws IOException {
        while ((i & (-128)) != 0) {
            T((i & 127) | SemanticState.Focused);
            i >>>= 7;
        }
        T(i);
    }

    public void Z(long j) throws IOException {
        while (((-128) & j) != 0) {
            T((((int) j) & 127) | SemanticState.Focused);
            j >>>= 7;
        }
        T((int) j);
    }

    public synchronized void a(long j, Object obj) {
        int i = this.c;
        if (i > 0) {
            if (j <= ((long[]) this.d)[((this.b + i) - 1) % ((Object[]) this.e).length]) {
                e();
            }
        }
        n();
        int i2 = this.b;
        int i3 = this.c;
        Object[] objArr = (Object[]) this.e;
        int length = (i2 + i3) % objArr.length;
        ((long[]) this.d)[length] = j;
        objArr[length] = obj;
        this.c = i3 + 1;
    }

    public void a0(int i, int i2) throws IOException {
        Y((i << 3) | i2);
    }

    public zlv0 b() {
        return new zlv0((TextPaint) this.d, (TextDirectionHeuristic) this.e, this.b, this.c);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzakh */
    public void b0(int i, int i2) throws zzakh {
        k0((i << 3) | i2);
    }

    public zfg1 c() {
        return new zfg1(this.b, (String) this.d, (String) this.e, this.c);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzakh */
    public void c0(int i, int i2) throws zzakh {
        k0(i << 3);
        j0(i2);
    }

    public void d(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbQ = cy30.q(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        sbQ.append(i3);
        sbQ.append("]");
        rf80.a(sbQ.toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzakh */
    public void d0(int i, int i2) throws zzakh {
        k0(i << 3);
        k0(i2);
    }

    public synchronized void e() {
        this.b = 0;
        this.c = 0;
        Arrays.fill((Object[]) this.e, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzakh */
    public void e0(int i, int i2) throws zzakh {
        k0((i << 3) | 5);
        l0(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzakh */
    public void f0(int i, long j) throws zzakh {
        k0(i << 3);
        m0(j);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzakh */
    public void g0(int i, long j) throws zzakh {
        k0((i << 3) | 1);
        n0(j);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzakh */
    public void h0(int i, String str) throws zzakh {
        int i2;
        char c;
        int i3;
        char c2;
        int i4;
        int i5;
        char cCharAt;
        k0((i << 3) | 2);
        int i6 = fkn1.a;
        int i7 = this.c;
        try {
            int iNumberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(str.length()) * 9)) >>> 6;
            int i8 = i7 + iNumberOfLeadingZeros;
            this.c = i8;
            byte[] bArr = (byte[]) this.e;
            int length = bArr.length - i8;
            int length2 = str.length();
            int i9 = 0;
            while (true) {
                i2 = i8 + length;
                c = 128;
                if (i9 >= length2 || (i5 = i9 + i8) >= i2 || (cCharAt = str.charAt(i9)) >= 128) {
                    break;
                }
                bArr[i5] = (byte) cCharAt;
                i9++;
            }
            if (i9 == length2) {
                i3 = length2 + i8;
            } else {
                int i10 = i8 + i9;
                while (true) {
                    if (i9 >= length2) {
                        i3 = i10;
                    } else {
                        char cCharAt2 = str.charAt(i9);
                        if (cCharAt2 < c && i10 < i2) {
                            bArr[i10] = (byte) cCharAt2;
                            c2 = c;
                            i10++;
                        } else if (cCharAt2 < 2048 && i10 <= i2 - 2) {
                            bArr[i10] = (byte) ((cCharAt2 >>> 6) | 960);
                            bArr[i10 + 1] = (byte) ((cCharAt2 & '?') | c);
                            c2 = c;
                            i10 += 2;
                        } else if ((cCharAt2 < 55296 || cCharAt2 > 57343) && i10 <= i2 - 3) {
                            int i11 = i10 + 3;
                            bArr[i10] = (byte) ((cCharAt2 >>> '\f') | 480);
                            bArr[i10 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | SemanticState.Focused);
                            bArr[i10 + 2] = (byte) ((cCharAt2 & '?') | SemanticState.Focused);
                            i10 = i11;
                            c2 = 128;
                        } else {
                            if (i10 <= i2 - 4) {
                                i9++;
                                if (i9 != str.length()) {
                                    char cCharAt3 = str.charAt(i9);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        int i12 = i10 + 3;
                                        bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                                        c2 = 128;
                                        bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | SemanticState.Focused);
                                        bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | SemanticState.Focused);
                                        i10 += 4;
                                        bArr[i12] = (byte) ((codePoint & 63) | SemanticState.Focused);
                                    }
                                }
                                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                                length2 = bytes.length;
                                if (length2 - i8 > length) {
                                    throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                                }
                                System.arraycopy(bytes, 0, bArr, i8, length2);
                            } else {
                                if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i4 = i9 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
                                    throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                                }
                                byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                                length2 = bytes2.length;
                                if (length2 - i8 > length) {
                                    throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                                }
                                System.arraycopy(bytes2, 0, bArr, i8, length2);
                            }
                            i3 = length2 + i8;
                        }
                        i9++;
                        c = c2;
                        length2 = length2;
                    }
                }
            }
            int i13 = (i3 - i7) - iNumberOfLeadingZeros;
            int iNumberOfLeadingZeros2 = (352 - (Integer.numberOfLeadingZeros(i13) * 9)) >>> 6;
            if (iNumberOfLeadingZeros2 != iNumberOfLeadingZeros) {
                System.arraycopy(bArr, i8, bArr, i7 + iNumberOfLeadingZeros2, i13);
            }
            this.c = i7;
            k0(i13);
            this.c = i7 + iNumberOfLeadingZeros2 + i13;
        } catch (IndexOutOfBoundsException e) {
            throw new zzakh("CodedOutputStream was writing to a flat byte array and ran out of space.", e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzakh */
    public void i0(int i, ain1 ain1Var) throws zzakh {
        k0((i << 3) | 2);
        k0(ain1Var.f());
        ain1Var.n(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzakh */
    public void j0(int i) throws zzakh {
        IndexOutOfBoundsException indexOutOfBoundsException;
        if (i >= 0) {
            k0(i);
            return;
        }
        int i2 = this.c;
        try {
            byte[] bArr = (byte[]) this.e;
            long j = i;
            int i3 = i2 + 1;
            try {
                bArr[i2] = (byte) (((int) j) | SemanticState.Focused);
                int i4 = i2 + 2;
                try {
                    bArr[i3] = (byte) (((int) (j >>> 7)) | SemanticState.Focused);
                    int i5 = i2 + 3;
                    bArr[i4] = (byte) (((int) (j >>> 14)) | SemanticState.Focused);
                    i4 = i2 + 4;
                    bArr[i5] = (byte) (((int) (j >>> 21)) | SemanticState.Focused);
                    int i6 = i2 + 5;
                    bArr[i4] = (byte) (((int) (j >>> 28)) | SemanticState.Focused);
                    int i7 = i2 + 6;
                    try {
                        bArr[i6] = -1;
                        int i8 = i2 + 7;
                        bArr[i7] = -1;
                        i7 = i2 + 8;
                        bArr[i8] = -1;
                        i3 = i2 + 9;
                        bArr[i7] = -1;
                        i2 += 10;
                        bArr[i3] = 1;
                        this.c = i2;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i2 = i7;
                        throw new zzakh(i2, this.b, 10, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i2 = i4;
                }
            } catch (IndexOutOfBoundsException e3) {
                i2 = i3;
                indexOutOfBoundsException = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzakh */
    public void k0(int i) throws zzakh {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.c;
        int i3 = i & (-128);
        byte[] bArr = (byte[]) this.e;
        try {
            if (i3 == 0) {
                int i4 = i2 + 1;
                bArr[i2] = (byte) i;
                this.c = i4;
                return;
            }
            int i5 = i2 + 1;
            bArr[i2] = (byte) (i | SemanticState.Focused);
            int i6 = i >>> 7;
            try {
                if ((i6 & (-128)) == 0) {
                    int i7 = i2 + 2;
                    bArr[i5] = (byte) i6;
                    this.c = i7;
                    return;
                }
                int i8 = i2 + 2;
                try {
                    bArr[i5] = (byte) (i6 | SemanticState.Focused);
                    int i9 = i >>> 14;
                    if ((i9 & (-128)) == 0) {
                        int i10 = i2 + 3;
                        bArr[i8] = (byte) i9;
                        this.c = i10;
                        return;
                    }
                    int i11 = i2 + 3;
                    try {
                        bArr[i8] = (byte) (i9 | SemanticState.Focused);
                        int i12 = i >>> 21;
                        if ((i12 & (-128)) == 0) {
                            int i13 = i2 + 4;
                            bArr[i11] = (byte) i12;
                            this.c = i13;
                            return;
                        } else {
                            i8 = i2 + 4;
                            bArr[i11] = (byte) (i12 | SemanticState.Focused);
                            int i14 = i2 + 5;
                            bArr[i8] = (byte) (i >>> 28);
                            this.c = i14;
                            return;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i3 = i11;
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i3 = i8;
                }
                throw new zzakh(i3, this.b, 1, indexOutOfBoundsException);
            } catch (IndexOutOfBoundsException e3) {
                i3 = i;
                indexOutOfBoundsException = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzakh */
    public void l0(int i) throws zzakh {
        int i2 = this.c;
        try {
            byte[] bArr = (byte[]) this.e;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.c = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzakh(i2, this.b, 4, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzakh */
    public void m0(long j) throws zzakh {
        long j2 = j & (-128);
        int i = this.c;
        byte[] bArr = (byte[]) this.e;
        try {
            if (j2 == 0) {
                bArr[i] = (byte) j;
                this.c = i + 1;
                return;
            }
            bArr[i] = (byte) (((int) j) | SemanticState.Focused);
            int i2 = i + 1;
            long j3 = j >>> 7;
            long j4 = j3 & (-128);
            int i3 = (int) j3;
            if (j4 == 0) {
                bArr[i2] = (byte) i3;
                this.c = i + 2;
                return;
            }
            bArr[i2] = (byte) (i3 | SemanticState.Focused);
            int i4 = i + 2;
            long j5 = j >>> 14;
            long j6 = j5 & (-128);
            int i5 = (int) j5;
            if (j6 == 0) {
                bArr[i4] = (byte) i5;
                this.c = i + 3;
                return;
            }
            bArr[i4] = (byte) (i5 | SemanticState.Focused);
            int i6 = i + 3;
            long j7 = j >>> 21;
            long j8 = j7 & (-128);
            int i7 = (int) j7;
            if (j8 == 0) {
                bArr[i6] = (byte) i7;
                this.c = i + 4;
                return;
            }
            bArr[i6] = (byte) (i7 | SemanticState.Focused);
            int i8 = i + 4;
            long j9 = j >>> 28;
            long j10 = j9 & (-128);
            int i9 = (int) j9;
            if (j10 == 0) {
                bArr[i8] = (byte) i9;
                this.c = i + 5;
                return;
            }
            bArr[i8] = (byte) (i9 | SemanticState.Focused);
            int i10 = i + 5;
            long j11 = j >>> 35;
            long j12 = j11 & (-128);
            int i11 = (int) j11;
            if (j12 == 0) {
                bArr[i10] = (byte) i11;
                this.c = i + 6;
                return;
            }
            bArr[i10] = (byte) (i11 | SemanticState.Focused);
            int i12 = i + 6;
            long j13 = j >>> 42;
            long j14 = j13 & (-128);
            int i13 = (int) j13;
            if (j14 == 0) {
                bArr[i12] = (byte) i13;
                this.c = i + 7;
                return;
            }
            bArr[i12] = (byte) (i13 | SemanticState.Focused);
            int i14 = i + 7;
            long j15 = j >>> 49;
            long j16 = j15 & (-128);
            int i15 = (int) j15;
            if (j16 == 0) {
                bArr[i14] = (byte) i15;
                this.c = i + 8;
                return;
            }
            bArr[i14] = (byte) (i15 | SemanticState.Focused);
            int i16 = i + 8;
            long j17 = j >>> 56;
            int i17 = (int) j17;
            if (((-128) & j17) == 0) {
                bArr[i16] = (byte) i17;
                this.c = i + 9;
            } else {
                bArr[i16] = (byte) (i17 | SemanticState.Focused);
                bArr[i + 9] = (byte) (j >>> 63);
                this.c = i + 10;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzakh(i, this.b, 1, e);
        }
    }

    public void n() {
        int length = ((Object[]) this.e).length;
        if (this.c < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.b;
        int i3 = length - i2;
        System.arraycopy((long[]) this.d, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.e, this.b, objArr, 0, i3);
        int i4 = this.b;
        if (i4 > 0) {
            System.arraycopy((long[]) this.d, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.e, 0, objArr, i3, this.b);
        }
        this.d = jArr;
        this.e = objArr;
        this.b = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzakh */
    public void n0(long j) throws zzakh {
        int i = this.c;
        try {
            byte[] bArr = (byte[]) this.e;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.c = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzakh(i, this.b, 8, e);
        }
    }

    public void o() throws IOException {
        F();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzakh */
    public void o0(int i, byte[] bArr, int i2) throws zzakh {
        try {
            System.arraycopy(bArr, i, (byte[]) this.e, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzakh(this.c, this.b, i2, e);
        }
    }

    public int p() {
        t340 t340Var = (t340) this.e;
        String str = (String) this.d;
        if (t340Var == null) {
            return str.length();
        }
        return (t340Var.b - t340Var.a()) + (str.length() - (this.c - this.b));
    }

    public boolean q(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!a4x.d()) {
                    return false;
                }
                a4x a4xVarA = a4x.a();
                if (a4xVarA.c() != 1 || a4xVarA.b(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean r(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return i541.H(Character.codePointBefore((CharSequence) this.d, i));
    }

    public boolean s(int i) {
        d(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (u(i) && u(i - 1) && u(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(t(i) || t(i + 1));
    }

    public boolean t(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (u890.j(unicodeBlockOf, unicodeBlock) && u890.j(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return u890.j(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && u890.j(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public String toString() {
        switch (this.a) {
            case 4:
                t340 t340Var = (t340) this.e;
                String str = (String) this.d;
                if (t340Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append(t340Var.c, 0, t340Var.d);
                char[] cArr = t340Var.c;
                int i = t340Var.e;
                sb.append(cArr, i, t340Var.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean u(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!a4x.d()) {
                return false;
            }
            a4x a4xVarA = a4x.a();
            if (a4xVarA.c() != 1 || a4xVarA.b(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean v(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return i541.H(Character.codePointAt((CharSequence) this.d, i));
    }

    public kil w(List list, e5q0 e5q0Var) {
        kil kilVar = new kil();
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            if (it.hasNext()) {
                throw pze0.g(it);
            }
        }
        int i = this.b;
        o860 o860Var = (o860) this.e;
        idd1 idd1Var = (idd1) o860Var.c;
        idd1 idd1Var2 = (idd1) o860Var.d;
        ConstraintLayout constraintLayout = (ConstraintLayout) o860Var.b;
        View viewFindViewById = constraintLayout.findViewById(2131429758);
        if (viewFindViewById == null) {
            Context context = constraintLayout.getContext();
            Resources resources = constraintLayout.getResources();
            Drawable drawable = context.getDrawable(2131233454);
            Drawable drawable2 = context.getDrawable(2131232947);
            drawable2.getClass();
            Drawable drawableMutate = drawable2.mutate();
            drawableMutate.setTint(context.getColor(2131104462));
            drawableMutate.setBounds(0, 0, ((Number) idd1Var2.getValue()).intValue(), ((Number) idd1Var2.getValue()).intValue());
            float fIntValue = ((Number) idd1Var2.getValue()).intValue() / ((Number) idd1Var.getValue()).intValue();
            float fIntValue2 = ((Number) ((idd1) o860Var.e).getValue()).intValue() / ((Number) idd1Var.getValue()).intValue();
            x10 x10Var = new x10(drawableMutate, fIntValue);
            if (drawable == null) {
                eg.m("Required value was null.");
                return null;
            }
            LayerDrawable layerDrawable = new LayerDrawable(new x10[]{new x10(drawable, fIntValue2), x10Var});
            View libraryChipBackgroundView = new LibraryChipBackgroundView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            int color = context.getColor(2131102454);
            w9w0 w9w0Var = new w9w0();
            w9w0Var.a = lm5.g(color, 10);
            w9w0Var.addState(new int[]{R.attr.state_pressed}, layerDrawable);
            w9w0Var.addState(new int[0], layerDrawable);
            libraryChipBackgroundView.setBackground(w9w0Var);
            libraryChipBackgroundView.setId(2131429758);
            libraryChipBackgroundView.setTag(2131429760, Boolean.TRUE);
            libraryChipBackgroundView.setContentDescription(resources.getString(2131956007));
            libraryChipBackgroundView.setMinimumHeight(((Number) idd1Var.getValue()).intValue());
            b2u.o(libraryChipBackgroundView).a();
            libraryChipBackgroundView.setAlpha(0.0f);
            constraintLayout.addView(libraryChipBackgroundView);
            viewFindViewById = libraryChipBackgroundView;
        }
        viewFindViewById.setOnClickListener(new zfs(e5q0Var, (byte) 29));
        kilVar.l(2131429758).e.c = i;
        kilVar.i(2131429758, i);
        kilVar.g(2131429758, 6, 0, 6);
        kilVar.g(2131429758, 3, 0, 3);
        kilVar.g(2131429758, 4, 0, 4);
        kilVar.u(2131429758, 6, this.c);
        kilVar.v(2131429758, 4);
        kilVar.l(2131429758).c.d = 0.0f;
        viewFindViewById.setOnClickListener(null);
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it2 = list2.iterator();
        if (it2.hasNext()) {
            throw pze0.g(it2);
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            pze0.m(it3.next());
            pze0.m(o7h.s0(arrayList));
            bno1.t((ConstraintLayout) this.d);
            throw null;
        }
        Iterator it4 = o7h.T0(arrayList).iterator();
        if (!it4.hasNext()) {
            return kilVar;
        }
        pze0.m(it4.next());
        throw null;
    }

    public void x(int i, int i2, int i3, int i4) {
        int i5 = this.c;
        if (i < 0) {
            int i6 = this.b;
            i += i6;
            i2 += 4 - ((i6 + 4) % 8);
        }
        if (i2 < 0) {
            i2 += i5;
            i += 4 - ((i5 + 4) % 8);
        }
        ((byte[]) this.e)[(i * i5) + i2] = (byte) ((((String) this.d).charAt(i3) & (1 << (8 - i4))) == 0 ? 0 : 1);
    }

    public int z(int i) {
        d(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (u(iFollowing + (-1)) && u(iFollowing) && !t(iFollowing)) ? z(iFollowing) : iFollowing;
    }

    public w4c0(byte[] bArr, int i) {
        this.a = (byte) 11;
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.e = bArr;
            this.c = 0;
            this.b = i;
        } else {
            Locale locale = Locale.US;
            hhg1.n(cy30.i(length, "Array range is invalid. Buffer.length=", i, ", offset=0, length="));
            throw null;
        }
    }

    public /* synthetic */ w4c0(byte b) {
        this.a = b;
    }

    public w4c0(CharSequence charSequence, int i, Locale locale) {
        this.a = (byte) 10;
        this.d = charSequence;
        if (charSequence.length() < 0) {
            rf80.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            rf80.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new bne(i, charSequence));
    }

    public w4c0(String str, int i, int i2) {
        this.a = (byte) 2;
        this.d = str;
        this.c = i;
        this.b = i2;
        byte[] bArr = new byte[i * i2];
        this.e = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public w4c0() {
        this.a = (byte) 8;
        this.d = new long[10];
        this.e = new Object[10];
    }

    public w4c0(int i, ArrayList arrayList, int i2, ye70 ye70Var) {
        this.a = (byte) 3;
        this.b = i;
        this.d = arrayList;
        this.c = i2;
        this.e = ye70Var;
    }

    public w4c0(OutputStream outputStream, byte[] bArr) {
        this.a = (byte) 1;
        this.e = outputStream;
        this.d = bArr;
        this.c = 0;
        this.b = bArr.length;
    }

    public w4c0(TextPaint textPaint) {
        this.a = (byte) 5;
        this.d = textPaint;
        this.b = 1;
        this.c = 1;
        this.e = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public w4c0(int i, int i2, o8n o8nVar, mr20 mr20Var) {
        this.a = (byte) 7;
        this.d = mr20Var;
        this.b = i;
        this.c = i2;
        this.e = o8nVar;
    }

    public w4c0(int i, int i2, float[] fArr, float[] fArr2) {
        this.a = (byte) 6;
        this.b = i;
        dm5.m(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.d = fArr;
        this.e = fArr2;
        this.c = i2;
    }
}

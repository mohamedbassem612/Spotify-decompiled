package p;

import com.google.common.io.BaseEncoding$DecodingException;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class naa {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean[] h;
    public final boolean i;

    public naa(String str, char[] cArr, byte[] bArr, boolean z) {
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iJ = eth.J(length);
            this.d = iJ;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iJ);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.e = i;
            this.f = iJ >> iNumberOfTrailingZeros;
            this.c = cArr.length - 1;
            this.g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f; i2++) {
                int i3 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[eth.o(i2 * 8, i3)] = true;
            }
            this.h = zArr;
            this.i = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final int a(char c) throws BaseEncoding$DecodingException {
        if (c > 127) {
            throw new BaseEncoding$DecodingException("Unrecognized character: 0x" + Integer.toHexString(c));
        }
        byte b = this.g[c];
        if (b != -1) {
            return b;
        }
        if (c > ' ' && c != 127) {
            throw new BaseEncoding$DecodingException("Unrecognized character: " + c);
        }
        throw new BaseEncoding$DecodingException("Unrecognized character: 0x" + Integer.toHexString(c));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof naa)) {
            return false;
        }
        naa naaVar = (naa) obj;
        return this.i == naaVar.i && Arrays.equals(this.b, naaVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public naa(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    hhg1.n(m5n1.L("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                hhg1.n(m5n1.L("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
        this(str, cArr, bArr, false);
    }
}

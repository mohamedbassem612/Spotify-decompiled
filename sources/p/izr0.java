package p;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class izr0 {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final t380 f = t380.n(5, new Object[]{StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE});
    public static final AtomicReference g = new AtomicReference();
    public byte[] a;
    public int b;
    public int c;

    public izr0(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public static int c(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return bmq0.u((byte) 0, o0c.s(((i & 7) << 2) | ((i2 & 48) >> 4)), o0c.s(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), o0c.s(((b & 3) << 6) | (((byte) i4) & 63)));
    }

    public static int g(Charset charset) {
        dm5.o(f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean h(byte b) {
        return (b & 192) == 128;
    }

    public final String A(int i) {
        Boolean bool = (Boolean) g.get();
        if ((bool != null ? bool.booleanValue() : hzr0.a) && a() < i) {
            StringBuilder sbR = cy30.r(i, "bytesNeeded= ", ", bytesLeft=");
            sbR.append(a());
            throw new StringIndexOutOfBoundsException(sbR.toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.a;
        String str = zoi1.a;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.b += i;
        return str2;
    }

    public final short B() {
        j(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final String C(int i, Charset charset) {
        Boolean bool = (Boolean) g.get();
        if (!(bool != null ? bool.booleanValue() : hzr0.a) || a() >= i) {
            String str = new String(this.a, this.b, i, charset);
            this.b += i;
            return str;
        }
        StringBuilder sbR = cy30.r(i, "bytesNeeded= ", ", bytesLeft=");
        sbR.append(a());
        throw new StringIndexOutOfBoundsException(sbR.toString());
    }

    public final int D() {
        return E() | (E() << 21) | (E() << 14) | (E() << 7);
    }

    public final int E() {
        j(1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int F() {
        j(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.b = i + 4;
        return i4;
    }

    public final long G() {
        j(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.b = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    public final int H() {
        j(3);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public final int I() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        eg.m(f4i1.c(iQ, "Top bit not zero: "));
        return 0;
    }

    public final int J() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.b == this.c) {
                eg.m("Attempting to read a byte over the limit.");
                return 0;
            }
            long jE = E();
            j |= (127 & jE) << (i * 7);
            if ((jE & 128) == 0) {
                break;
            }
        }
        return bmq0.j(j);
    }

    public final long K() {
        long jY = y();
        if (jY >= 0) {
            return jY;
        }
        eg.m(l1d.l(jY, "Top bit not zero: "));
        return 0L;
    }

    public final int L() {
        j(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public final long M() {
        int i;
        j(1);
        long j = this.a[this.b];
        int i2 = 7;
        while (true) {
            if (i2 >= 0) {
                int i3 = 1 << i2;
                if ((((long) i3) & j) == 0) {
                    if (i2 < 6) {
                        j &= (long) (i3 - 1);
                        i = 7 - i2;
                        break;
                    }
                    if (i2 == 7) {
                        i = 1;
                        break;
                    }
                } else {
                    i2--;
                }
            }
            i = 0;
            break;
        }
        if (i == 0) {
            throw new NumberFormatException(l1d.l(j, "Invalid UTF-8 sequence first byte: "));
        }
        j(i);
        for (int i4 = 1; i4 < i; i4++) {
            byte b = this.a[this.b + i4];
            if ((b & 192) != 128) {
                throw new NumberFormatException(l1d.l(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.b += i;
        return j;
    }

    public final Charset N() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void O(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        P(bArr, i);
    }

    public final void P(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void Q(int i) {
        dm5.m(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public final void R(int i) {
        dm5.m(i >= 0 && i <= this.c);
        this.b = i;
    }

    public final void S(int i) {
        R(this.b + i);
    }

    public final int a() {
        return Math.max(this.c - this.b, 0);
    }

    public final int b() {
        return this.a.length;
    }

    public final void d(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final byte[] e() {
        return this.a;
    }

    public final int f() {
        return this.b;
    }

    public final int i() {
        return this.c;
    }

    public final void j(int i) {
        Boolean bool = (Boolean) g.get();
        if (!(bool != null ? bool.booleanValue() : hzr0.a) || a() >= i) {
            return;
        }
        k220.e(a(), cy30.r(i, "bytesNeeded= ", ", bytesLeft="));
    }

    public final char k(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        j(2);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.a;
        int i2 = this.b;
        if (byteOrder == byteOrder2) {
            int i3 = i2 + i;
            b = bArr[i3];
            b2 = bArr[i3 + 1];
        } else {
            int i4 = i2 + i;
            b = bArr[i4 + 1];
            b2 = bArr[i4];
        }
        return (char) ((b2 & 255) | (b << 8));
    }

    public final int l(Charset charset) {
        int codePoint;
        int i;
        dm5.o(f.contains(charset), "Unsupported charset: %s", charset);
        if (a() < g(charset)) {
            tw20.q(this.b, this.c, ", limit=", "position=");
            return 0;
        }
        int i2 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.a[this.b];
            if ((b & 128) == 0) {
                codePoint = b & 255;
                return (codePoint << 8) | i2;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.a[this.b];
            if ((b2 & 128) == 0) {
                i = 1;
            } else if ((b2 & 224) == 192 && a() >= 2 && h(this.a[this.b + 1])) {
                i = 2;
            } else if ((this.a[this.b] & 240) == 224 && a() >= 3 && h(this.a[this.b + 1]) && h(this.a[this.b + 2])) {
                i = 3;
            } else {
                i = ((this.a[this.b] & 248) == 240 && a() >= 4 && h(this.a[this.b + 1]) && h(this.a[this.b + 2]) && h(this.a[this.b + 3])) ? 4 : 0;
            }
            if (i == 1) {
                codePoint = this.a[this.b] & 255;
            } else if (i == 2) {
                byte[] bArr = this.a;
                int i3 = this.b;
                codePoint = c(0, 0, bArr[i3], bArr[i3 + 1]);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        byte[] bArr2 = this.a;
                        int i4 = this.b;
                        codePoint = c(bArr2[i4], bArr2[i4 + 1], bArr2[i4 + 2], bArr2[i4 + 3]);
                    }
                    return 0;
                }
                byte[] bArr3 = this.a;
                int i5 = this.b;
                codePoint = c(0, bArr3[i5] & 15, bArr3[i5 + 1], bArr3[i5 + 2]);
            }
            i2 = i;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cK = k(0, byteOrder);
            if (!Character.isHighSurrogate(cK) || a() < 4) {
                codePoint = cK;
                i2 = 2;
            } else {
                codePoint = Character.toCodePoint(cK, k(2, byteOrder));
                i2 = 4;
            }
        }
        return (codePoint << 8) | i2;
    }

    public final int m() {
        if (a() < 4) {
            tw20.q(this.b, this.c, ", limit=", "position=");
            return 0;
        }
        int iQ = q();
        this.b -= 4;
        return iQ;
    }

    public final int n() {
        j(1);
        return this.a[this.b] & 255;
    }

    public final void o(int i, byte[] bArr, int i2) {
        j(i2);
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final char p(Charset charset, char[] cArr) {
        int iL;
        if (a() >= g(charset) && (iL = l(charset)) != 0) {
            long j = iL >>> 8;
            dm5.j(j, "out of range: %s", (j >> 32) == 0);
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                dm5.j(j2, "Out of range: %s", ((long) c) == j2);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.b = bmq0.j(iL & 255) + this.b;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int q() {
        j(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae A[SYNTHETIC] */
    public final String r(Charset charset) {
        int i;
        byte[] bArr;
        dm5.o(f.contains(charset), "Unsupported charset: %s", charset);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            N();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                hhg1.g(charset, "Unsupported charset: ");
                return null;
            }
            i = 2;
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && zoi1.R(this.a[i2])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.a;
                if (bArr2[i2] == 0 && zoi1.R(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.a;
                    if (bArr[i2 + 1] == 0 && zoi1.R(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.a;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        String strC = C(i2 - this.b, charset);
        if (this.b != this.c && p(charset, d) == '\r') {
            p(charset, e);
        }
        return strC;
    }

    public final int s() {
        j(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public final long t() {
        j(8);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    public final short u() {
        j(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final long v() {
        j(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    public final int w() {
        int iS = s();
        if (iS >= 0) {
            return iS;
        }
        eg.m(f4i1.c(iS, "Top bit not zero: "));
        return 0;
    }

    public final int x() {
        j(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final long y() {
        j(8);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.b = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    public final String z() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = zoi1.a;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str2;
    }

    public izr0() {
        this.a = zoi1.b;
    }

    public izr0(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public izr0(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }
}

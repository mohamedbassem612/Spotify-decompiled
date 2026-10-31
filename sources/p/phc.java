package p;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class phc implements Iterable, Serializable {
    public static final hhc b = new hhc(l290.b);
    public static final dhc c;
    public int a;

    static {
        c = p34.a() ? new mhc((byte) 0) : new rtw0((byte) 11);
    }

    public static int d(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            eg.g(gvg.e(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            eg.g(cy30.i(i, "Beginning index larger than ending index: ", i2, ", "));
            return 0;
        }
        eg.g(cy30.i(i2, "End index: ", i3, " >= "));
        return 0;
    }

    public static hhc e(int i, byte[] bArr, int i2) {
        d(i, i + i2, bArr.length);
        return new hhc(c.a(i, bArr, i2));
    }

    public static hhc f(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        d(0, iRemaining, byteBuffer.remaining());
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        return new hhc(bArr);
    }

    public static hhc i(String str) {
        return new hhc(str.getBytes(l290.a));
    }

    public static int l(int i, String str) {
        int i2;
        char cCharAt = str.charAt(i);
        if (cCharAt >= '0' && cCharAt <= '9') {
            i2 = cCharAt - '0';
        } else if (cCharAt < 'A' || cCharAt > 'F') {
            i2 = (cCharAt < 'a' || cCharAt > 'f') ? -1 : cCharAt - 'W';
        } else {
            i2 = cCharAt - '7';
        }
        if (i2 != -1) {
            return i2;
        }
        throw new NumberFormatException("Invalid hexString " + str + " must only contain [0-9a-fA-F] but contained " + str.charAt(i) + " at index " + i);
    }

    public static hhc m(String str) {
        if (str.length() % 2 != 0) {
            throw new NumberFormatException("Invalid hexString " + str + " of length " + str.length() + " must be even.");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (l(i2 + 1, str) | (l(i2, str) << 4));
        }
        return new hhc(bArr);
    }

    public abstract ByteBuffer b();

    public abstract byte c(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iR = this.a;
        if (iR == 0) {
            int size = size();
            iR = r(size, size);
            if (iR == 0) {
                iR = 1;
            }
            this.a = iR;
        }
        return iR;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract void k(byte[] bArr, int i);

    public abstract byte n(int i);

    public abstract boolean o();

    public abstract lwg p();

    public abstract InputStream q();

    public abstract int r(int i, int i2);

    public abstract phc s(int i);

    public abstract int size();

    public final byte[] t() {
        int size = size();
        if (size == 0) {
            return l290.b;
        }
        byte[] bArr = new byte[size];
        k(bArr, size);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return l1d.n(size() <= 50 ? h4p1.j(this) : h4p1.j(s(47)).concat("..."), "\">", l1d.s(size(), "<ByteString@", hexString, " size=", " contents=\""));
    }

    public abstract String u(Charset charset);

    public final String v() {
        return size() == 0 ? "" : u(l290.a);
    }

    public abstract void w(rwg rwgVar);
}

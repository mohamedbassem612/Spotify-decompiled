package p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class rhc implements Serializable, Comparable {
    public static final rhc d = new rhc(new byte[0]);
    public final byte[] a;
    public transient int b;
    public transient String c;

    public rhc(byte[] bArr) {
        this.a = bArr;
    }

    public static int g(rhc rhcVar, rhc rhcVar2) {
        rhcVar.getClass();
        return rhcVar.f(rhcVar2.h(), 0);
    }

    public static /* synthetic */ rhc o(rhc rhcVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return rhcVar.n(i, i2);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i = objectInputStream.readInt();
        if (i < 0) {
            hhg1.f(f4i1.c(i, "byteCount < 0: "));
            return;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                eg.l();
                return;
            }
            i2 += i3;
        }
        rhc rhcVar = new rhc(bArr);
        Field declaredField = rhc.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, rhcVar.a);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.a.length);
        objectOutputStream.write(this.a);
    }

    public ByteBuffer a() {
        return ByteBuffer.wrap(this.a).asReadOnlyBuffer();
    }

    public String b() {
        byte[] bArr = this.a;
        byte[] bArr2 = a.a;
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr3[i2] = bArr2[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr2[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i5];
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr2[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return ryn1.B(bArr3);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(rhc rhcVar) {
        int iD = d();
        int iD2 = rhcVar.d();
        int iMin = Math.min(iD, iD2);
        for (int i = 0; i < iMin; i++) {
            int i2 = i(i) & 255;
            int i3 = rhcVar.i(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD < iD2 ? -1 : 1;
    }

    public int d() {
        return this.a.length;
    }

    public String e() {
        byte[] bArr = this.a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = xa4.b;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rhc) {
            rhc rhcVar = (rhc) obj;
            int iD = rhcVar.d();
            byte[] bArr = this.a;
            if (iD == bArr.length && rhcVar.l(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f(byte[] bArr, int i) {
        int length = this.a.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!zod.i(iMax, 0, bArr.length, this.a, bArr)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] h() {
        return this.a;
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.a);
        this.b = iHashCode;
        return iHashCode;
    }

    public byte i(int i) {
        return this.a[i];
    }

    public int j(byte[] bArr) {
        for (int iMin = Math.min(zod.I(-1234567890, this), this.a.length - bArr.length); -1 < iMin; iMin--) {
            if (zod.i(iMin, 0, bArr.length, this.a, bArr)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean k(int i, rhc rhcVar, int i2) {
        return rhcVar.l(0, this.a, i, i2);
    }

    public boolean l(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.a;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && zod.i(i, i2, i3, bArr2, bArr);
    }

    public String m(Charset charset) {
        return new String(this.a, charset);
    }

    public rhc n(int i, int i2) {
        int I = zod.I(i2, this);
        if (i < 0) {
            hhg1.n("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.a;
        if (I > bArr.length) {
            hhg1.f(l1d.o(new StringBuilder("endIndex > length("), this.a.length, ')'));
            return null;
        }
        if (I - i >= 0) {
            return (i == 0 && I == bArr.length) ? this : new rhc(f46.Z(i, bArr, I));
        }
        hhg1.n("endIndex < beginIndex");
        return null;
    }

    public rhc p() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new rhc(bArrCopyOf);
            }
            i++;
        }
    }

    public byte[] q() {
        byte[] bArr = this.a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final String r() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        String strB = ryn1.B(h());
        this.c = strB;
        return strB;
    }

    public void s(nac nacVar, int i) {
        xa4.n(this, nacVar, i);
    }

    public String toString() {
        byte[] bArr = this.a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int i = xa4.i(bArr);
        if (i != -1) {
            String strR = r();
            String strW = nhc1.W(nhc1.W(nhc1.W(strR.substring(0, i), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i >= strR.length()) {
                return cy30.n("[text=", strW, ']');
            }
            return "[size=" + this.a.length + " text=" + strW + "…]";
        }
        if (this.a.length <= 64) {
            return "[hex=" + e() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(this.a.length);
        sb.append(" hex=");
        int I = zod.I(64, this);
        byte[] bArr2 = this.a;
        if (I > bArr2.length) {
            hhg1.f(l1d.o(new StringBuilder("endIndex > length("), this.a.length, ')'));
            return null;
        }
        if (I < 0) {
            hhg1.n("endIndex < beginIndex");
            return null;
        }
        if (I != bArr2.length) {
            this = new rhc(f46.Z(0, bArr2, I));
        }
        sb.append(this.e());
        sb.append("…]");
        return sb.toString();
    }
}

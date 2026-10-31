package p;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class fhc implements Iterable, Serializable {
    public static final fhc c = new fhc(j290.b);
    public static final bhc d;
    public int a = 0;
    public final byte[] b;

    static {
        d = n34.a() ? new khc((byte) 0) : new xgc((byte) 0);
    }

    public fhc(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int c(int i, int i2, int i3) {
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

    public static fhc d(int i, byte[] bArr, int i2) {
        c(i, i + i2, bArr.length);
        return new fhc(d.a(i, bArr, i2));
    }

    public byte b(int i) {
        return this.b[i];
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof fhc) && size() == ((fhc) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof fhc)) {
                return obj.equals(this);
            }
            fhc fhcVar = (fhc) obj;
            int i = this.a;
            int i2 = fhcVar.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > fhcVar.size()) {
                    eg.e(size, size());
                    return false;
                }
                if (size > fhcVar.size()) {
                    StringBuilder sbR = cy30.r(size, "Ran off end of other: 0, ", ", ");
                    sbR.append(fhcVar.size());
                    throw new IllegalArgumentException(sbR.toString());
                }
                byte[] bArr = fhcVar.b;
                int iE = e() + size;
                int iE2 = e();
                int iE3 = fhcVar.e();
                while (iE2 < iE) {
                    if (this.b[iE2] == bArr[iE3]) {
                        iE2++;
                        iE3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public byte f(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iE = e();
        int i2 = size;
        for (int i3 = iE; i3 < iE + size; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new wgc(this);
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = e4p1.j(this);
        } else {
            int iC = c(0, 47, size());
            strConcat = e4p1.j(iC == 0 ? c : new ahc(this.b, e(), iC)).concat("...");
        }
        return l1d.n(strConcat, "\">", l1d.s(size, "<ByteString@", hexString, " size=", " contents=\""));
    }
}

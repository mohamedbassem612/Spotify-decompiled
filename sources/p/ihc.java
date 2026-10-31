package p;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ihc implements Iterable, Serializable {
    public static final ihc c = new ihc(n290.b);
    public static final ehc d;
    public int a = 0;
    public final byte[] b;

    static {
        d = q34.a() ? new nhc((byte) 0) : new ytw0((byte) 11);
    }

    public ihc(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static ihc b(int i, byte[] bArr, int i2) {
        int i3 = i + i2;
        int length = bArr.length;
        if (((i3 - i) | i | i3 | (length - i3)) < 0) {
            if (i < 0) {
                eg.g(gvg.e(i, "Beginning index: ", " < 0"));
            } else if (i3 < i) {
                eg.g(cy30.i(i, "Beginning index larger than ending index: ", i3, ", "));
            } else {
                eg.g(cy30.i(i3, "End index: ", length, " >= "));
            }
        }
        return new ihc(d.a(i, bArr, i2));
    }

    public int c() {
        return 0;
    }

    public final int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ihc) && size() == ((ihc) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof ihc)) {
                return obj.equals(this);
            }
            ihc ihcVar = (ihc) obj;
            int iD = d();
            int iD2 = ihcVar.d();
            if (iD == 0 || iD2 == 0 || iD == iD2) {
                int size = size();
                if (size > ihcVar.size()) {
                    eg.e(size, size());
                    return false;
                }
                if (size > ihcVar.size()) {
                    StringBuilder sbR = cy30.r(size, "Ran off end of other: 0, ", ", ");
                    sbR.append(ihcVar.size());
                    throw new IllegalArgumentException(sbR.toString());
                }
                byte[] bArr = ihcVar.b;
                int iC = c() + size;
                int iC2 = c();
                int iC3 = ihcVar.c();
                while (iC2 < iC) {
                    if (this.b[iC2] == bArr[iC3]) {
                        iC2++;
                        iC3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iC = c();
        int i2 = size;
        for (int i3 = iC; i3 < iC + size; i3++) {
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
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}

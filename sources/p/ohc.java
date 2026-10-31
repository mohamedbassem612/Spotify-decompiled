package p;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ohc implements Iterable, Serializable {
    public static final ghc b = new ghc(k290.b);
    public static final chc c;
    public int a;

    static {
        c = o34.a() ? new lhc((byte) 0) : new gtv0((byte) 11);
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

    public static ghc d(int i, byte[] bArr, int i2) {
        c(i, i + i2, bArr.length);
        return new ghc(c.a(i, bArr, i2));
    }

    public abstract byte b(int i);

    public abstract void e(byte[] bArr, int i);

    public abstract byte f(int i);

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int size = size();
        ghc ghcVar = (ghc) this;
        int iK = ghcVar.k();
        int i2 = size;
        for (int i3 = iK; i3 < iK + size; i3++) {
            i2 = (i2 * 31) + ghcVar.d[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    public final byte[] i() {
        int size = size();
        if (size == 0) {
            return k290.b;
        }
        byte[] bArr = new byte[size];
        e(bArr, size);
        return bArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new wgc(this);
    }

    public abstract int size();

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = f4p1.m(this);
        } else {
            ghc ghcVar = (ghc) this;
            int iC = c(0, 47, ghcVar.size());
            strConcat = f4p1.m(iC == 0 ? b : new ygc(ghcVar.d, ghcVar.k(), iC)).concat("...");
        }
        return l1d.n(strConcat, "\">", l1d.s(size, "<ByteString@", hexString, " size=", " contents=\""));
    }
}

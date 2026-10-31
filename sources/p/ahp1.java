package p;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class ahp1 implements Iterable, Serializable {
    public static final ahp1 c = new ahp1(mip1.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i = wgp1.a;
    }

    public ahp1(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static void e(int i) {
        if (((i - 47) | 47) >= 0) {
            return;
        }
        eg.g(gvg.l(new StringBuilder(String.valueOf(47).length() + 15 + String.valueOf(i).length()), "End index: 47 >= ", i));
    }

    public byte b(int i) {
        return this.b[i];
    }

    public byte c(int i) {
        return this.b[i];
    }

    public int d() {
        return this.b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ahp1) && d() == ((ahp1) obj).d()) {
            if (d() == 0) {
                return true;
            }
            if (!(obj instanceof ahp1)) {
                return obj.equals(this);
            }
            ahp1 ahp1Var = (ahp1) obj;
            int i = this.a;
            int i2 = ahp1Var.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int iD = d();
                if (iD > ahp1Var.d()) {
                    int iD2 = d();
                    x4n1.d(String.valueOf(iD).length() + 18 + String.valueOf(iD2).length(), iD, iD2);
                    return false;
                }
                if (iD > ahp1Var.d()) {
                    int iD3 = ahp1Var.d();
                    x4n1.h(String.valueOf(iD).length() + 27 + String.valueOf(iD3).length(), "Ran off end of other: 0, ", iD, ", ", iD3);
                    return false;
                }
                byte[] bArr = ahp1Var.b;
                int i3 = 0;
                int i4 = 0;
                while (i3 < iD) {
                    if (this.b[i3] == bArr[i4]) {
                        i3++;
                        i4++;
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
        int iD = d();
        Charset charset = mip1.a;
        int i2 = iD;
        for (int i3 = 0; i3 < iD; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new wgc(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iD = d();
        if (d() <= 50) {
            strConcat = q0o1.q(this);
        } else {
            e(d());
            byte[] bArr = this.b;
            zgp1 zgp1Var = new zgp1(bArr);
            e(bArr.length);
            strConcat = q0o1.q(zgp1Var).concat("...");
        }
        return l1d.n(strConcat, "\">", l1d.s(iD, "<ByteString@", hexString, " size=", " contents=\""));
    }
}

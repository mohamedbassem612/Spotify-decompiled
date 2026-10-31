package p;

import com.google.android.gms.internal.play_billing.zzgc;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class n5o1 implements Iterable, Serializable {
    public static final r5o1 b = new r5o1(wbo1.b);
    public int a = 0;

    static {
        int i = z3o1.a;
    }

    public static int l(int i, int i2, int i3) {
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

    public static r5o1 m(int i, byte[] bArr, int i2) {
        try {
            l(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new r5o1(bArr2);
        } catch (zzgc e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* bridge */ /* synthetic */ boolean n(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        l(i, i4, bArr.length);
        l(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte b(int i);

    public abstract byte c(int i);

    public abstract int d(int i, int i2);

    public abstract int e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5o1)) {
            return false;
        }
        n5o1 n5o1Var = (n5o1) obj;
        int iE = e();
        if (iE != n5o1Var.e()) {
            return false;
        }
        if (iE == 0) {
            return true;
        }
        int i = this.a;
        int i2 = n5o1Var.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return k(n5o1Var);
        }
        return false;
    }

    public abstract n5o1 f(int i, int i2);

    public final int hashCode() {
        int iD = this.a;
        if (iD == 0) {
            int iE = e();
            iD = d(iE, iE);
            if (iD == 0) {
                iD = 1;
            }
            this.a = iD;
        }
        return iD;
    }

    public abstract void i(x6o1 x6o1Var);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new wgc(this);
    }

    public abstract boolean k(n5o1 n5o1Var);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return l1d.n(e() <= 50 ? rjo1.x(this) : rjo1.x(f(0, 47)).concat("..."), "\">", l1d.s(e(), "<ByteString@", hexString, " size=", " contents=\""));
    }
}

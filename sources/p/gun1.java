package p;

import com.google.android.gms.internal.wearable.zzdv;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class gun1 implements Iterable, Serializable {
    public static final cun1 b = new cun1(h0o1.a);
    public int a;

    static {
        int i = asn1.a;
    }

    public static cun1 l(int i, byte[] bArr, int i2) {
        try {
            if (i2 == 0) {
                return b;
            }
            n(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new cun1(bArr2);
        } catch (zzdv e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static int n(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            eg.g(fd21.h(new StringBuilder(String.valueOf(i).length() + 21), "Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            x4n1.f(String.valueOf(i).length() + 44 + String.valueOf(i2).length(), "Beginning index larger than ending index: ", i, ", ", i2);
            return 0;
        }
        x4n1.f(String.valueOf(i2).length() + 15 + String.valueOf(i3).length(), "End index: ", i2, " >= ", i3);
        return 0;
    }

    public static /* synthetic */ boolean o(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        n(i, i4, bArr.length);
        n(i2, i3 + i2, bArr2.length);
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

    public abstract int c();

    public abstract xtn1 d(int i, int i2);

    public abstract void e(byte[] bArr, int i);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gun1)) {
            return false;
        }
        gun1 gun1Var = (gun1) obj;
        int iC = c();
        if (iC != gun1Var.c()) {
            return false;
        }
        if (iC == 0) {
            return true;
        }
        int i = this.a;
        int i2 = gun1Var.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return i(gun1Var);
        }
        return false;
    }

    public abstract void f(vun1 vun1Var);

    public final int hashCode() {
        int iK = this.a;
        if (iK == 0) {
            int iC = c();
            iK = k(iC, iC);
            if (iK == 0) {
                iK = 1;
            }
            this.a = iK;
        }
        return iK;
    }

    public abstract boolean i(gun1 gun1Var);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new ktn1(this);
    }

    public abstract int k(int i, int i2);

    public final byte[] m() {
        int iC = c();
        if (iC == 0) {
            return h0o1.a;
        }
        byte[] bArr = new byte[iC];
        e(bArr, iC);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return l1d.n(c() <= 50 ? tho1.A(m()) : tho1.A(d(0, 47).m()).concat("..."), "\">", l1d.s(c(), "<ByteString@", hexString, " size=", " contents=\""));
    }
}

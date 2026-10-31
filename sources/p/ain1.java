package p;

import com.google.android.recaptcha.internal.zzals;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ain1 implements Iterable, Serializable {
    public static final vhn1 b = new vhn1(xin1.a);
    public int a = 0;

    static {
        int i = phn1.a;
    }

    public static jhc b() {
        return new jhc((byte) 1);
    }

    public static int c(int i, int i2, int i3) {
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

    public static /* synthetic */ boolean d(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        c(i, i4, bArr.length);
        c(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static ain1 q(Iterator it, int i) {
        if (i <= 0) {
            Locale locale = Locale.ROOT;
            hhg1.n(gvg.e(i, "length (", ") must be >= 1"));
            return null;
        }
        if (i == 1) {
            return (ain1) it.next();
        }
        int i2 = i >>> 1;
        ain1 ain1VarQ = q(it, i2);
        ain1 ain1VarQ2 = q(it, i - i2);
        if (Integer.MAX_VALUE - ain1VarQ.f() < ain1VarQ2.f()) {
            int iF = ain1VarQ.f();
            int iF2 = ain1VarQ2.f();
            x4n1.h(String.valueOf(iF).length() + 31 + String.valueOf(iF2).length(), "ByteString would be too long: ", iF, "+", iF2);
            return null;
        }
        if (ain1VarQ2.f() == 0) {
            return ain1VarQ;
        }
        if (ain1VarQ.f() == 0) {
            return ain1VarQ2;
        }
        int iF3 = ain1VarQ2.f() + ain1VarQ.f();
        vhn1 vhn1Var = b;
        if (iF3 < 128) {
            int iF4 = ain1VarQ.f();
            int iF5 = ain1VarQ2.f();
            int i3 = iF4 + iF5;
            byte[] bArr = new byte[i3];
            c(0, iF4, ain1VarQ.f());
            c(0, iF4, i3);
            if (iF4 > 0) {
                ain1VarQ.l(bArr, 0, 0, iF4);
            }
            c(0, iF5, ain1VarQ2.f());
            c(iF4, i3, i3);
            if (iF5 > 0) {
                ain1VarQ2.l(bArr, 0, iF4, iF5);
            }
            if (i3 == 0) {
                return vhn1Var;
            }
            try {
                return new vhn1(bArr);
            } catch (zzals e) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            }
        }
        if (ain1VarQ instanceof pjn1) {
            pjn1 pjn1Var = (pjn1) ain1VarQ;
            ain1 ain1Var = pjn1Var.d;
            ain1 ain1Var2 = pjn1Var.e;
            if (ain1VarQ2.f() + ain1Var2.f() < 128) {
                int iF6 = ain1Var2.f();
                int iF7 = ain1VarQ2.f();
                int i4 = iF6 + iF7;
                byte[] bArr2 = new byte[i4];
                c(0, iF6, ain1Var2.f());
                c(0, iF6, i4);
                if (iF6 > 0) {
                    ain1Var2.l(bArr2, 0, 0, iF6);
                }
                c(0, iF7, ain1VarQ2.f());
                c(iF6, i4, i4);
                if (iF7 > 0) {
                    ain1VarQ2.l(bArr2, 0, iF6, iF7);
                }
                if (i4 != 0) {
                    try {
                        vhn1Var = new vhn1(bArr2);
                    } catch (zzals e2) {
                        throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
                    }
                }
                return new pjn1(ain1Var, vhn1Var);
            }
            if (ain1Var.t() > ain1Var2.t() && pjn1Var.g > ain1VarQ2.t()) {
                return new pjn1(ain1Var, new pjn1(ain1Var2, ain1VarQ2));
            }
        }
        if (iF3 >= pjn1.B(Math.max(ain1VarQ.t(), ain1VarQ2.t()) + 1)) {
            return new pjn1(ain1VarQ, ain1VarQ2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        f3o1.w(ain1VarQ, arrayDeque);
        f3o1.w(ain1VarQ2, arrayDeque);
        ain1 pjn1Var2 = (ain1) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            pjn1Var2 = new pjn1((ain1) arrayDeque.pop(), pjn1Var2);
        }
        return pjn1Var2;
    }

    public static vhn1 x(int i, byte[] bArr, int i2) {
        try {
            return y(i, bArr, i2);
        } catch (zzals e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static vhn1 y(int i, byte[] bArr, int i2) {
        if (i2 == 0) {
            return b;
        }
        c(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new vhn1(bArr2);
    }

    public final String A() {
        Charset charset = StandardCharsets.UTF_8;
        return w() ? "" : o();
    }

    public abstract byte e(int i);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ain1)) {
            return false;
        }
        ain1 ain1Var = (ain1) obj;
        int iF = f();
        if (iF != ain1Var.f()) {
            return false;
        }
        if (iF == 0) {
            return true;
        }
        int i = this.a;
        int i2 = ain1Var.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return p(ain1Var);
        }
        return false;
    }

    public abstract int f();

    public final int hashCode() {
        int iR = this.a;
        if (iR == 0) {
            int iF = f();
            iR = r(iF, 0, iF);
            if (iR == 0) {
                iR = 1;
            }
            this.a = iR;
        }
        return iR;
    }

    public abstract ain1 i(int i, int i2);

    public abstract ain1 k(int i, int i2);

    public abstract void l(byte[] bArr, int i, int i2, int i3);

    public abstract ByteBuffer m();

    public abstract void n(w4c0 w4c0Var);

    public String o() {
        return new String(z(), StandardCharsets.UTF_8);
    }

    public abstract boolean p(ain1 ain1Var);

    public abstract int r(int i, int i2, int i3);

    public abstract din1 s();

    public int t() {
        return 0;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iF = f();
        if (f() <= 50) {
            String[] strArr = yjn1.a;
            strConcat = yjn1.a(z());
        } else {
            ain1 ain1VarK = k(0, 47);
            String[] strArr2 = yjn1.a;
            strConcat = yjn1.a(ain1VarK.z()).concat("...");
        }
        return l1d.n(strConcat, "\">", l1d.s(iF, "<ByteString@", hexString, " size=", " contents=\""));
    }

    public boolean u() {
        return true;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public k5n1 iterator() {
        return new shn1(this);
    }

    public final boolean w() {
        return f() == 0;
    }

    public final byte[] z() {
        int iF = f();
        if (iF == 0) {
            return xin1.a;
        }
        byte[] bArr = new byte[iF];
        l(bArr, 0, 0, iF);
        return bArr;
    }
}

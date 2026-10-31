package p;

import com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class rwg {
    public static final Logger b = Logger.getLogger(rwg.class.getName());
    public static final boolean c = dlh1.e;
    public i6b a;

    public static int a(int i, phc phcVar) {
        int iE = e(i);
        int size = phcVar.size();
        return f(size) + size + iE;
    }

    public static int b(int i) {
        return f((i >> 31) ^ (i << 1));
    }

    public static int c(long j) {
        return g((j >> 63) ^ (j << 1));
    }

    public static int d(String str) {
        int length;
        try {
            length = toi1.a(str);
        } catch (moi1 unused) {
            length = str.getBytes(l290.a).length;
        }
        return f(length) + length;
    }

    public static int e(int i) {
        return f(poz0.E(i, 0));
    }

    public static int f(int i) {
        return gvg.b(i, 9, 352) >>> 6;
    }

    public static int g(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public abstract void A(int i, int i2);

    public abstract void B(int i);

    public abstract void C(int i, long j);

    public abstract void D(long j);

    public final void h(String str, moi1 moi1Var) throws CodedOutputStream$OutOfSpaceException {
        b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) moi1Var);
        byte[] bytes = str.getBytes(l290.a);
        try {
            B(bytes.length);
            t(0, bytes, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        }
    }

    public abstract void i(byte b2);

    public abstract void j(int i, boolean z);

    public abstract void k(byte[] bArr, int i);

    public abstract void l(int i, phc phcVar);

    public abstract void m(phc phcVar);

    public abstract void n(int i, int i2);

    public abstract void o(int i);

    public abstract void p(int i, long j);

    public abstract void q(long j);

    public abstract void r(int i, int i2);

    public abstract void s(int i);

    public abstract void t(int i, byte[] bArr, int i2);

    public abstract void u(s2j0 s2j0Var);

    public abstract void v(int i, s2j0 s2j0Var);

    public abstract void w(int i, phc phcVar);

    public abstract void x(int i, String str);

    public abstract void y(String str);

    public abstract void z(int i, int i2);
}

package p;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class uz21 implements Closeable {
    public static final tz21 a;

    static {
        nac nacVar = new nac();
        rhc rhcVar = rhc.d;
        nacVar.N(rhcVar);
        a = new tz21(null, rhcVar.a.length, nacVar);
    }

    public final InputStream a() {
        return d1().h1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final byte[] c() throws IOException {
        long jD = d();
        byte[] th = null;
        if (jD > 2147483647L) {
            k220.i(l1d.l(jD, "Cannot buffer entire body for content length: "));
            return null;
        }
        gbc gbcVarD1 = d1();
        try {
            byte[] bArrY0 = gbcVarD1.y0();
            try {
                gbcVarD1.close();
            } catch (Throwable th2) {
                th = th2;
            }
            byte[] bArr = th;
            th = bArrY0;
            th = bArr;
        } catch (Throwable th3) {
            th = th3;
            if (gbcVarD1 != null) {
                try {
                    gbcVarD1.close();
                } catch (Throwable th4) {
                    j2h1.h(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (jD == -1 || jD == length) {
            return th;
        }
        throw new IOException("Content-Length (" + jD + ") and stream length (" + length + ") disagree");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        w4n1.b(d1());
    }

    public abstract long d();

    public gbc d1() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    public abstract r8i0 e();

    /* JADX WARN: Code duplicated, block: B:7:0x0013 A[Catch: all -> 0x0026, TryCatch #1 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0015, B:7:0x0013), top: B:24:0x0005 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final String f() {
        Charset charsetA;
        gbc gbcVarD1 = d1();
        String th = null;
        try {
            r8i0 r8i0VarE = e();
            if (r8i0VarE != null) {
                se11 se11Var = r8i0.e;
                charsetA = r8i0VarE.a(null);
                if (charsetA == null) {
                    charsetA = nne.a;
                }
            } else {
                charsetA = nne.a;
            }
            String strI0 = gbcVarD1.I0(z4n1.f(gbcVarD1, charsetA));
            try {
                gbcVarD1.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = strI0;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (gbcVarD1 != null) {
                try {
                    gbcVarD1.close();
                } catch (Throwable th4) {
                    j2h1.h(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}

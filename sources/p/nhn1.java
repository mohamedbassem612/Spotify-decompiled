package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class nhn1 {
    protected transient int zzb;

    public abstract void a(w4c0 w4c0Var);

    public final String b(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 72);
        bb00.j(sb, "Serializing ", name, " to a ", str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public final vhn1 c() {
        try {
            int iE = ((rin1) this).e(null);
            vhn1 vhn1Var = ain1.b;
            byte[] bArr = new byte[iE];
            w4c0 w4c0Var = new w4c0(bArr, iE);
            a(w4c0Var);
            int i = iE - w4c0Var.c;
            if (i > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (i >= 0) {
                return new vhn1(bArr);
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            bhn0.o(b("ByteString"), e);
            return null;
        }
    }

    public final byte[] d() {
        try {
            int iE = ((rin1) this).e(null);
            if (iE == 0) {
                return xin1.a;
            }
            byte[] bArr = new byte[iE];
            w4c0 w4c0Var = new w4c0(bArr, iE);
            a(w4c0Var);
            int i = iE - w4c0Var.c;
            if (i > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (i >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            bhn0.o(b("byte array"), e);
            return null;
        }
    }

    public abstract int e(qjn1 qjn1Var);
}

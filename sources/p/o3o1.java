package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class o3o1 {
    protected transient int zza;

    public abstract void a(x6o1 x6o1Var);

    public final byte[] b() {
        try {
            int iD = d();
            byte[] bArr = new byte[iD];
            x6o1 x6o1Var = new x6o1(bArr, iD);
            a(x6o1Var);
            if (iD - x6o1Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            bhn0.o(f4i1.f("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public abstract int c(sgo1 sgo1Var);

    public abstract int d();
}

package p;

import com.google.crypto.tink.shaded.protobuf.c;
import com.google.crypto.tink.shaded.protobuf.d;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class u8 {
    protected int memoizedHashCode;

    public abstract int a();

    public final String b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public final byte[] c() {
        try {
            int iA = a();
            byte[] bArr = new byte[iA];
            c cVar = new c(bArr, iA);
            d(cVar);
            if (iA - cVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            bhn0.o(b("byte array"), e);
            return null;
        }
    }

    public void d(c cVar) {
        miy0 miy0Var = miy0.c;
        miy0Var.getClass();
        miy0Var.a(getClass()).d(this, d.a(cVar));
    }
}

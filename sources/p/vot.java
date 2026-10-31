package p;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vot implements tot {
    public aru0 a;

    @Override // p.tot
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        aru0 aru0Var = this.a;
        return ila0.n(new byte[][]{aru0Var.i().a(), ((tot) aru0Var.i().a).a(bArr, bArr2)});
    }

    @Override // p.tot
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        aru0 aru0Var = this.a;
        if (bArr.length > 5) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = aru0Var.j(bArrCopyOfRange).iterator();
            while (it.hasNext()) {
                try {
                    return ((tot) ((rnw0) it.next()).a).b(bArrCopyOfRange2, bArr2);
                } catch (GeneralSecurityException e) {
                    wot.a.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                }
            }
        }
        Iterator it2 = aru0Var.k().iterator();
        while (it2.hasNext()) {
            try {
                return ((tot) ((rnw0) it2.next()).a).b(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        k220.r("decryption failed");
        return null;
    }
}

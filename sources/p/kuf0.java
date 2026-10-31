package p;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kuf0 implements iuf0 {
    public final aru0 a;
    public final byte[] b = {0};

    public kuf0(aru0 aru0Var) {
        this.a = aru0Var;
    }

    /* JADX INFO: Removed unreachable split cross block B:30:0x0078 */
    public final void a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 5) {
            k220.r("tag too short");
            return;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        aru0 aru0Var = this.a;
        for (rnw0 rnw0Var : aru0Var.j(bArrCopyOf)) {
            try {
                boolean zEquals = rnw0Var.d.equals(fuq0.d);
                Object obj = rnw0Var.a;
                if (zEquals) {
                    ((iuf0) obj).a(bArrCopyOfRange, ila0.n(new byte[][]{bArr2, this.b}));
                    return;
                } else {
                    ((iuf0) obj).a(bArrCopyOfRange, bArr2);
                    return;
                }
            } catch (GeneralSecurityException e) {
                luf0.a.info("tag prefix matches a key, but cannot verify: " + e);
            }
        }
        Iterator it = aru0Var.j(e130.a).iterator();
        while (it.hasNext()) {
            try {
                ((iuf0) ((rnw0) it.next()).a).a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        k220.r("invalid MAC");
    }

    public final byte[] b(byte[] bArr) {
        aru0 aru0Var = this.a;
        boolean zEquals = ((rnw0) aru0Var.c).d.equals(fuq0.d);
        rnw0 rnw0Var = (rnw0) aru0Var.c;
        return zEquals ? ila0.n(new byte[][]{rnw0Var.a(), ((iuf0) ((rnw0) aru0Var.c).a).b(ila0.n(new byte[][]{bArr, this.b}))}) : ila0.n(new byte[][]{rnw0Var.a(), ((iuf0) ((rnw0) aru0Var.c).a).b(bArr)});
    }
}

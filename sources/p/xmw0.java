package p;

import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xmw0 implements iuf0 {
    public final vmw0 a;
    public final int b;

    public xmw0(vmw0 vmw0Var, int i) throws InvalidAlgorithmParameterException {
        this.a = vmw0Var;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        vmw0Var.a(new byte[0], i);
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        if (ila0.q(b(bArr2), bArr)) {
            return;
        }
        k220.r("invalid MAC");
    }

    public final byte[] b(byte[] bArr) {
        return this.a.a(bArr, this.b);
    }
}

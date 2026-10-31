package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class obe implements s82 {
    public final nbe a;
    public final nbe b;
    public final /* synthetic */ byte c;

    public obe(byte b, byte[] bArr) {
        this.c = b;
        this.a = d(bArr, 1);
        this.b = d(bArr, 0);
    }

    public static byte[] c(ByteBuffer byteBuffer, byte[] bArr) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        nbe nbeVar = this.a;
        if (length > 2147483631 - nbeVar.g()) {
            k220.r("plaintext too long");
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(nbeVar.g() + bArr.length + 16);
        if (byteBufferAllocate.remaining() < nbeVar.g() + bArr.length + 16) {
            hhg1.n("Given ByteBuffer output is too small");
            return null;
        }
        int iPosition = byteBufferAllocate.position();
        nbeVar.f(byteBufferAllocate, bArr);
        byteBufferAllocate.position(iPosition);
        byte[] bArr3 = new byte[nbeVar.g()];
        byteBufferAllocate.get(bArr3);
        byteBufferAllocate.limit(byteBufferAllocate.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        ByteBuffer byteBufferC = this.b.c(bArr3, 0);
        byte[] bArr4 = new byte[32];
        byteBufferC.get(bArr4);
        byte[] bArrO = g9p1.o(bArr4, c(byteBufferAllocate, bArr2));
        byteBufferAllocate.limit(byteBufferAllocate.limit() + 16);
        byteBufferAllocate.put(bArrO);
        return byteBufferAllocate.array();
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws AEADBadTagException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int iRemaining = byteBufferWrap.remaining();
        nbe nbeVar = this.a;
        if (iRemaining < nbeVar.g() + 16) {
            k220.r("ciphertext too short");
            return null;
        }
        int iPosition = byteBufferWrap.position();
        byte[] bArr3 = new byte[16];
        byteBufferWrap.position(byteBufferWrap.limit() - 16);
        byteBufferWrap.get(bArr3);
        byteBufferWrap.position(iPosition);
        byteBufferWrap.limit(byteBufferWrap.limit() - 16);
        byte[] bArr4 = new byte[nbeVar.g()];
        byteBufferWrap.get(bArr4);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            ByteBuffer byteBufferC = this.b.c(bArr4, 0);
            byte[] bArr5 = new byte[32];
            byteBufferC.get(bArr5);
            if (!ila0.q(g9p1.o(bArr5, c(byteBufferWrap, bArr2)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBufferWrap.position(iPosition);
            return nbeVar.e(byteBufferWrap);
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public final nbe d(byte[] bArr, int i) {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new mbe(bArr, i);
            default:
                return new yjm1(bArr, i);
        }
    }
}

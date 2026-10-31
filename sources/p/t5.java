package p;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class t5 extends bmq0 {
    public final ByteBuffer b = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override // p.bmq0
    public final bmq0 T(byte[] bArr) {
        bArr.getClass();
        n0(bArr, bArr.length);
        return this;
    }

    @Override // p.bmq0
    public final bmq0 U(byte[] bArr, int i) {
        dm5.v(0, i, bArr.length);
        n0(bArr, i);
        return this;
    }

    @Override // p.bmq0
    public final bmq0 V(char c) {
        ByteBuffer byteBuffer = this.b;
        byteBuffer.putChar(c);
        try {
            n0(byteBuffer.array(), 2);
            return this;
        } finally {
            j541.k(byteBuffer);
        }
    }

    public abstract void n0(byte[] bArr, int i);
}

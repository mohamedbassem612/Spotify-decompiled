package p;

import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class gar extends oac {
    public ie30 b;
    public final oco c = new oco();
    public ByteBuffer d;
    public boolean e;
    public long f;
    public ByteBuffer g;
    public final byte h;

    static {
        hph0.a("media3.decoder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gar(int i) {
        this.h = i;
    }

    public void g() {
        ((oac) this).a = 0;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    public final ByteBuffer h(int i) {
        byte b = this.h;
        if (b == 1) {
            return ByteBuffer.allocate(i);
        }
        if (b == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.d;
        throw new DecoderInputBuffer$InsufficientCapacityException(l1d.j(byteBuffer == null ? 0 : byteBuffer.capacity(), i, "Buffer too small (", " < ", ")"));
    }

    public final void i(int i) {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = h(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferH = h(i2);
        byteBufferH.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferH.put(byteBuffer);
        }
        this.d = byteBufferH;
    }

    public final void j() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}

package p;

import app.p000rive.semantics.SemanticState;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wj80 implements ReadableByteChannel {
    public final InputStream a;
    public final AtomicBoolean b = new AtomicBoolean(true);

    public wj80(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.b.compareAndSet(true, false)) {
            this.a.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.b.get();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        boolean zHasArray = byteBuffer.hasArray();
        InputStream inputStream = this.a;
        if (!zHasArray) {
            byte[] bArr = new byte[Math.min(TlsSocketProvider.READ_BUFFER_SIZE, Math.min(Math.max(inputStream.available(), SemanticState.Obscured), byteBuffer.remaining()))];
            int i = inputStream.read(bArr);
            if (i > 0) {
                byteBuffer.put(bArr, 0, i);
            }
            return i;
        }
        int i2 = inputStream.read(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        if (i2 > 0) {
        }
        return i2;
    }
}

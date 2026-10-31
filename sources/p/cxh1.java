package p;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cxh1 extends UploadDataProvider {
    public volatile FileChannel a;
    public final bxh1 b;
    public final Object c = new Object();

    public cxh1(bxh1 bxh1Var) {
        this.b = bxh1Var;
    }

    public final FileChannel a() {
        if (this.a == null) {
            synchronized (this.c) {
                try {
                    if (this.a == null) {
                        this.a = this.b.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return a().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            eg.m("Cronet passed a buffer with no bytes remaining");
            return;
        }
        FileChannel fileChannelA = a();
        int i = 0;
        while (i == 0) {
            int i2 = fileChannelA.read(byteBuffer);
            if (i2 == -1) {
                break;
            } else {
                i += i2;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        a().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}

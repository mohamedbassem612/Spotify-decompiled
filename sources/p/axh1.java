package p;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class axh1 extends UploadDataProvider {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ axh1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.a) {
            case 1:
                ((UploadDataProvider) this.b).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        switch (this.a) {
            case 0:
                return ((ByteBuffer) this.b).limit();
            default:
                return ((UploadDataProvider) this.b).getLength();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ByteBuffer byteBuffer2 = (ByteBuffer) obj;
                if (!byteBuffer.hasRemaining()) {
                    eg.m("Cronet passed a buffer with no bytes remaining");
                } else {
                    if (byteBuffer.remaining() >= byteBuffer2.remaining()) {
                        byteBuffer.put(byteBuffer2);
                    } else {
                        int iLimit = byteBuffer2.limit();
                        byteBuffer.put(byteBuffer2);
                    }
                    uploadDataSink.onReadSucceeded(false);
                }
                break;
            default:
                ((UploadDataProvider) obj).read(uploadDataSink, byteBuffer);
                break;
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                uploadDataSink.onRewindSucceeded();
                break;
            default:
                ((UploadDataProvider) obj).rewind(uploadDataSink);
                break;
        }
    }
}

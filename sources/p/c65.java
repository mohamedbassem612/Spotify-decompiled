package p;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c65 extends UploadDataProvider {
    public final org.chromium.net.UploadDataProvider a;

    public c65(org.chromium.net.UploadDataProvider uploadDataProvider) {
        Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
        this.a = uploadDataProvider;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final long getLength() {
        return this.a.getLength();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        this.a.read(new d65(uploadDataSink), byteBuffer);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.a.rewind(new d65(uploadDataSink));
    }
}

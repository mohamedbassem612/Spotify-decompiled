package j$.nio.channels;

import java.io.IOException;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.Channel;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class a implements Channel {
    public final /* synthetic */ AsynchronousFileChannel a;

    public a(AsynchronousFileChannel asynchronousFileChannel) {
        this.a = asynchronousFileChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AsynchronousFileChannel asynchronousFileChannel = this.a;
        if (obj instanceof a) {
            obj = ((a) obj).a;
        }
        return asynchronousFileChannel.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }
}

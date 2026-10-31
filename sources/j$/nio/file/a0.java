package j$.nio.file;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class a0 implements DirectoryStream {
    public final DirectoryStream a;

    public a0(DirectoryStream directoryStream) {
        this.a = directoryStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        this.a.forEach(new z(consumer, (byte) 0));
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return new c0(this.a.iterator());
    }
}

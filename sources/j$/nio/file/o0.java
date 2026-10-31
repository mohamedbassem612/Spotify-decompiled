package j$.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.WatchService;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class o0 implements Closeable {
    public final /* synthetic */ WatchService a;

    public /* synthetic */ o0(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ o0 a(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return new o0(watchService);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof o0) {
            obj = ((o0) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}

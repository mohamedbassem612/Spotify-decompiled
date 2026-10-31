package j$.adapter;

import android.os.StrictMode;
import j$.desugar.sun.nio.fs.d;
import j$.nio.file.spi.c;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.spi.FileSystemProvider;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public abstract class b {
    public static final c a;

    static {
        c aVar;
        if (a.a) {
            FileSystemProvider fileSystemProviderProvider = FileSystems.getDefault().provider();
            int i = j$.nio.file.spi.a.c;
            if (fileSystemProviderProvider == null) {
                aVar = null;
            } else {
                aVar = fileSystemProviderProvider instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) fileSystemProviderProvider).a : new j$.nio.file.spi.a(fileSystemProviderProvider);
            }
        } else {
            if (a.b) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().build());
            }
            aVar = d.a;
        }
        a = aVar;
        aVar.j(URI.create("file:///"));
    }
}

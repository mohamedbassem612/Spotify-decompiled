package j$.nio.file;

import java.nio.file.DirectoryStream;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class l {
    public final Path a;
    public final Object b;
    public final DirectoryStream c;
    public final Iterator d;
    public boolean e;

    public l(Path path, Object obj, DirectoryStream directoryStream) {
        this.a = path;
        this.b = obj;
        this.c = directoryStream;
        this.d = directoryStream.iterator();
    }
}

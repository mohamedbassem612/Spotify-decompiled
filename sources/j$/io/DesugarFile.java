package j$.io;

import j$.nio.file.Path;
import j$.nio.file.j;
import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class DesugarFile {
    public static Path toPath(File file) {
        return j.a.b(file.getPath(), new String[0]);
    }
}

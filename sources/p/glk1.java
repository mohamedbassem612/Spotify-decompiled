package p;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class glk1 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return nhc1.Y(str, "spotify_channel_", false);
    }
}

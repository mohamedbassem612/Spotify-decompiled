package p;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class ehn implements FilenameFilter {
    public final /* synthetic */ byte a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            default:
                return str.startsWith("event");
        }
    }
}

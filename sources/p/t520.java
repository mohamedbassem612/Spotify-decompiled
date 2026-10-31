package p;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t520 implements FileFilter {
    public final /* synthetic */ File a;

    public t520(File file) {
        this.a = file;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.equals(this.a);
    }
}

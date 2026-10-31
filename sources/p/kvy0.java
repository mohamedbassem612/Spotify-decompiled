package p;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kvy0 implements FileFilter {
    public static final kvy0 b = new kvy0();
    public final /* synthetic */ byte a = 0;

    public /* synthetic */ kvy0() {
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.a) {
            case 0:
                return nhc1.Y(file.getName(), "push_media", false);
            default:
                return file.isFile() && nhc1.Y(file.getName(), "upload_", false);
        }
    }

    public kvy0(poj0 poj0Var) {
    }
}

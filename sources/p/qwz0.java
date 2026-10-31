package p;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qwz0 implements FilenameFilter {
    public final /* synthetic */ String a;

    public qwz0(String str) {
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.a);
    }
}

package p;

import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m520 extends j520 {
    public boolean b;
    public File[] c;
    public int d;

    @Override // p.o520
    public final File a() {
        boolean z = this.b;
        File file = this.a;
        if (!z) {
            this.b = true;
            return file;
        }
        File[] fileArrListFiles = this.c;
        if (fileArrListFiles != null && this.d >= fileArrListFiles.length) {
            return null;
        }
        if (fileArrListFiles == null) {
            fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        fileArrListFiles.getClass();
        int i = this.d;
        this.d = i + 1;
        return fileArrListFiles[i];
    }
}

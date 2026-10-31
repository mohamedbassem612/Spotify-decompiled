package p;

import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k520 extends j520 {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;

    @Override // p.o520
    public final File a() {
        boolean z = this.e;
        File file = this.a;
        if (!z && this.c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr == null || this.d >= fileArr.length) {
            if (this.b) {
                return null;
            }
            this.b = true;
            return file;
        }
        fileArr.getClass();
        int i = this.d;
        this.d = i + 1;
        return fileArr[i];
    }
}

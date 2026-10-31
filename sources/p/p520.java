package p;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p520 implements n561 {
    public final File a;
    public final int b = 2;

    public p520(File file) {
        this.a = file;
    }

    @Override // p.n561
    public final Iterator iterator() {
        return new n520(this);
    }
}

package p;

import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nfh0 {
    public final File a;
    public final long b;

    public nfh0(File file, long j) {
        this.a = file;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfh0)) {
            return false;
        }
        nfh0 nfh0Var = (nfh0) obj;
        return this.a.equals(nfh0Var.a) && this.b == nfh0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}

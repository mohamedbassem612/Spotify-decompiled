package p;

import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lpn1 {
    public final File a;
    public final String b;

    public lpn1(File file, String str) {
        this.a = file;
        this.b = str;
    }

    public final File a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lpn1)) {
            return false;
        }
        lpn1 lpn1Var = (lpn1) obj;
        return this.a.equals(lpn1Var.a) && this.b.equals(lpn1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return cy30.p("SplitFileInfo{splitFile=", this.a.toString(), ", splitId=", this.b, "}");
    }
}

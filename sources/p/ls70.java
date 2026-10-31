package p;

import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ls70 {
    public final InputStream a;
    public final g5n b;
    public final Float c;

    public ls70(InputStream inputStream, g5n g5nVar, Float f) {
        this.a = inputStream;
        this.b = g5nVar;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls70)) {
            return false;
        }
        ls70 ls70Var = (ls70) obj;
        return this.a.equals(ls70Var.a) && this.b == ls70Var.b && u890.j(this.c, ls70Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Float f = this.c;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }
}

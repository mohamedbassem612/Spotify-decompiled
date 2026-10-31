package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h19 {
    public final String a;
    public final String b;

    public h19(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            bhn0.i("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h19)) {
            return false;
        }
        h19 h19Var = (h19) obj;
        return this.a.equals(h19Var.a) && this.b.equals(h19Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return l1d.n(this.b, "}", sb);
    }
}

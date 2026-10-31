package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l4f extends m4f {
    public final boolean c;
    public final String d;
    public final gob e;

    public l4f(boolean z, String str, gob gobVar) {
        super(jpx.c, 2131953292);
        this.c = z;
        this.d = str;
        this.e = gobVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l4f) {
            l4f l4fVar = (l4f) obj;
            return this.c == l4fVar.c && u890.j(this.d, l4fVar.d) && this.e == l4fVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(Boolean.hashCode(this.c) * 31, 31, this.d);
    }
}

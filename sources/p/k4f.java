package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k4f extends m4f {
    public final boolean c;
    public final String d;
    public final ztb e;

    public k4f(boolean z, String str, ztb ztbVar) {
        super(kpx.c, 2131953291);
        this.c = z;
        this.d = str;
        this.e = ztbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k4f) {
            k4f k4fVar = (k4f) obj;
            return this.c == k4fVar.c && u890.j(this.d, k4fVar.d) && this.e == k4fVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(Boolean.hashCode(this.c) * 31, 31, this.d);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j4f extends m4f {
    public final zks0 c;
    public final String d;

    public j4f(zks0 zks0Var, String str) {
        super(gpx.c, null);
        this.c = zks0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4f)) {
            return false;
        }
        j4f j4fVar = (j4f) obj;
        return u890.j(this.c, j4fVar.c) && u890.j(this.d, j4fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}

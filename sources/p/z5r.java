package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z5r implements b6r {
    public final cmt a;
    public final String b;

    public z5r(cmt cmtVar, String str) {
        this.a = cmtVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5r)) {
            return false;
        }
        z5r z5rVar = (z5r) obj;
        return u890.j(this.a, z5rVar.a) && u890.j(this.b, z5rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

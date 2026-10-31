package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y4g implements a5g {
    public final cmt a;
    public final String b;

    public y4g(cmt cmtVar, String str) {
        this.a = cmtVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4g)) {
            return false;
        }
        y4g y4gVar = (y4g) obj;
        return u890.j(this.a, y4gVar.a) && u890.j(this.b, y4gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

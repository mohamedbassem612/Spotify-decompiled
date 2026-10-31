package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kdz {
    public final String a;
    public final y6b1 b;

    public kdz(String str, y6b1 y6b1Var) {
        this.a = str;
        this.b = y6b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdz)) {
            return false;
        }
        kdz kdzVar = (kdz) obj;
        return this.a.equals(kdzVar.a) && this.b.equals(kdzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

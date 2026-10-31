package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lwa {
    public final String a;
    public final String b;

    public lwa(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwa)) {
            return false;
        }
        lwa lwaVar = (lwa) obj;
        return u890.j(this.a, lwaVar.a) && u890.j(this.b, lwaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

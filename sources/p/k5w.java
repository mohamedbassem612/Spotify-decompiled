package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k5w {
    public final String a;
    public final String b;

    public k5w(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5w)) {
            return false;
        }
        k5w k5wVar = (k5w) obj;
        return u890.j(this.a, k5wVar.a) && u890.j(this.b, k5wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

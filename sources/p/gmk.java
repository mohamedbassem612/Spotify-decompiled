package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gmk implements omk {
    public final String a;
    public final String b;

    public gmk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmk)) {
            return false;
        }
        gmk gmkVar = (gmk) obj;
        return this.a.equals(gmkVar.a) && this.b.equals(gmkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

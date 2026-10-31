package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u6d {
    public final String a;
    public final String b;

    public u6d(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6d)) {
            return false;
        }
        u6d u6dVar = (u6d) obj;
        return this.a.equals(u6dVar.a) && this.b.equals(u6dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

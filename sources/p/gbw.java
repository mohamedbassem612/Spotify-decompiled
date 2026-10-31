package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gbw {
    public final String a;
    public final String b;

    public gbw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbw)) {
            return false;
        }
        gbw gbwVar = (gbw) obj;
        return u890.j(this.a, gbwVar.a) && u890.j(this.b, gbwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n7z {
    public final String a;
    public final String b;

    public n7z(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7z)) {
            return false;
        }
        n7z n7zVar = (n7z) obj;
        return this.a.equals(n7zVar.a) && this.b.equals(n7zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

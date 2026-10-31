package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x9r {
    public final String a;
    public final String b;

    public x9r(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9r)) {
            return false;
        }
        x9r x9rVar = (x9r) obj;
        return this.a.equals(x9rVar.a) && this.b.equals(x9rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

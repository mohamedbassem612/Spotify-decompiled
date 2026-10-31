package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b6m {
    public final String a;
    public final String b;

    public b6m(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6m)) {
            return false;
        }
        b6m b6mVar = (b6m) obj;
        return this.a.equals(b6mVar.a) && this.b.equals(b6mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

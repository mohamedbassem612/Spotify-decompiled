package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b7k {
    public final String a;

    public b7k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b7k) && this.a.equals(((b7k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

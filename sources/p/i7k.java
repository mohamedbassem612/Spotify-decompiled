package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i7k {
    public final String a;

    public i7k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7k) && u890.j(this.a, ((i7k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

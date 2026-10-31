package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q9k implements u9k {
    public final String a;

    public q9k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q9k) && u890.j(this.a, ((q9k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

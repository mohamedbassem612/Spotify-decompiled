package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q9g {
    public final String a;

    public q9g(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q9g) && u890.j(this.a, ((q9g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

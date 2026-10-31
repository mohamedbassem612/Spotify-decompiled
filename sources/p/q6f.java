package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q6f implements r6f {
    public final String a;

    public q6f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6f) && u890.j(this.a, ((q6f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q5f implements s5f {
    public final String a;

    public q5f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q5f) && u890.j(this.a, ((q5f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

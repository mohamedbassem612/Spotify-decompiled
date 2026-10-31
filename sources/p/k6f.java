package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k6f implements r6f {
    public final String a;

    public k6f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k6f) && u890.j(this.a, ((k6f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

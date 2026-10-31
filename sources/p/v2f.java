package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v2f implements q3f {
    public final String a;

    public v2f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2f) && u890.j(this.a, ((v2f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

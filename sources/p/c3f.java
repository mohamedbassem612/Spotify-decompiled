package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c3f implements q3f {
    public final String a;

    public c3f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3f) && u890.j(this.a, ((c3f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

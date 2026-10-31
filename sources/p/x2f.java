package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x2f implements q3f {
    public final String a;

    public x2f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2f) && u890.j(this.a, ((x2f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

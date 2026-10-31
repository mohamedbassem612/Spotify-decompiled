package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h3f implements q3f {
    public final String a;

    public h3f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3f) && u890.j(this.a, ((h3f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p1e extends q1e {
    public final String a;

    public p1e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1e) && u890.j(this.a, ((p1e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

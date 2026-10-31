package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n1e extends q1e {
    public final String a;

    public n1e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1e) && u890.j(this.a, ((n1e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

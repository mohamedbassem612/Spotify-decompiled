package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uhw implements fiw {
    public final String a;

    public uhw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uhw) && u890.j(this.a, ((uhw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

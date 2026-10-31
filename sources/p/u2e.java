package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u2e implements w2e {
    public final String a;

    public u2e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u2e) && u890.j(this.a, ((u2e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

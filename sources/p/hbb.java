package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hbb implements vbb {
    public final String a;

    public hbb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbb) && u890.j(this.a, ((hbb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

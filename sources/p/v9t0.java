package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v9t0 {
    public final String a;

    public v9t0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9t0) && u890.j(this.a, ((v9t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

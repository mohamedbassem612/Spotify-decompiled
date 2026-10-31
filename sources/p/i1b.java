package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i1b {
    public final String a;

    public i1b(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1b) && u890.j(this.a, ((i1b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

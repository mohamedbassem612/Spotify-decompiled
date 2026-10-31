package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ihc0 {
    public final String a;

    public ihc0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ihc0) && this.a.equals(((ihc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

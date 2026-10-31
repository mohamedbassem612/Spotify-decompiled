package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v9o implements x9o {
    public final boolean a;

    public v9o(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9o) && this.a == ((v9o) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

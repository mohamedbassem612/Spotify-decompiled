package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pi00 {
    public final fgz a;

    public pi00(fgz fgzVar) {
        this.a = fgzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pi00) && this.a.equals(((pi00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

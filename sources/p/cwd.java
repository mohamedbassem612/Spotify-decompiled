package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cwd {
    public final gzd a;

    public cwd(gzd gzdVar) {
        this.a = gzdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwd) && u890.j(this.a, ((cwd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

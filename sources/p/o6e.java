package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o6e implements q6e {
    public final b6e a;

    public o6e(b6e b6eVar) {
        this.a = b6eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6e) && u890.j(this.a, ((o6e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

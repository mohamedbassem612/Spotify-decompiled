package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n0m implements v0m {
    public final wol a;

    public n0m(wol wolVar) {
        this.a = wolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0m) && u890.j(this.a, ((n0m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

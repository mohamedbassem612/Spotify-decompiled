package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m0m {
    public final wol a;

    public m0m(wol wolVar) {
        this.a = wolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0m) && u890.j(this.a, ((m0m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kia1 {
    public final dga1 a;

    public kia1(dga1 dga1Var) {
        this.a = dga1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kia1) && u890.j(this.a, ((kia1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

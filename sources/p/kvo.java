package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kvo implements l9c {
    public final k3h1 a;

    public kvo(k3h1 k3h1Var) {
        this.a = k3h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvo) && this.a.equals(((kvo) obj).a);
    }

    @Override // p.l9c
    public final String getId() {
        return "dsa-banner-section";
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.b) + 1882756385;
    }
}

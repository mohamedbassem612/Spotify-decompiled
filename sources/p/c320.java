package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c320 implements f320 {
    public final zr7 a;

    public c320(zr7 zr7Var) {
        this.a = zr7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c320) && this.a.equals(((c320) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

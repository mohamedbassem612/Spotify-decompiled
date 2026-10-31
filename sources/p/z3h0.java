package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z3h0 implements e4h0 {
    public final boolean a;

    public z3h0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3h0) && this.a == ((z3h0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

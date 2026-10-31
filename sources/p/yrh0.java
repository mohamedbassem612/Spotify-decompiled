package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yrh0 implements fsh0 {
    public final p8i0 a;

    public yrh0(p8i0 p8i0Var) {
        this.a = p8i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yrh0) && this.a == ((yrh0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

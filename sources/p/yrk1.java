package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yrk1 implements qsk1 {
    public final b32 a;

    public yrk1(b32 b32Var) {
        this.a = b32Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yrk1) && this.a.equals(((yrk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ofe0 implements qfe0 {
    public final rfe0 a;

    public ofe0(rfe0 rfe0Var) {
        this.a = rfe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ofe0) && this.a == ((ofe0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

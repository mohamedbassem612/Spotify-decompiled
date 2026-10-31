package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jz21 implements sz21 {
    public final rz21 a;

    public jz21(rz21 rz21Var) {
        this.a = rz21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jz21) && this.a.equals(((jz21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

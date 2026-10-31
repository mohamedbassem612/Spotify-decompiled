package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ly21 extends py21 {
    public final jy21 a;

    public ly21(jy21 jy21Var) {
        this.a = jy21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ly21) && this.a.equals(((ly21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yoc1 extends fsa {
    public final j331 a;

    public yoc1(j331 j331Var) {
        this.a = j331Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yoc1) && this.a.equals(((yoc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

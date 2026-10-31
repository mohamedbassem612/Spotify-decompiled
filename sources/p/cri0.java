package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cri0 {
    public final kri0 a;

    public cri0(kri0 kri0Var) {
        this.a = kri0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cri0) && this.a.equals(((cri0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

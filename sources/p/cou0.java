package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cou0 {
    public final zuc0 a;

    public cou0(zuc0 zuc0Var) {
        this.a = zuc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cou0) && this.a.equals(((cou0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

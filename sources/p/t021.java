package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t021 implements w021 {
    public final j6p1 a;

    public t021(j6p1 j6p1Var) {
        this.a = j6p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t021) && this.a.equals(((t021) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t130 implements u130 {
    public final cob1 a;

    public t130(cob1 cob1Var) {
        this.a = cob1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t130) && this.a == ((t130) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ywe0 {
    public final rf8 a;

    public ywe0(rf8 rf8Var) {
        this.a = rf8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ywe0) && this.a == ((ywe0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

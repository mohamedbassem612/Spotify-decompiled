package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m1h implements v1h {
    public final s2r0 a;

    public m1h(s2r0 s2r0Var) {
        this.a = s2r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1h) && this.a.equals(((m1h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

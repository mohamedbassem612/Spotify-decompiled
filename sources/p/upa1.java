package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class upa1 implements ez00 {
    public final tpa1 a;

    public upa1(tpa1 tpa1Var) {
        this.a = tpa1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof upa1) && this.a.equals(((upa1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

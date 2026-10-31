package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yat0 implements ebt0 {
    public final lbt0 a;

    public yat0(lbt0 lbt0Var) {
        this.a = lbt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yat0) && this.a.equals(((yat0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

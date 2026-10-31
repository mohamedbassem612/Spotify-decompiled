package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c4a1 implements h4a1 {
    public final si61 a;

    public c4a1(si61 si61Var) {
        this.a = si61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c4a1) && this.a.equals(((c4a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

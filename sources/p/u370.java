package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u370 implements z370 {
    public final c380 a;

    public u370(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u370) && u890.j(this.a, ((u370) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

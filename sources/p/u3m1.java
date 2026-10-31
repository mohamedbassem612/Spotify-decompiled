package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u3m1 extends b4m1 {
    public final ws61 a;

    public u3m1(ws61 ws61Var) {
        this.a = ws61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3m1) && this.a == ((u3m1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

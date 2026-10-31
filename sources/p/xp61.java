package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xp61 implements bq61 {
    public final eq61 a;

    public xp61(eq61 eq61Var) {
        this.a = eq61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xp61) && this.a.equals(((xp61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

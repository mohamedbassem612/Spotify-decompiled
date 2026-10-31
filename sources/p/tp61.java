package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tp61 implements bq61 {
    public final zq61 a;

    public tp61(zq61 zq61Var) {
        this.a = zq61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tp61) && this.a.equals(((tp61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

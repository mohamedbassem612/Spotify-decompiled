package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u500 implements p600 {
    public final bq10 a;

    public u500(bq10 bq10Var) {
        this.a = bq10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u500) && this.a.equals(((u500) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

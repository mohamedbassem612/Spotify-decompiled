package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yjk extends jkk {
    public final bqm0 a;

    public yjk(bqm0 bqm0Var) {
        this.a = bqm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yjk) && this.a.equals(((yjk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}

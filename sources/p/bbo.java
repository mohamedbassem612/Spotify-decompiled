package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bbo extends cbo {
    public final svi1 a;

    public bbo(svi1 svi1Var) {
        this.a = svi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbo) && this.a.equals(((bbo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

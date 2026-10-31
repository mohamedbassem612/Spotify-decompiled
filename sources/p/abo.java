package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class abo extends cbo {
    public final plf1 a;

    public abo(plf1 plf1Var) {
        this.a = plf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof abo) && this.a.equals(((abo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

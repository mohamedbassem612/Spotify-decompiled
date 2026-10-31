package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kzh extends uzh {
    public final mb80 a;

    public kzh(mb80 mb80Var) {
        this.a = mb80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kzh) && this.a.equals(((kzh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

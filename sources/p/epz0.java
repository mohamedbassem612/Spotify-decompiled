package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class epz0 extends gpz0 {
    public final re70 a;

    public epz0(re70 re70Var) {
        this.a = re70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof epz0) && this.a.equals(((epz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

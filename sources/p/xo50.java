package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xo50 implements yo50 {
    public final moy0 a;

    public xo50(moy0 moy0Var) {
        this.a = moy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xo50) && this.a.equals(((xo50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

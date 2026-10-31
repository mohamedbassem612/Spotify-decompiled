package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gud extends cud {
    public final rn71 a;

    public gud(rn71 rn71Var) {
        this.a = rn71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gud) && this.a.equals(((gud) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}

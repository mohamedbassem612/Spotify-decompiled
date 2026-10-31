package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mt30 {
    public final on71 a;

    public mt30(on71 on71Var) {
        this.a = on71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mt30) && this.a.equals(((mt30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

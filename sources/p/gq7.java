package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gq7 {
    public final vp7 a;

    public gq7(vp7 vp7Var) {
        this.a = vp7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gq7) && this.a.equals(((gq7) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}

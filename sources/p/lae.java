package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lae implements mae {
    public final boolean a;

    public lae(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lae) && this.a == ((lae) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

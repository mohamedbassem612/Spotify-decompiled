package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class njy {
    public final int a;

    public njy(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof njy) && this.a == ((njy) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Integer.hashCode(this.a) * 961);
    }
}

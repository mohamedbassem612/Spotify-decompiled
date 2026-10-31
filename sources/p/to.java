package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class to implements ap {
    public final ho a;

    public to(ho hoVar) {
        this.a = hoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof to) && this.a.equals(((to) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

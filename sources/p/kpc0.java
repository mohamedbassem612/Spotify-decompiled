package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kpc0 implements mpc0 {
    public final nsn a;

    public kpc0(nsn nsnVar) {
        this.a = nsnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kpc0) && this.a.equals(((kpc0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}

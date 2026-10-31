package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sho implements tho {
    public final jho a = new jho();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sho) && this.a.equals(((sho) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

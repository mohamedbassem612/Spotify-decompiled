package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dn0 {
    public final int a;

    public dn0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dn0) && this.a == ((dn0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sby implements vby {
    public final int a;

    public sby(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sby) && this.a == ((sby) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}

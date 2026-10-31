package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hzy implements ez00 {
    public final int a;

    public hzy(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hzy) && this.a == ((hzy) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}

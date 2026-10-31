package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iam implements ez00 {
    public final int a;

    public iam(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iam) && this.a == ((iam) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}

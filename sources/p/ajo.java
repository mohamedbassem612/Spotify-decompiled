package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ajo extends cjo {
    public final int a;

    public ajo(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajo) && this.a == ((ajo) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}

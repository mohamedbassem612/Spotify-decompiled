package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mgn implements ugn {
    public final int a;

    public mgn(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mgn) && this.a == ((mgn) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

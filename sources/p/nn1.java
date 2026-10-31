package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nn1 {
    public final int a;

    public nn1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nn1) && this.a == ((nn1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}

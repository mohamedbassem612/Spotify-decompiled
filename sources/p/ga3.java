package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ga3 {
    public final int a;

    public ga3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ga3) && this.a == ((ga3) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}

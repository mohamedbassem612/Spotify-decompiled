package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kem {
    public final int a;

    public kem(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kem) && this.a == ((kem) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}

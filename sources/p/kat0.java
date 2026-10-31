package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kat0 implements ebt0 {
    public final int a;

    public kat0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kat0) && this.a == ((kat0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

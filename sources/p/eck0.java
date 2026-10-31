package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eck0 implements qck0 {
    public final int a;

    public eck0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eck0) && this.a == ((eck0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

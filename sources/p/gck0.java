package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gck0 implements qck0 {
    public final int a;

    public gck0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gck0) && this.a == ((gck0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

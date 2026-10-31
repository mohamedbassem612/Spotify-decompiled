package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class be01 implements ee01 {
    public final int a;

    public be01(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be01) && this.a == ((be01) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

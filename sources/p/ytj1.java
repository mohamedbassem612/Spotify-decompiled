package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ytj1 implements cuj1 {
    public final int a;

    public ytj1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytj1) && this.a == ((ytj1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

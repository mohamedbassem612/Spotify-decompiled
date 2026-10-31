package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hm71 extends im71 {
    public final int a;

    public hm71(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hm71) && this.a == ((hm71) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

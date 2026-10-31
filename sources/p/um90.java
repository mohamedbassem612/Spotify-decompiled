package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class um90 {
    public final int a;

    public um90(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof um90) && this.a == ((um90) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + kaa0.f(0, kaa0.f(this.a, Integer.hashCode(0) * 31, 31), 31);
    }
}

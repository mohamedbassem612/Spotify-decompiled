package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e850 {
    public final int a;

    public e850(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e850) && this.a == ((e850) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

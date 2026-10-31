package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e450 implements g450 {
    public final int a;

    public e450(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e450) && this.a == ((e450) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

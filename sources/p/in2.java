package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class in2 {
    public final int a;

    public in2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof in2) && this.a == ((in2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

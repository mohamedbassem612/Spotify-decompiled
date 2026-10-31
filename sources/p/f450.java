package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f450 implements g450 {
    public final int a;

    public f450(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f450) && this.a == ((f450) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

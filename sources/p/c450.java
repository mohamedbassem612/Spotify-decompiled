package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c450 implements g450 {
    public final int a;

    public c450(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c450) && this.a == ((c450) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

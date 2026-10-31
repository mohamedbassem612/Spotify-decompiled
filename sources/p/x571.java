package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x571 implements b671 {
    public final boolean a;

    public x571(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x571) && this.a == ((x571) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

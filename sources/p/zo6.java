package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zo6 implements ez00 {
    public final boolean a;

    public zo6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zo6) && this.a == ((zo6) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

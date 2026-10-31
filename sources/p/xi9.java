package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xi9 implements bj9 {
    public final boolean a;

    public xi9(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xi9) && this.a == ((xi9) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

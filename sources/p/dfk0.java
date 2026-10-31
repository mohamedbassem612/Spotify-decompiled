package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dfk0 implements efk0 {
    public final boolean a;

    public dfk0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dfk0) && this.a == ((dfk0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ed90 extends gd90 {
    public final boolean a;

    public ed90(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed90) && this.a == ((ed90) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

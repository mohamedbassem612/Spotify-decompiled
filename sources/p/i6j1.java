package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i6j1 extends j6j1 {
    public final boolean a;

    public i6j1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6j1) && this.a == ((i6j1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

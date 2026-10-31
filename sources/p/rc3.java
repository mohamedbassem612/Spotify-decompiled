package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rc3 extends uc3 {
    public final boolean a;

    public rc3(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rc3) && this.a == ((rc3) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

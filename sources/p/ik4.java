package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ik4 {
    public final boolean a;

    public ik4(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ik4) && this.a == ((ik4) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

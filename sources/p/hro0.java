package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hro0 implements kro0 {
    public final boolean a;

    public hro0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hro0) && this.a == ((hro0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

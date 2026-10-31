package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iii0 extends kii0 {
    public final boolean a;

    public iii0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iii0) && this.a == ((iii0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

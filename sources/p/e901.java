package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e901 implements i901 {
    public final boolean a;

    public e901(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e901) && this.a == ((e901) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

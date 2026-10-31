package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hmf1 implements mmf1 {
    public final boolean a;

    public hmf1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hmf1) && this.a == ((hmf1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

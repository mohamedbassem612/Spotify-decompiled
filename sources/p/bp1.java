package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bp1 implements cq1 {
    public final boolean a;

    public bp1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bp1) && this.a == ((bp1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(this.a) * 31);
    }
}

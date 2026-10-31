package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ksa0 implements lsa0 {
    public final boolean a;

    public ksa0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ksa0) && this.a == ((ksa0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

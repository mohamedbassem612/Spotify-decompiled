package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kn11 extends pn11 {
    public final boolean a;

    public kn11(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kn11) && this.a == ((kn11) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

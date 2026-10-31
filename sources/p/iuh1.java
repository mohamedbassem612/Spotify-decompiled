package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iuh1 implements juh1 {
    public final boolean a;

    public iuh1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iuh1) && this.a == ((iuh1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

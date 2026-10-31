package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xki0 extends eli0 {
    public final boolean a;

    public xki0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xki0) && this.a == ((xki0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

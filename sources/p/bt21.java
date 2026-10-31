package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bt21 implements dbr0 {
    public final boolean a = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bt21) && this.a == ((bt21) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

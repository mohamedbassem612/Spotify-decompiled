package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u061 {
    public final boolean a;

    public u061(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u061) && this.a == ((u061) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

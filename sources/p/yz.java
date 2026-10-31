package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yz implements k10 {
    public final boolean a;

    public yz(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yz) && this.a == ((yz) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

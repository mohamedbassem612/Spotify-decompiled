package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d0q0 implements e0q0 {
    public final boolean a;

    public d0q0(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0q0) && this.a == ((d0q0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

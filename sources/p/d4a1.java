package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d4a1 implements h4a1 {
    public final boolean a;

    public d4a1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d4a1) && this.a == ((d4a1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

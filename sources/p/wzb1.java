package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wzb1 implements chu {
    public final boolean a;

    public wzb1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wzb1) && this.a == ((wzb1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

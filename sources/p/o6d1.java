package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o6d1 implements v6d1 {
    public final boolean a;

    public o6d1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6d1) && this.a == ((o6d1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

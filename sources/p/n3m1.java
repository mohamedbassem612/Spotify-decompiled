package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n3m1 extends b4m1 {
    public final boolean a;

    public n3m1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3m1) && this.a == ((n3m1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

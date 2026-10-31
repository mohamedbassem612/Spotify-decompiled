package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z9l1 extends bal1 {
    public final boolean a;

    public z9l1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z9l1) && this.a == ((z9l1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, false);
    }
}

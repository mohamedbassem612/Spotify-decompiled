package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j5q0 {
    public final boolean a;

    public j5q0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5q0) && this.a == ((j5q0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

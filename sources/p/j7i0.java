package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j7i0 implements l7i0 {
    public final a9h a;

    public j7i0(a9h a9hVar) {
        this.a = a9hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7i0) && this.a.equals(((j7i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

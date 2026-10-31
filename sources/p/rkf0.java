package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rkf0 implements ukf0 {
    public final a9h a;

    public rkf0(a9h a9hVar) {
        this.a = a9hVar;
    }

    public final a9h a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rkf0) && this.a.equals(((rkf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

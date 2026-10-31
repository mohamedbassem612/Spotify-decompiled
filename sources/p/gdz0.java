package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gdz0 implements idz0 {
    public final Object a;

    public gdz0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gdz0) && this.a.equals(((gdz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

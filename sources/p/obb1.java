package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class obb1 implements rbb1 {
    public final hux a;

    public obb1(hux huxVar) {
        this.a = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof obb1) && u890.j(this.a, ((obb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

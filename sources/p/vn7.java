package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vn7 implements ao7 {
    public final boolean a;

    public vn7(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vn7) && this.a == ((vn7) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

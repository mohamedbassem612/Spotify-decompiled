package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ug20 extends vg20 {
    public final boolean a;

    public ug20(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug20) && this.a == ((ug20) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

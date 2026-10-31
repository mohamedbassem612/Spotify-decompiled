package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iow0 implements ez00 {
    public final boolean a;

    public iow0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iow0) && this.a == ((iow0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

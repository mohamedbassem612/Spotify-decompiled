package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wy31 extends rqg0 {
    public final String f;

    public wy31(String str) {
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy31) && u890.j(this.f, ((wy31) obj).f);
    }

    public final int hashCode() {
        String str = this.f;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public /* synthetic */ wy31() {
        this(null);
    }
}

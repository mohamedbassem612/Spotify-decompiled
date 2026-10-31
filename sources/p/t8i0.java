package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t8i0 {
    public static final t8i0 b = new t8i0("text/*");
    public static final t8i0 c = new t8i0("*/*");
    public final String a;

    public t8i0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8i0)) {
            return false;
        }
        return this.a.equals(((t8i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("MediaType(representation='", this.a, "')");
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r2u0 extends u2u0 {
    public final String a;

    public r2u0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2u0) && this.a.equals(((r2u0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

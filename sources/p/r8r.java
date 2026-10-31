package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r8r implements dbr0 {
    public final String a;

    public r8r(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8r) && this.a.equals(((r8r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

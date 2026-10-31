package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g1j1 {
    public final String a;

    public g1j1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1j1) && this.a.equals(((g1j1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a3q0 {
    public final String a;

    public a3q0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3q0) && this.a.equals(((a3q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

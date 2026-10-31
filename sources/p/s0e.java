package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s0e implements t0e {
    public final String a;

    public s0e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0e) && this.a.equals(((s0e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

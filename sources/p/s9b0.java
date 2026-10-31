package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s9b0 {
    public final String a;

    public s9b0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9b0) && this.a.equals(((s9b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s13 implements t13 {
    public final String a;

    public s13(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s13) && this.a.equals(((s13) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

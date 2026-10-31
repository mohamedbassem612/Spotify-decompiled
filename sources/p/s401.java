package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s401 implements f501 {
    public final String a;

    public s401(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s401) && this.a.equals(((s401) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

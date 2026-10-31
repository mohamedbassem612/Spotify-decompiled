package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s42 {
    public final String a;

    public s42(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s42) && this.a.equals(((s42) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

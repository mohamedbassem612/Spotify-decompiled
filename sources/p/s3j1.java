package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s3j1 implements u3j1 {
    public final String a;

    public s3j1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3j1) && this.a.equals(((s3j1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

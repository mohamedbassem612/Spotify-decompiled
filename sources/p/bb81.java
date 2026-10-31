package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bb81 implements db81 {
    public final String a;

    public bb81(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bb81) && this.a.equals(((bb81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

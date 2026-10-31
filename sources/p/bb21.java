package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bb21 {
    public final String a;

    public bb21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bb21) && this.a.equals(((bb21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

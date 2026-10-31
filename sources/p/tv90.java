package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tv90 implements wv90 {
    public final String a;

    public tv90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv90) && this.a.equals(((tv90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

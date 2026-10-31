package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c58 implements f58 {
    public final String a;

    public c58(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c58) && this.a.equals(((c58) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

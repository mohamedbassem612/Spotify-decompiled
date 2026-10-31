package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b58 implements f58 {
    public final String a;

    public b58(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b58) && this.a.equals(((b58) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

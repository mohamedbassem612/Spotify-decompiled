package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xqg0 {
    public final String a;

    public xqg0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xqg0) && this.a.equals(((xqg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

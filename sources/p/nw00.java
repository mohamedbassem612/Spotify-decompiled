package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nw00 implements ww00 {
    public final String a;

    public nw00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nw00) && this.a.equals(((nw00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

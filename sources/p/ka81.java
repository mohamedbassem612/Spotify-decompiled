package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ka81 implements xpx0 {
    public final String a;

    public ka81(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ka81) && u890.j(this.a, ((ka81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

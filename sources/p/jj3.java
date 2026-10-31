package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jj3 extends dsa0 {
    public final String c;

    public jj3(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jj3) && u890.j(this.c, ((jj3) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

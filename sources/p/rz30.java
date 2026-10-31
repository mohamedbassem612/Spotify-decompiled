package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rz30 extends dug {
    public final String c;

    public rz30(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rz30) && u890.j(this.c, ((rz30) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

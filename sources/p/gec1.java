package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gec1 extends ujo1 {
    public final String c;

    public gec1(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gec1) && u890.j(this.c, ((gec1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

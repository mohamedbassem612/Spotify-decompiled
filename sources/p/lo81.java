package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lo81 extends s9p1 {
    public final String c;

    public lo81(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo81) && u890.j(this.c, ((lo81) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

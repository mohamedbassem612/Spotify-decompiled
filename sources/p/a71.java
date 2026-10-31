package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a71 extends k4p1 {
    public final String c;

    public a71(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a71) && u890.j(this.c, ((a71) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j920 extends m0p1 {
    public final String c;

    public j920(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j920) && u890.j(this.c, ((j920) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

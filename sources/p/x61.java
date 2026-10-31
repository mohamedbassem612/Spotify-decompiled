package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x61 extends k4p1 {
    public final String c;

    public x61(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x61) && u890.j(this.c, ((x61) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

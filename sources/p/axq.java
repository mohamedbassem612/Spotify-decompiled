package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class axq extends f2p1 {
    public final String c;

    public axq(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof axq) && u890.j(this.c, ((axq) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

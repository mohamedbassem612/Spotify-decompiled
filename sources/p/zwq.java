package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zwq extends f2p1 {
    public final String c;

    public zwq(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zwq) && u890.j(this.c, ((zwq) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

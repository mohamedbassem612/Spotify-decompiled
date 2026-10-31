package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ya41 extends ha71 {
    public final String c;

    public ya41(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ya41) && u890.j(this.c, ((ya41) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

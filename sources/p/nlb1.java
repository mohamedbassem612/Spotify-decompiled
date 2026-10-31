package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nlb1 extends mlb1 {
    public final String c;

    public nlb1(String str) {
        super(true, null);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nlb1) && u890.j(this.c, ((nlb1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

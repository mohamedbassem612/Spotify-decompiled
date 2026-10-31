package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bkn0 extends vvm1 {
    public final String c;

    public bkn0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bkn0) && u890.j(this.c, ((bkn0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ucc1 extends xcc1 {
    public final String c;

    public ucc1(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ucc1) && this.c.equals(((ucc1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

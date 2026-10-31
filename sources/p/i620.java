package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i620 extends azo1 {
    public final String c;

    public i620(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i620) && u890.j(this.c, ((i620) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String v() {
        return this.c;
    }
}

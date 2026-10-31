package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ake0 extends d9p1 {
    public final String c;

    public ake0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ake0) && u890.j(this.c, ((ake0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

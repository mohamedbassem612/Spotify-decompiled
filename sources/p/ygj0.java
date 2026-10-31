package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ygj0 extends nyo1 {
    public final String c;

    public ygj0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygj0) && u890.j(this.c, ((ygj0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ig8 extends byo1 {
    public final String c;

    public ig8(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ig8) && u890.j(this.c, ((ig8) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String u() {
        return this.c;
    }
}

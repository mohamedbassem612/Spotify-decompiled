package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class og8 extends byo1 {
    public final String c;

    public og8(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof og8) && u890.j(this.c, ((og8) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

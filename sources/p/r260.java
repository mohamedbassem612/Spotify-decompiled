package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r260 extends vgo1 {
    public final String c;

    public r260(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r260) && u890.j(this.c, ((r260) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

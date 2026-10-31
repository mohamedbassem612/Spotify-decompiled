package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r350 extends z1a1 {
    public final String c;

    public r350(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r350) && u890.j(this.c, ((r350) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

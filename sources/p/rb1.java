package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rb1 extends d5p1 {
    public final String c;

    public rb1(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rb1) && u890.j(this.c, ((rb1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

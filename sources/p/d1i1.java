package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d1i1 extends mmo1 {
    public final md c;

    public d1i1(md mdVar) {
        this.c = mdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1i1) && u890.j(this.c, ((d1i1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

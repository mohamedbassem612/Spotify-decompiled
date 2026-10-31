package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pxt implements sxt {
    public final oxt a;
    public final bxt b;
    public final nxt c;

    public pxt(oxt oxtVar, bxt bxtVar, nxt nxtVar) {
        this.a = oxtVar;
        this.b = bxtVar;
        this.c = nxtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxt)) {
            return false;
        }
        pxt pxtVar = (pxt) obj;
        return this.a == pxtVar.a && this.b.equals(pxtVar.b) && this.c.equals(pxtVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}

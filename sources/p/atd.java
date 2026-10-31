package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class atd {
    public final k1r a;
    public final k1r b;
    public final k1r c;

    public atd(k1r k1rVar, k1r k1rVar2, k1r k1rVar3) {
        this.a = k1rVar;
        this.b = k1rVar2;
        this.c = k1rVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atd)) {
            return false;
        }
        atd atdVar = (atd) obj;
        return this.a.equals(atdVar.a) && this.b.equals(atdVar.b) && this.c.equals(atdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}

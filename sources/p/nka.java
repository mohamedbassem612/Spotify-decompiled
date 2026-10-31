package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nka {
    public final fla a;
    public final gla b;
    public final hla c;

    public nka(fla flaVar, gla glaVar, hla hlaVar) {
        this.a = flaVar;
        this.b = glaVar;
        this.c = hlaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nka)) {
            return false;
        }
        nka nkaVar = (nka) obj;
        return this.a == nkaVar.a && this.b == nkaVar.b && this.c == nkaVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}

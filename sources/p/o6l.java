package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o6l {
    public final String a;
    public final iu30 b;
    public final vu30 c;

    public o6l(String str, iu30 iu30Var, vu30 vu30Var) {
        this.a = str;
        this.b = iu30Var;
        this.c = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6l)) {
            return false;
        }
        o6l o6lVar = (o6l) obj;
        return this.a.equals(o6lVar.a) && this.b.equals(o6lVar.b) && this.c.equals(o6lVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ktd.g(this.b, this.a.hashCode() * 31, 31);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a1o implements c1o {
    public final bxn a;
    public final bxn b;

    public a1o(bxn bxnVar, bxn bxnVar2) {
        this.a = bxnVar;
        this.b = bxnVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1o)) {
            return false;
        }
        a1o a1oVar = (a1o) obj;
        return u890.j(this.a, a1oVar.a) && u890.j(this.b, a1oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

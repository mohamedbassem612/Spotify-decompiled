package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b1h extends f1h {
    public final nb6 b;
    public final int c;

    public b1h(nb6 nb6Var, int i) {
        super(c1h.d);
        this.b = nb6Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1h)) {
            return false;
        }
        b1h b1hVar = (b1h) obj;
        return u890.j(this.b, b1hVar.b) && this.c == b1hVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}

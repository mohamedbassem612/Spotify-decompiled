package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class eof {
    public final String a;
    public final t7q0 b;
    public final vub1 c;

    public eof(String str, t7q0 t7q0Var, vub1 vub1Var) {
        this.a = str;
        this.b = t7q0Var;
        this.c = vub1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eof)) {
            return false;
        }
        eof eofVar = (eof) obj;
        return u890.j(this.a, eofVar.a) && u890.j(this.b, eofVar.b) && this.c.equals(eofVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}

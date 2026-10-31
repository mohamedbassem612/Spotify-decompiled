package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wpm implements zpm {
    public final w4i1 a;
    public final ctf b;
    public final tol c;

    public wpm(w4i1 w4i1Var, ctf ctfVar, tol tolVar) {
        this.a = w4i1Var;
        this.b = ctfVar;
        this.c = tolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpm)) {
            return false;
        }
        wpm wpmVar = (wpm) obj;
        return u890.j(this.a, wpmVar.a) && u890.j(this.b, wpmVar.b) && u890.j(this.c, wpmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}

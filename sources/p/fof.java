package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fof {
    public final String a;
    public final t7q0 b;
    public final jof c;

    public fof(String str, t7q0 t7q0Var, jof jofVar) {
        this.a = str;
        this.b = t7q0Var;
        this.c = jofVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fof)) {
            return false;
        }
        fof fofVar = (fof) obj;
        return u890.j(this.a, fofVar.a) && u890.j(this.b, fofVar.b) && this.c.equals(fofVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}

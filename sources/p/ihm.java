package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ihm {
    public final b0o1 a;
    public final hhm b;
    public final ghm c;
    public final iu30 d;

    public ihm(b0o1 b0o1Var, hhm hhmVar, ghm ghmVar, iu30 iu30Var) {
        this.a = b0o1Var;
        this.b = hhmVar;
        this.c = ghmVar;
        this.d = iu30Var;
    }

    public static ihm a(ihm ihmVar, iu30 iu30Var) {
        return new ihm(ihmVar.a, ihmVar.b, ihmVar.c, iu30Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihm)) {
            return false;
        }
        ihm ihmVar = (ihm) obj;
        return u890.j(this.a, ihmVar.a) && this.b == ihmVar.b && u890.j(this.c, ihmVar.c) && u890.j(this.d, ihmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public /* synthetic */ ihm(b0o1 b0o1Var, ghm ghmVar, iu30 iu30Var) {
        this(b0o1Var, hhm.a, ghmVar, iu30Var);
    }
}

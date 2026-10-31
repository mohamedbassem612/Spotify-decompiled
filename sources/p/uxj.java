package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uxj {
    public final f4q a;
    public final hwe1 b;
    public final i8h1 c;
    public final l6h1 d;

    public uxj(f4q f4qVar, hwe1 hwe1Var, i8h1 i8h1Var, l6h1 l6h1Var) {
        this.a = f4qVar;
        this.b = hwe1Var;
        this.c = i8h1Var;
        this.d = l6h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxj)) {
            return false;
        }
        uxj uxjVar = (uxj) obj;
        return u890.j(this.a, uxjVar.a) && u890.j(this.b, uxjVar.b) && u890.j(this.c, uxjVar.c) && u890.j(this.d, uxjVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}

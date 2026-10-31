package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zv implements bw {
    public final ai8 a;
    public final yv b;

    public zv(ai8 ai8Var, yv yvVar) {
        this.a = ai8Var;
        this.b = yvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv)) {
            return false;
        }
        zv zvVar = (zv) obj;
        return u890.j(this.a, zvVar.a) && u890.j(this.b, zvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

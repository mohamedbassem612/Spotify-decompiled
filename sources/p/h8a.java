package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h8a {
    public final z7a a;
    public final kly0 b;
    public final kly0 c;

    public h8a(z7a z7aVar, kly0 kly0Var, kly0 kly0Var2) {
        this.a = z7aVar;
        this.b = kly0Var;
        this.c = kly0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8a)) {
            return false;
        }
        h8a h8aVar = (h8a) obj;
        return u890.j(this.a, h8aVar.a) && this.b.equals(h8aVar.b) && this.c.equals(h8aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c4o {
    public final String a;
    public final a4o b;

    public c4o(String str, a4o a4oVar) {
        this.a = str;
        this.b = a4oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4o)) {
            return false;
        }
        c4o c4oVar = (c4o) obj;
        return u890.j(this.a, c4oVar.a) && u890.j(this.b, c4oVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        a4o a4oVar = this.b;
        return iHashCode + (a4oVar == null ? 0 : a4oVar.hashCode());
    }
}

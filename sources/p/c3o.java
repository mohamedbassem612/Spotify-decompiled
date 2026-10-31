package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c3o {
    public final String a;
    public final z0i b;

    public c3o(String str, z0i z0iVar) {
        this.a = str;
        this.b = z0iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3o)) {
            return false;
        }
        c3o c3oVar = (c3o) obj;
        return u890.j(this.a, c3oVar.a) && u890.j(this.b, c3oVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        z0i z0iVar = this.b;
        return iHashCode + (z0iVar != null ? z0iVar.hashCode() : 0);
    }
}

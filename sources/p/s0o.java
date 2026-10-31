package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s0o {
    public final String a;
    public final p0o b;
    public final r0o c;

    public s0o(String str, p0o p0oVar, r0o r0oVar) {
        this.a = str;
        this.b = p0oVar;
        this.c = r0oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0o)) {
            return false;
        }
        s0o s0oVar = (s0o) obj;
        return u890.j(this.a, s0oVar.a) && u890.j(this.b, s0oVar.b) && u890.j(this.c, s0oVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        p0o p0oVar = this.b;
        int iHashCode2 = (iHashCode + (p0oVar == null ? 0 : p0oVar.hashCode())) * 31;
        r0o r0oVar = this.c;
        return iHashCode2 + (r0oVar != null ? r0oVar.hashCode() : 0);
    }
}

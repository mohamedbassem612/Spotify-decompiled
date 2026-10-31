package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eyc implements z0i {
    public final String a;
    public final hux b;
    public final z0i c;
    public final String d;
    public final String e;

    public eyc(String str, hux huxVar, z0i z0iVar, String str2, String str3) {
        this.a = str;
        this.b = huxVar;
        this.c = z0iVar;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyc)) {
            return false;
        }
        eyc eycVar = (eyc) obj;
        return this.a.equals(eycVar.a) && u890.j(this.b, eycVar.b) && u890.j(this.c, eycVar.c) && this.d.equals(eycVar.d) && this.e.equals(eycVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hux huxVar = this.b;
        int iHashCode2 = (iHashCode + (huxVar == null ? 0 : huxVar.hashCode())) * 31;
        z0i z0iVar = this.c;
        return this.e.hashCode() + cy30.d((iHashCode2 + (z0iVar != null ? z0iVar.hashCode() : 0)) * 31, 31, this.d);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gxy {
    public final String a;
    public final String b;
    public final lxy c;
    public final b2a d;
    public final boolean e;
    public final kxy f;

    public gxy(String str, String str2, lxy lxyVar, b2a b2aVar, boolean z, kxy kxyVar) {
        this.a = str;
        this.b = str2;
        this.c = lxyVar;
        this.d = b2aVar;
        this.e = z;
        this.f = kxyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxy)) {
            return false;
        }
        gxy gxyVar = (gxy) obj;
        return u890.j(this.a, gxyVar.a) && u890.j(this.b, gxyVar.b) && this.c == gxyVar.c && u890.j(this.d, gxyVar.d) && this.e == gxyVar.e && this.f.equals(gxyVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        b2a b2aVar = this.d;
        return this.f.hashCode() + xcg1.g((iHashCode2 + (b2aVar != null ? b2aVar.a.hashCode() : 0)) * 31, 31, this.e);
    }
}

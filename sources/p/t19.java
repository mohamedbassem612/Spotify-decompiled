package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t19 {
    public final String a;
    public final String b;
    public final String c;
    public final bg11 d;

    public t19(String str, String str2, String str3, bg11 bg11Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bg11Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t19)) {
            return false;
        }
        t19 t19Var = (t19) obj;
        Object obj2 = qum1.a;
        return obj2.equals(obj2) && this.a.equals(t19Var.a) && this.b.equals(t19Var.b) && this.c.equals(t19Var.c) && z1p1.j(this.d, t19Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((((qum1.a.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(qum1.a);
        String strValueOf2 = String.valueOf(this.d);
        StringBuilder sbN = gvg.n("PodcastPage{id=", strValueOf, ", title=", this.a, ", emptyTitle=");
        bb00.j(sbN, this.b, ", emptySubtitle=, emptyActionText=", this.c, ", acceptLinkTypes=");
        return l1d.n(strValueOf2, "}", sbN);
    }
}

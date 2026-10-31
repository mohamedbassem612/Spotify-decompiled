package p;

import j$.time.Instant;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class na81 {
    public final String a;
    public final String b;
    public final String c;
    public final ah40 d;
    public final Instant e;
    public final gcz f;

    public na81(String str, String str2, String str3, ah40 ah40Var, Instant instant, gcz gczVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ah40Var;
        this.e = instant;
        this.f = gczVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na81)) {
            return false;
        }
        na81 na81Var = (na81) obj;
        return this.a.equals(na81Var.a) && u890.j(this.b, na81Var.b) && u890.j(this.c, na81Var.c) && this.d.equals(na81Var.d) && this.e.equals(na81Var.e) && u890.j(this.f, na81Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        gcz gczVar = this.f;
        return iHashCode3 + (gczVar != null ? gczVar.hashCode() : 0);
    }
}

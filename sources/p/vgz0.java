package p;

import j$.time.LocalDateTime;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vgz0 {
    public final String a;
    public final String b;
    public final String c;
    public final LocalDateTime d;
    public final String e;
    public final Boolean f;

    public vgz0(String str, String str2, String str3, LocalDateTime localDateTime, String str4, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = localDateTime;
        this.e = str4;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgz0)) {
            return false;
        }
        vgz0 vgz0Var = (vgz0) obj;
        return u890.j(this.a, vgz0Var.a) && u890.j(this.b, vgz0Var.b) && u890.j(this.c, vgz0Var.c) && u890.j(this.d, vgz0Var.d) && u890.j(this.e, vgz0Var.e) && u890.j(this.f, vgz0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LocalDateTime localDateTime = this.d;
        int iHashCode4 = (iHashCode3 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f;
        return Boolean.hashCode(true) + ((iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 31);
    }
}

package p;

import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s6n1 {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Long j;

    public /* synthetic */ s6n1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, int i) {
        this((Integer) 0, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & SemanticState.Focused) != 0 ? null : str7, (i & SemanticState.Hidden) != 0 ? "" : str8, (i & 512) != 0 ? null : l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6n1)) {
            return false;
        }
        s6n1 s6n1Var = (s6n1) obj;
        return u890.j(this.a, s6n1Var.a) && u890.j(this.b, s6n1Var.b) && u890.j(this.c, s6n1Var.c) && u890.j(this.d, s6n1Var.d) && u890.j(this.e, s6n1Var.e) && u890.j(this.f, s6n1Var.f) && u890.j(this.g, s6n1Var.g) && u890.j(this.h, s6n1Var.h) && u890.j(this.i, s6n1Var.i) && u890.j(this.j, s6n1Var.j);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l = this.j;
        return iHashCode9 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceIds(id=");
        sb.append(this.a);
        sb.append(", deviceId=");
        sb.append(this.b);
        sb.append(", imei=");
        bb00.j(sb, this.c, ", imsi=", this.d, ", bluetoothMAC=");
        bb00.j(sb, this.e, ", wiFiMAC=", this.f, ", androidId=");
        bb00.j(sb, this.g, ", mediaDrmId=", this.h, ", deviceIdProvider=");
        sb.append(this.i);
        sb.append(", createdAt=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

    public s6n1(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = l;
    }
}

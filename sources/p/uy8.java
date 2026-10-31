package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uy8 extends vin {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final uin k;
    public final ain l;
    public final xhn m;

    public uy8(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, uin uinVar, ain ainVar, xhn xhnVar) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = uinVar;
        this.l = ainVar;
        this.m = xhnVar;
    }

    @Override // p.vin
    public final ty8 a() {
        ty8 ty8Var = new ty8();
        ty8Var.a = this.b;
        ty8Var.b = this.c;
        ty8Var.c = this.d;
        ty8Var.d = this.e;
        ty8Var.e = this.f;
        ty8Var.f = this.g;
        ty8Var.g = this.h;
        ty8Var.h = this.i;
        ty8Var.i = this.j;
        ty8Var.j = this.k;
        ty8Var.k = this.l;
        ty8Var.l = this.m;
        ty8Var.m = (byte) 1;
        return ty8Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vin) {
            uy8 uy8Var = (uy8) ((vin) obj);
            if (this.b.equals(uy8Var.b) && this.c.equals(uy8Var.c) && this.d == uy8Var.d && this.e.equals(uy8Var.e)) {
                String str = uy8Var.f;
                String str2 = this.f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = uy8Var.g;
                    String str4 = this.g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = uy8Var.h;
                        String str6 = this.h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.i.equals(uy8Var.i) && this.j.equals(uy8Var.j)) {
                                uin uinVar = uy8Var.k;
                                uin uinVar2 = this.k;
                                if (uinVar2 != null ? uinVar2.equals(uinVar) : uinVar == null) {
                                    ain ainVar = uy8Var.l;
                                    ain ainVar2 = this.l;
                                    if (ainVar2 != null ? ainVar2.equals(ainVar) : ainVar == null) {
                                        xhn xhnVar = uy8Var.m;
                                        xhn xhnVar2 = this.m;
                                        if (xhnVar2 != null ? xhnVar2.equals(xhnVar) : xhnVar == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        uin uinVar = this.k;
        int iHashCode5 = (iHashCode4 ^ (uinVar == null ? 0 : uinVar.hashCode())) * 1000003;
        ain ainVar = this.l;
        int iHashCode6 = (iHashCode5 ^ (ainVar == null ? 0 : ainVar.hashCode())) * 1000003;
        xhn xhnVar = this.m;
        return iHashCode6 ^ (xhnVar != null ? xhnVar.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}

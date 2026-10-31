package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class s1u {
    public static final r1u Companion = new r1u();
    public static final znb0[] g = {null, null, null, null, null, dm5.S(2, u6t.S0)};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Map f;

    public /* synthetic */ s1u(int i, String str, String str2, String str3, String str4, String str5, Map map) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = b7x.a;
        } else {
            this.f = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1u)) {
            return false;
        }
        s1u s1uVar = (s1u) obj;
        return u890.j(this.a, s1uVar.a) && u890.j(this.b, s1uVar.b) && u890.j(this.c, s1uVar.c) && u890.j(this.d, s1uVar.d) && u890.j(this.e, s1uVar.e) && u890.j(this.f, s1uVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return this.f.hashCode() + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }
}

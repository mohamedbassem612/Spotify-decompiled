package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zwo0 implements eyo0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public zwo0(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final List a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwo0)) {
            return false;
        }
        zwo0 zwo0Var = (zwo0) obj;
        return this.a.equals(zwo0Var.a) && this.b.equals(zwo0Var.b) && u890.j(this.c, zwo0Var.c) && u890.j(this.d, zwo0Var.d) && this.e.equals(zwo0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}

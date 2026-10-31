package p;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mzv0 {
    public final String a;
    public final String b;
    public final LocalDate c;
    public final int d;
    public final String e;
    public final String f;

    public mzv0(String str, String str2, LocalDate localDate, int i, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = localDate;
        this.d = i;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzv0)) {
            return false;
        }
        mzv0 mzv0Var = (mzv0) obj;
        return this.a.equals(mzv0Var.a) && u890.j(this.b, mzv0Var.b) && this.c.equals(mzv0Var.c) && this.d == mzv0Var.d && this.e.equals(mzv0Var.e) && u890.j(this.f, mzv0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d(kaa0.f(this.d, (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31, this.e);
        String str2 = this.f;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}

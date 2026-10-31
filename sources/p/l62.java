package p;

import com.spotify.nowplayingmodes.adsmode.data.AdsModeModel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l62 implements ki0 {
    public final String N0;
    public final y031 O0;
    public final n860 P0;
    public final int Q0;
    public final AdsModeModel.Format R0;
    public final AdsModeModel.Product S0;
    public final boolean T0;
    public final cw0 U0;
    public final String V0;
    public final String X;
    public final int Y;
    public final ti Z;
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String t;

    public l62(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ti tiVar, String str11, y031 y031Var, n860 n860Var, int i2, AdsModeModel.Format format, AdsModeModel.Product product, boolean z, cw0 cw0Var, String str12) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.t = str9;
        this.X = str10;
        this.Y = i;
        this.Z = tiVar;
        this.N0 = str11;
        this.O0 = y031Var;
        this.P0 = n860Var;
        this.Q0 = i2;
        this.R0 = format;
        this.S0 = product;
        this.T0 = z;
        this.U0 = cw0Var;
        this.V0 = str12;
    }

    public final String a() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l62)) {
            return false;
        }
        l62 l62Var = (l62) obj;
        return this.a == l62Var.a && this.b.equals(l62Var.b) && u890.j(this.c, l62Var.c) && this.d.equals(l62Var.d) && this.e.equals(l62Var.e) && this.f.equals(l62Var.f) && this.g.equals(l62Var.g) && u890.j(this.h, l62Var.h) && u890.j(this.i, l62Var.i) && u890.j(this.t, l62Var.t) && u890.j(this.X, l62Var.X) && this.Y == l62Var.Y && this.Z.equals(l62Var.Z) && this.N0.equals(l62Var.N0) && this.O0.equals(l62Var.O0) && this.P0.equals(l62Var.P0) && this.Q0 == l62Var.Q0 && this.R0 == l62Var.R0 && this.S0 == l62Var.S0 && this.T0 == l62Var.T0 && this.U0.equals(l62Var.U0) && this.V0.equals(l62Var.V0);
    }

    public final String g() {
        return this.h;
    }

    public final String h() {
        return this.X;
    }

    public final int hashCode() {
        return this.V0.hashCode() + ((this.U0.hashCode() + xcg1.g((this.S0.hashCode() + ((this.R0.hashCode() + ab80.k(this.Q0, (this.P0.hashCode() + ((this.O0.hashCode() + cy30.d((this.Z.hashCode() + ab80.k(this.Y, cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.t), 31, this.X), 31)) * 31, 31, this.N0)) * 31)) * 31, 31)) * 31)) * 31, 31, this.T0)) * 31);
    }

    public final String j() {
        return this.b;
    }

    public final String k() {
        return this.i;
    }
}

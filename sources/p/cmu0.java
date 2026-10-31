package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cmu0 implements oim {
    public static final Parcelable.Creator<cmu0> CREATOR = new brt0((byte) 20);
    public final bjm X;
    public final lik1 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final String t;

    public cmu0(lik1 lik1Var, boolean z, boolean z2, boolean z3, String str, String str2, String str3, boolean z4, boolean z5, String str4) {
        this.a = lik1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = z4;
        this.i = z5;
        this.t = str4;
        this.X = new bjm(4, str2, str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmu0)) {
            return false;
        }
        cmu0 cmu0Var = (cmu0) obj;
        return u890.j(this.a, cmu0Var.a) && this.b == cmu0Var.b && this.c == cmu0Var.c && this.d == cmu0Var.d && u890.j(this.e, cmu0Var.e) && u890.j(this.f, cmu0Var.f) && u890.j(this.g, cmu0Var.g) && this.h == cmu0Var.h && this.i == cmu0Var.i && u890.j(this.t, cmu0Var.t);
    }

    public final bjm getTarget() {
        return this.X;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(this.a.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iG2 = xcg1.g(xcg1.g(cy30.d(cy30.d((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str2 = this.t;
        return iG2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.t);
    }
}

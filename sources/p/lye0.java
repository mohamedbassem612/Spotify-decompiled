package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lye0 implements Parcelable {
    public static final Parcelable.Creator<lye0> CREATOR = new rwe0((byte) 3);
    public final String a;
    public final String b;
    public final zzy c;
    public final Boolean d;
    public final Integer e;
    public final boolean f;
    public final lik1 g;
    public final lik1 h;

    public /* synthetic */ lye0(String str, String str2, zzy zzyVar, Boolean bool, Integer num, boolean z) {
        this(str, str2, zzyVar, bool, num, z, cfm0.i("spotify:internal:parental-control:login-different-device:", str, nik1.p0), cfm0.i("spotify:internal:parental-control:login-current-device:", str, nik1.o0));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lye0)) {
            return false;
        }
        lye0 lye0Var = (lye0) obj;
        return u890.j(this.a, lye0Var.a) && u890.j(this.b, lye0Var.b) && u890.j(this.c, lye0Var.c) && u890.j(this.d, lye0Var.d) && u890.j(this.e, lye0Var.e) && this.f == lye0Var.f && u890.j(this.g, lye0Var.g) && u890.j(this.h, lye0Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        Boolean bool = this.d;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.e;
        return this.h.a.hashCode() + cy30.d(xcg1.g((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f), 31, this.g.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        Boolean bool = this.d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
    }

    public lye0(String str, String str2, zzy zzyVar, Boolean bool, Integer num, boolean z, lik1 lik1Var, lik1 lik1Var2) {
        this.a = str;
        this.b = str2;
        this.c = zzyVar;
        this.d = bool;
        this.e = num;
        this.f = z;
        this.g = lik1Var;
        this.h = lik1Var2;
    }
}

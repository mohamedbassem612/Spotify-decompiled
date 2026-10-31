package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k1z0 implements Parcelable {
    public static final Parcelable.Creator<k1z0> CREATOR = new j1z0(0);
    public final String a;
    public final String b;
    public final x3z0 c;
    public final hh5 d;
    public final long e;
    public final String f;
    public final eh5 g;
    public final String h;

    public k1z0(String str, String str2, x3z0 x3z0Var, hh5 hh5Var, long j, String str3, eh5 eh5Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = x3z0Var;
        this.d = hh5Var;
        this.e = j;
        this.f = str3;
        this.g = eh5Var;
        this.h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1z0)) {
            return false;
        }
        k1z0 k1z0Var = (k1z0) obj;
        return u890.j(this.a, k1z0Var.a) && u890.j(this.b, k1z0Var.b) && u890.j(this.c, k1z0Var.c) && u890.j(this.d, k1z0Var.d) && this.e == k1z0Var.e && u890.j(this.f, k1z0Var.f) && u890.j(this.g, k1z0Var.g) && u890.j(this.h, k1z0Var.h);
    }

    public final int hashCode() {
        int iF = cy30.f((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, this.e, 31);
        String str = this.f;
        int iHashCode = (this.g.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeLong(this.e);
        parcel.writeString(this.f);
        this.g.writeToParcel(parcel, i);
        parcel.writeString(this.h);
    }
}

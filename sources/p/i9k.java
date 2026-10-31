package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i9k implements oim {
    public static final Parcelable.Creator<i9k> CREATOR = new v6h((byte) 16);
    public final lik1 a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final bjm h;

    public i9k(lik1 lik1Var, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = lik1Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = new bjm(4, str2, str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9k)) {
            return false;
        }
        i9k i9kVar = (i9k) obj;
        return u890.j(this.a, i9kVar.a) && u890.j(this.b, i9kVar.b) && u890.j(this.c, i9kVar.c) && u890.j(this.d, i9kVar.d) && this.e == i9kVar.e && this.f == i9kVar.f && this.g == i9kVar.g;
    }

    public final bjm getTarget() {
        return this.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(this.a.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
